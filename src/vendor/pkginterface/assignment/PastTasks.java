/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vendor.pkginterface.assignment;

/**
 *
 * @author user
 */
public class PastTasks extends javax.swing.JFrame {

    public void setTaskID(String text) {
        lblPastTask.setText(text);
    }
    
    public void setCustomerName(String text) {
        lblCustomerName.setText(text);
    }

    public void setLocation(String text) {
        lblCustomerLocation.setText(text);
    }

    public void setVendorID(String text) {
        lblVendorName.setText(text);
    }
    
    public void setOrders(String text) {
        lblOrderList.setText(text);
    }

    public void setDate(String text) {
        lblDate.setText(text);
    }

    public void setTime(String text) {
        lblTime.setText(text);
    }

    public void setRevenue(String text) {
        lblRevenueGenerated.setText(text);
    }

    public void setReview(String text) {
        lblCustomerReview.setText(text);
    }
    
    public PastTasks() {
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

        lblCustomer = new javax.swing.JLabel();
        lblPastTask = new javax.swing.JLabel();
        lblCustomerReview = new javax.swing.JLabel();
        lblRevenue = new javax.swing.JLabel();
        lblVendor = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblVendorName = new javax.swing.JLabel();
        lblCustomerLocation = new javax.swing.JLabel();
        lblRevenueGenerated = new javax.swing.JLabel();
        lblReviews = new javax.swing.JLabel();
        TaskClose = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblDateOfTask = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblOrderTime = new javax.swing.JLabel();
        lblOrders = new javax.swing.JLabel();
        lblOrderList = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCustomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCustomer.setText("Customer");

        lblPastTask.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        lblPastTask.setText("Task ID");

        lblCustomerReview.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCustomerReview.setText("Customer Review");

        lblRevenue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRevenue.setText("Revenue");

        lblVendor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVendor.setText("Vendor");

        lblLocation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLocation.setText("Location");

        lblCustomerName.setText("Customer Name");

        lblVendorName.setText("Vendor Name");

        lblCustomerLocation.setText("Customer Location");

        lblRevenueGenerated.setText("Revenues Generated");

        lblReviews.setText("Reviews");

        TaskClose.setText("Close");
        TaskClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskCloseActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDate.setText("Date");

        lblDateOfTask.setText("DD/MM/YYYY");

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTime.setText("Time");

        lblOrderTime.setText("HH:MM AM");

        lblOrders.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOrders.setText("Orders");

        lblOrderList.setText("Order List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TaskClose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVendor)
                                    .addComponent(lblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCustomerName)
                                    .addComponent(lblVendorName)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCustomerReview)
                                .addGap(18, 18, 18)
                                .addComponent(lblReviews))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRevenue)
                                .addGap(67, 67, 67)
                                .addComponent(lblRevenueGenerated))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLocation)
                                    .addComponent(lblDate)
                                    .addComponent(lblTime)
                                    .addComponent(lblOrders))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOrderList)
                                    .addComponent(lblOrderTime)
                                    .addComponent(lblDateOfTask)
                                    .addComponent(lblCustomerLocation))))))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(lblPastTask)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TaskClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomer)
                    .addComponent(lblCustomerName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendor)
                    .addComponent(lblVendorName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation)
                    .addComponent(lblCustomerLocation))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(lblDateOfTask))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(lblOrderTime))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrders)
                    .addComponent(lblOrderList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRevenue)
                    .addComponent(lblRevenueGenerated))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerReview)
                    .addComponent(lblReviews))
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblPastTask, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(361, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TaskCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_TaskCloseActionPerformed

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
            java.util.logging.Logger.getLogger(PastTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PastTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PastTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PastTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PastTasks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TaskClose;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblCustomerLocation;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerReview;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateOfTask;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblOrderList;
    private javax.swing.JLabel lblOrderTime;
    private javax.swing.JLabel lblOrders;
    private javax.swing.JLabel lblPastTask;
    private javax.swing.JLabel lblRevenue;
    private javax.swing.JLabel lblRevenueGenerated;
    private javax.swing.JLabel lblReviews;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblVendor;
    private javax.swing.JLabel lblVendorName;
    // End of variables declaration//GEN-END:variables
}
