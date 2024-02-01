/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author tanji
 */
public class VReviewFileHandle {
    
    public static ArrayList<Review> readReviewData(String filePath) {
        ArrayList<Review> review = new ArrayList<>();

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 7) {
                    String reviewIdStr = data[0];
                    String customerIdStr = data[1];
                    String customerName = data[2];
                    String ratingStr = data[3];
                    String createdDate = data[4];
                    String details = data[5];
                    
                    int reviewIdInt = Integer.parseInt(reviewIdStr);
                    int customerIdInt = Integer.parseInt(customerIdStr);
                    int ratingInt = Integer.parseInt(ratingStr);
                    
                    review.add(new Review(reviewIdInt, customerIdInt, customerName, ratingInt, createdDate, details));
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return review;
    }
}
