/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import Class.Runner_FileHandling;

/**
 *
 * @author User
 */
public class Runner extends User{
    private String runnerName;
    private String email;
    private String phoneNumber;
    private String password;
    
    public Runner (String name, String email, String phoneNumber, String password){
        super(name, password);
        this.runnerName = name;
        this.password = password;
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }
    
    public String getRunnerName(){
        return runnerName;
    }
    
    public void setRunnerName(String runnerName){
        this.runnerName = runnerName;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail (String email){
        if(isValidEmail(email)){
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format.");
        }
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("\\d{10,11}")) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Invalid phone number format.");
        }
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }


    @Override
    public String toString() {
        return "Runner [runnerName=" + runnerName + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
    }

    // Validation methods
    private boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.matches("\\d{10,11}");
    }
    
    public boolean authenticate(String enteredUsername, String enteredPassword) {
        // Read vendor credentials from a text file
        try (BufferedReader reader = new BufferedReader(new FileReader("Runner Profile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String storedUsername = parts[0].trim();
                    String storedPassword = parts[3].trim();

                    if (enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword)) {
                        // Credentials match
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the file reading exception here
        }

        // Credentials do not match
        return false;
    }
}

    
