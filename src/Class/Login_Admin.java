/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import Class.Administrator;
import java.io.BufferedReader;
import java.io.FileReader;
import Class.Administrator;

public class Login_Admin {
//    public static void main(String[] args) {
//        // Set the file path for the admin identification file
//        String adminFilePath = "Admin Profile.txt";
//
//        // Admin credentials
//        String adminUsername = "admin";
//        String adminPassword = "admin@123";
//
//        try (FileWriter fileWriter = new FileWriter(adminFilePath);
//             PrintWriter printWriter = new PrintWriter(fileWriter)) {
//
//            // Write the admin credentials to the file
//            printWriter.println(adminUsername + "," + adminPassword);
//
//            System.out.println("Admin identification file created successfully.");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.err.println("Failed to create the admin identification file.");
//        }
//    }
    
    private static final String adminFile = "Admin Profile.txt";
    
    public static boolean authenticate(String username, String password) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(adminFile));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String storedUsername = parts[0].trim();
                    String storedPassword = parts[1].trim();

                    if (username.equals(storedUsername) && password.equals(storedPassword)) {
                        reader.close();
                        return true;
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}
