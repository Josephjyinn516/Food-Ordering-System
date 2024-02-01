/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.BufferedWriter;
import java.io.FileWriter;
import Class.Vendor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Vendor_FileHandling {
    public static boolean createVendorData(String filePath, Vendor vendor) {
        try (FileWriter fileWriter = new FileWriter(filePath, true);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write(vendor.getCafeteriaName() + "," + vendor.getEmail() + "," + vendor.getPhoneNumber() + "," + vendor.getPassword() + "\n");
            return true; // Data saved successfully
        } catch (IOException ex) {
            ex.printStackTrace();
            return false; // Error occurred while saving data
        }
    }
    
    public static ArrayList<Vendor> readVendorData(String filePath) {
        ArrayList<Vendor> vendors = new ArrayList<>();

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    String cafeteriaName = data[0];
                    String email = data[1];
                    String phoneNumber = data[2];
                    String password = data[3];
                    vendors.add(new Vendor(cafeteriaName, email, phoneNumber, password));
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return vendors;
    }
    
    public static boolean updateVendorData(String filePath, ArrayList<Vendor> vendors) {
        if (vendors.isEmpty()){
            return true;
        }
        try (FileWriter fileWriter = new FileWriter(filePath);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            for (Vendor vendor : vendors) {
                writer.write(vendor.getCafeteriaName() + "," + vendor.getEmail() + "," + vendor.getPhoneNumber() + "," + vendor.getPassword() + "\n");
            }
            return true; // Data saved successfully
        } catch (IOException ex) {
            ex.printStackTrace();
            return false; // Error occurred while saving data
        }
    }
    
    public static boolean deleteVendorData(String filePath, String cafeteriaNameToDelete) {
        try {
            File inputFile = new File(filePath);
            File tempFile = new File("temp.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            boolean deleted = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 1 && data[0].equals(cafeteriaNameToDelete)) {
                    // Skip the line (delete data)
                    deleted = true;
                } else {
                    writer.write(line + System.lineSeparator());
                }
            }

            reader.close();
            writer.close();

            if (deleted) {
                if (inputFile.delete() && tempFile.renameTo(inputFile)) {
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

}
