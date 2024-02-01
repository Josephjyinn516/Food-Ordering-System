/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import Class.Vendor;

/**
 *
 * @author User
 */
public class Login_Vendor {
    private static final String vendorFile = "Vendor Profile.txt";
    
    public static Vendor authenticate(String username, String password){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(vendorFile));
            String line;
            
            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                if(parts.length == 4){
                    String storedUsername = parts[0].trim();
                    String storedPassword = parts [3].trim();
                    
                    if(username.equals(storedUsername) && password.equals(storedPassword)){
                        
                        String cafeteriaName = parts[0].trim();
                        String email = parts[1].trim();
                        String phone = parts[2].trim();
                        reader.close();
                        return new Vendor(cafeteriaName, email, phone, password);
                    }
                }
            }
            
            reader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        
        return null;
    }
}
