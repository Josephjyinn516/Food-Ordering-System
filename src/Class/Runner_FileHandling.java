/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import Class.Runner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Runner_FileHandling {
    public static boolean createRunnerData(String filePath, Runner runner) {
        try (FileWriter fileWriter = new FileWriter(filePath, true);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write(runner.getRunnerName() + "," + runner.getEmail() + "," + runner.getPhoneNumber() + "," + runner.getPassword() + "\n");
            return true; // Data saved successfully
        } catch (IOException ex) {
            ex.printStackTrace();
            return false; // Error occurred while saving data
        }
    }
    
    public static ArrayList<Runner> readRunnerData(String filePath) {
        ArrayList<Runner> runners = new ArrayList<>();

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    String runnerName = data[0];
                    String email = data[1];
                    String phoneNumber = data[2];
                    String password = data[3];
                    runners.add(new Runner(runnerName, email, phoneNumber, password));
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return runners;
    }
    
    public static boolean updateRunnerData(String filePath, ArrayList<Runner> runners) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (Runner runner : runners) {
                // Write each student's data to the file in the desired format
                writer.println(runner.getRunnerName() + "," + runner.getEmail() + "," + runner.getPhoneNumber()+ "," + runner.getPassword());
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Handle the exception and return false if an error occurs
        }
    }
    
    public static boolean deleteRunnerData(String filePath, String runnerNameToDelete) {
        try {
            File inputFile = new File(filePath);
            File tempFile = new File("temp.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            boolean deleted = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 1 && data[0].equals(runnerNameToDelete)) {
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
