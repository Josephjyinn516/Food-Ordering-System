/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vendor.pkginterface.assignment;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
interface FileOperation {
    String getFileInput();
    DefaultTableModel LoadFile();
    DefaultTableModel FilterModel(DefaultTableModel tableModel);
    void NotificationsFile(DefaultTableModel model);
    void HistoryFile(String RunnerID, String taskID, String customer, String location,
                     String vendor, String orders, String date, String time,
                     String revenue, String review);
    void RevenueFile(String RunnerID, String date, String taskID, String revenue);
}