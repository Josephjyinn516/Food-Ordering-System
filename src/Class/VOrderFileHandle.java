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
public class VOrderFileHandle {
    
    public static ArrayList<Order> readOrderData(String filePath) {
        ArrayList<Order> order = new ArrayList<>();

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 7) {
                    String orderIdStr = data[0];
                    String dateCreated = data[1];
                    String dateDelivery = data[2];
                    String CustomerName = data[3];
                    String customerIdStr = data[4];
                    String subtotalStr = data[5];
                    String status = data[6];
                    int orderIdint = Integer.parseInt(orderIdStr);
                    int customerIdInt = Integer.parseInt(customerIdStr);
                    double subtotalInt = Double.parseDouble(subtotalStr);
                    
                    order.add(new Order(orderIdint, dateCreated, dateDelivery, CustomerName, customerIdInt, subtotalInt, status));
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return order;
    }
    
    public static boolean updateOrderData(String filePath, ArrayList<Order> order) {
        if (order.isEmpty()){
            return true;
        }
        try (FileWriter fileWriter = new FileWriter(filePath);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            for (Order i : order) {
                writer.write(i.getOrderId() + "," + i.getDateCreated() + "," + i.getDateDelivery()+ "," + i.getCustomerName() + "," + i.getCustomerId() + "," + i.getSubtotal() + "," + i.getStatus() + "\n");
            }
            return true; // Data saved successfully
        } catch (IOException ex) {
            ex.printStackTrace();
            return false; // Error occurred while saving data
        }
    }
}
