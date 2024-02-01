/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import  Class.Vendor_FileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Class.Notification;
import Class.Administrator;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Student extends User{
    private String studentID;
    private String studentName;
    private String schoolEmail;
    private double creditBalance;
    private String password;
    Stu_FileHandling stuFileHandler = new Stu_FileHandling();
    
    private ArrayList<Notification> notifications;
    
    public Student(String studentID, String name, String schoolEmail, double creditBalance, String password){
        super(name, password);
        this.studentID = studentID;
        this.studentName = name;
        this.schoolEmail = schoolEmail;
        this.creditBalance = creditBalance;
        this.password = password;
        this.notifications = new ArrayList<>();
    }
   
    
    public void addNotification(Notification notification){
        
        notifications.add(notification);
    }
    
    public ArrayList<Notification> getNotifications(){
        return notifications;
    }
    
    public String getStudentID(){
        return studentID;
    }
    
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    
    public String getStudentName(){
        return studentName;
    }
    
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    
    public String getSchoolEmail(){
        return schoolEmail;
    }
    
    public void setSchoolEmail(String schoolEmail){
        if(isValidSchoolEmail(schoolEmail)){
            this.schoolEmail=schoolEmail;
            
        }else{
            throw new IllegalArgumentException("Invalid school email.");
        }
    }
    
    public double getCreditBalance(){
        return creditBalance;
    }
    
    public void setCreditBalance(double creditBalance){
        this.creditBalance = creditBalance;    
    }
    
    public void reloadCredit(double amount){
        if(amount > 0){
            creditBalance += amount;
            System.out.println("Credit reloaded: " + amount);
        }
        else{
            System.out.println("Invalid reload amount. Please enter a position value.");
        }
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void placeOrder(){
        System.out.println("Order placed successfully.");
    }
    
    @Override
    public String toString() {
        return "Student [Student ID=" + studentID + ", Student Name=" + studentName + ", School Email=" + schoolEmail + ", Credit Balance=" + creditBalance + "]";
    }
    
    // Validation methods
    private boolean isValidSchoolEmail(String schoolEmail){
        return schoolEmail != null && schoolEmail.contains("@");
    }
    
    private boolean isValidStudentId(String studentID){
        return studentID != null && studentID.matches("TP\\d{6}");
    }
   
    public void receiveNotification(Notification notification) {
        // Add the notification to the list of notifications
        addNotification(notification);

        // Save the updated notifications to a file
        Notification_FileHandling.saveNotifications(this.getStudentID(), notification);
    }

}