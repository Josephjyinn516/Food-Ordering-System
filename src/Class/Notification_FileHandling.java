/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Notification_FileHandling {
    private static final String FILE_PATH = "notifications.txt";

    public static void saveNotifications(String studentID, Notification notification) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(notificationToString(studentID, notification));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Notification> readNotificationFile(String studentID) {
    ArrayList<Notification> notifications = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("\\|");
            if (parts.length == 5 && parts[0].equals(studentID)) {
                // Check if the student ID matches and the line is properly formatted
                String dateString = parts[1]; // Get the date string
                String timeString = parts[2]; // Get the time string
                String title = parts[3];
                String details = parts[4];

                // Convert the date string to LocalDate
                LocalDate date = LocalDate.parse(dateString);

                // Convert the time string to LocalTime
                LocalTime time = LocalTime.parse(timeString);

                // Create a Notification object with the converted date and time
                Notification notification = new Notification(date, time, title, details);
                notifications.add(notification);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return notifications;
}

    private static String notificationToString(String studentID, Notification notification) {
        return studentID + "|" + notification.getDate() + "|" + notification.getTime() + "|" +
                notification.getTitle() + "|" + notification.getDetails();
    }
    
    private static Notification stringToNotification(String line) {
        String[] parts = line.split("\\|");
        if (parts.length == 5) {
            String studentID = parts[0];
            LocalDate date = LocalDate.parse(parts[1]);
            LocalTime time = LocalTime.parse(parts[2]);
            String title = parts[3];
            String details = parts[4];
            return new Notification(date, time, title, details);
        }
        return null;
    }
}
