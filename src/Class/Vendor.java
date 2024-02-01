/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import Class.Vendor_FileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



/**
 *
 * @author User
 */
public class Vendor extends User{
    private String cafeteriaName;
    private String email;
    private String phoneNumber;
    private String password;
    Vendor_FileHandling vendorFileHandler = new Vendor_FileHandling();

    // Constructor
    public Vendor (String name, String email, String phoneNumber, String password) {
        super(name, password);
        this.cafeteriaName = name;
        this.password = password;
        setEmail(email); // Use the setEmail method to validate and set email
        setPhoneNumber(phoneNumber); // Use the setPhoneNumber method to validate and set phoneNumber
    }

    // Getters and Setters
    public String getCafeteriaName() {
        return cafeteriaName;
    }

    public void setCafeteriaName(String cafeteriaName) {
        this.cafeteriaName = cafeteriaName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format.");
        }
    }

    public String getPhoneNumber() {
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
        return "Vendor [cafeteriaName=" + cafeteriaName + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
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
        try (BufferedReader reader = new BufferedReader(new FileReader("Vendor Profile.txt"))) {
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


