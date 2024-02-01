/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendor.pkginterface.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */



public class Runners implements FileOperation {
    String filePath;
    DefaultTableModel model;

    public void setFileInput(String Path) {
        filePath = Path;
    }

    @Override
    public String getFileInput() {
        return filePath;
    }

    @Override
    public DefaultTableModel LoadFile() {
        File file = new File(getFileInput());
        model = new DefaultTableModel();

        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = br.readLine(); // Read the first line to get column names
                String[] colNames = line.split(",");
                model.setColumnIdentifiers(colNames);
                
                while ((line = br.readLine()) != null) {
                    String[] rowData = line.split(",");
                    model.addRow(rowData);
                }
            } // Read the first line to get column names
        } catch (IOException e) {
            System.out.println("File not found");
        }

        return model;
    }

    @Override
    public DefaultTableModel FilterModel(DefaultTableModel tableModel) {
        model = tableModel;
        
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (!model.getValueAt(i, 0).equals("R001")) 
            {
                model.removeRow(i);
            } 
        } //Change to fit in the RunnerID based on the login 
        
        return model;
    }

    @Override
    public void NotificationsFile(DefaultTableModel model) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write the header
            for (int i = 0; i < model.getColumnCount(); i++) {
                writer.write(model.getColumnName(i));
                if (i < model.getColumnCount() - 1) {
                    writer.write(",");
                }
            }
            writer.newLine();

            // Write data from the table model
            int rowCount = model.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Object value = model.getValueAt(i, j);
                    writer.write(String.valueOf(value));
                    if (j < model.getColumnCount() - 1) {
                        writer.write(",");
                    }
                }
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("File cannot be written");
        }
    }

    // Additional methods...

    public double CalculateCredit(double totalRevenues) {
        double credit = 0.00; //Assign a previous credit to the runner by admin and pass it here
        
        //Calculate credit based on total revenues
        credit = credit + totalRevenues;
        return credit;
    }
    
    @Override
    public void HistoryFile(String RunnerID, String taskID, String customer, String location,
                            String vendor, String orders, String date, String time,
                            String revenue, String review) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            String taskHistoryLine = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",
                    RunnerID, taskID, customer, location, vendor, orders, date, time, revenue, review);
            writer.newLine();
            writer.write(taskHistoryLine);
        } catch (IOException e) {
            System.out.println("Error appending to the file.");
        }
    }
    
    @Override
    public void RevenueFile(String RunnerID, String date, String taskID, String revenue) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // Append the information to the file
            String revenueLine = String.format("%s,%s,%s,%s", RunnerID, date, taskID, revenue);
            writer.newLine();
            writer.write(revenueLine);
        } catch (IOException e) {
            System.out.println("Error appending to the Revenue file.");
        }
    }
}

