/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author User
 */
import java.util.Date;

public class Notification {
    private LocalDate date;
    private LocalTime time;
    private String title;
    private String details;

    public Notification(LocalDate date, LocalTime time, String title, String details) {
        this.date = date;
        this.time = time;
        this.title = title;
        this.details = details;
        
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }
    
    @Override
    public String toString() {
        return "Notification{" +
                "date=" + date +
                ", time='" + time + '\'' +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
    
    
}
