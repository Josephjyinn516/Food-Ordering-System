/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author tanji
 */
public class VBeveragesFileHandle {
    
    public static boolean createBeverageData(String filePath, Beverages beverage) {
        try (FileWriter fileWriter = new FileWriter(filePath, true);
             BufferedWriter bw = new BufferedWriter(fileWriter)) {
            bw.write(beverage.getItemID() + "," + beverage.getName() + "," + beverage.getPrice() + "," + beverage.getDescription() + "\n");
            bw.close();
            return true; // Data saved successfully
        } catch (IOException ex) {
            ex.printStackTrace();
            return false; // Error occurred while saving data
        }
    }
    
    public static ArrayList<Beverages> readBeveragesData(String filePath) {
        ArrayList<Beverages> beverage = new ArrayList<>();

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    String itemIdStr = data[0];
                    String name = data[1];
                    String priceStr = data[2];
                    String Description = data[3];
                    int itemIdInt = Integer.parseInt(itemIdStr);
                    double priceDb = Double.parseDouble(priceStr);
                    
                    beverage.add(new Beverages(itemIdInt, name, priceDb, Description));
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return beverage;
    }
    
    public static boolean deleteBeveragesData(String filePath, String beveragesNameToDelete) {
        try {
            File f = new File(filePath);
            File tempFile = new File("D:\\One drive\\OneDrive - Asia Pacific University\\APU\\Year 2\\S1\\Object Oriented Development with Java\\Group Assignment\\Group Assignment- vendor\\src\\File\\temp.txt");
            BufferedReader reader = new BufferedReader(new FileReader(f));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            boolean deleted = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 1 && data[1].equals(beveragesNameToDelete)) {
                    // Skip the line (delete data)
                    deleted = true;
                } else {
                    writer.write(line + System.lineSeparator());
                }
            }

            reader.close();
            writer.close();

            if (deleted) {
                if (f.delete() && tempFile.renameTo(f)) {
                    return true; // Data removed successfully
                } else {
                    return false; // Error renaming the temporary file
                }
            } else {
                return false; // Data not found for deletion
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return false; // Error occurred
        }
    }
    
    public static boolean updateBeveragesData(String filePath, ArrayList<Beverages> beverages) {
        if (beverages.isEmpty()){
            return true;
        }
        try (FileWriter fileWriter = new FileWriter(filePath);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            for (Beverages i : beverages) {
                writer.write(i.getItemID() + "," + i.getName() + "," + i.getPrice() + "," + i.getDescription() + "\n");
            }
            return true; // Data saved successfully
        } catch (IOException ex) {
            ex.printStackTrace();
            return false; // Error occurred while saving data
        }
    }
}
