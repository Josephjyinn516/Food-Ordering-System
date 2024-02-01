/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import Class.Administrator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Admin_FileHandling {
    public static ArrayList<Administrator> readAdminData(String filePath) {
        ArrayList<Administrator> adminList = new ArrayList<>();

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader reader = new BufferedReader(fileReader)) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println("Debug: Read line: " + line); // Add this line for debugging

                
                String[] data = line.split(",", -1);
                
                for (int i = 0; i < data.length; i++){
                    System.out.println("Debug: Split data [" + i + "]: " + data[i]);
                }
                if (data.length == 2) {
                    String adminName = data[0].trim();
                    String adminPassword = data[1].trim();

                    Administrator admin = new Administrator(adminName, adminPassword);
                    adminList.add(admin);
                } else {
                     System.out.println("Debug: Unexpected data format");
                }
            }
        } catch (IOException ex) {
            System.err.println("Error reading admin data from file: " + ex.getMessage());
        }

        return adminList;
    }

    public static boolean updateAdmin(String filePath, ArrayList<Administrator> adminList) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (Administrator administrator : adminList) {
                
                // Use setter methods to update the username and password
                administrator.setUsername("newUsername");
                administrator.setPassword("newPassword");
                // Write each administrator's data to the file in the desired format
                writer.println(administrator.getUsername() + "," + administrator.getPassword());
            }
            return true;
        } catch (IOException e) {
            System.err.println("Error updating admin data to file: " + e.getMessage());
            return false;
        }
    }
}

