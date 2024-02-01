/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import Class.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author User
 */
public class Login_Stu {
    private static final String studentFile = "Student Profile.txt";

    public static Student authenticate(String username, String password) {
    try (BufferedReader reader = new BufferedReader(new FileReader(studentFile))) {
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println("Read line: " + line); // Debug print
            String[] parts = line.split(",");
            if (parts.length == 5) {
                String storedUsername = parts[0].trim();
                String storedPassword = parts[4].trim();

                if (username.equals(storedUsername) && password.equals(storedPassword)) {
                    // Authentication successful, create a Student object
                    System.out.println("Authentication successful"); // Debug print
                    String studentID = parts[0].trim();
                    String studentName = parts[1].trim();
                    String schoolEmail = parts[2].trim();
                    double creditBalance = Double.parseDouble(parts[3].trim());
                    reader.close();
                    return new Student(studentID, studentName, schoolEmail, creditBalance, password);
                }
            }
        }

        reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("No student data found."); // Debug print
        return null; // Return null if authentication fails
    }

}

