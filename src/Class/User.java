/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author User
 */
public class User {
    private String username;
    private String password;
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public boolean login(String enteredUsername, String enteredPassword) {
        // Check if the entered username and password match the stored credentials
        return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    // Set method for password
    public void setPassword(String password) {
        this.password = password;
    }
    
}
