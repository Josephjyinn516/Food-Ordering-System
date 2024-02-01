/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vendor.pkginterface.assignment;

import java.time.LocalDate;

/**
 *
 * @author user
 */
public class TaskInfo extends javax.swing.JFrame {

    public void setTaskID(String text)
    {
        lblTaskInfo.setText(text);
    }
    
    public void setVendorID(String text)
    {
        VendorID.setText(text);
    }
    
    public void setOrders(String text)
    {
        OrderList.setText(text);
    }
    
    public void setCustomerName(String text)
    {
        CustomerName.setText(text);
    }
    
    public void setLocation(String text)
    {
        LocationAddress.setText(text);
    }
    
     public void setDate(String text)
    {
        OrderDate.setText(text);
    }
    
    public void setTime(String text)
    {
        OrderTime.setText(text);
    }
    
    public TaskInfo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTaskInfo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();
        Done = new javax.swing.JToggleButton();
        lblVendor = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        CustomerName = new javax.swing.JLabel();
        VendorID = new javax.swing.JLabel();
        LocationAddress = new javax.swing.JLabel();
        OrderTime = new javax.swing.JLabel();
        OrderList = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        OrderDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTaskInfo.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        lblTaskInfo.setText("Task");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Orders");

        lblCustomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCustomer.setText("Customer");

        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });

        lblVendor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVendor.setText("Vendor");

        lblLocation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLocation.setText("Location");

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTime.setText("Time");

        CustomerName.setText("Customer Name");

        VendorID.setText("Vendor ID");

        LocationAddress.setText("Location Address");

        OrderTime.setText("Order Time");

        OrderList.setText("OrderList");

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDate.setText("Date");

        OrderDate.setText("Order Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblTaskInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VendorID))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CustomerName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OrderList))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDate)
                                    .addComponent(lblTime))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OrderDate)
                                    .addComponent(LocationAddress)
                                    .addComponent(Done, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OrderTime))))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTaskInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomer)
                    .addComponent(CustomerName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendor)
                    .addComponent(VendorID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(OrderList))
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation)
                    .addComponent(LocationAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(OrderDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(OrderTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(Done, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        String RunnerID = "R001"; //Change it according to the account when compiling
        String taskID = lblTaskInfo.getText();
        String customer = CustomerName.getText();
        String vendor = VendorID.getText();
        String orders = OrderList.getText();
        String address = LocationAddress.getText();
        String date = OrderDate.getText(); //Date is based on the order when compiling
        String time = OrderTime.getText(); //Time is based on the order when compiling
        String revenue = "50.00"; //Revenue is stored as string in the file, based on admin's setting
        String review = "Review 1"; //Review is based on the order when compiling
        
        // Create an instance of Runners
        Runners runner = new Runners();
        runner.setFileInput("C:\\Users\\user\\Desktop\\Runner (OODJ Assignment)\\OODJ Assignment\\Task History.txt");

        // Append information to the 'Task History' text file
        runner.HistoryFile(RunnerID, taskID, customer, address, vendor, orders, date, time, revenue, review);
        
        // Create an instance of Runners
        runner.setFileInput("C:\\Users\\user\\Desktop\\Runner (OODJ Assignment)\\OODJ Assignment\\Revenue.txt");

        // Append information to the 'Revenue' text file
        runner.RevenueFile(RunnerID, date, taskID, revenue);

        
        this.dispose();
    }//GEN-LAST:event_DoneActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerName;
    private javax.swing.JToggleButton Done;
    private javax.swing.JLabel LocationAddress;
    private javax.swing.JLabel OrderDate;
    private javax.swing.JLabel OrderList;
    private javax.swing.JLabel OrderTime;
    private javax.swing.JLabel VendorID;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblTaskInfo;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblVendor;
    // End of variables declaration//GEN-END:variables
}
