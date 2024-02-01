/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import Class.User;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;


/**
 *
 * @author User
 */
public class Administrator extends User{

    public Administrator(String username, String password) {
        super(username, password);
    }
    
    public void reloadBalance(Student student, double amount) {
        student.reloadCredit(amount);

        // Generate a notification with current date
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        Notification notification = new Notification(currentDate, currentTime, "Credit Reload", "Amount: RM " + amount);
        student.addNotification(notification);
    }
}


