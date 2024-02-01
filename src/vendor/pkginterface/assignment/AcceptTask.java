/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendor.pkginterface.assignment;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author user
 */
public class AcceptTask extends JDialog
{
    private int result; // To store the result of the user's choice
    
    public AcceptTask(String title, String message)
    {
        setTitle(title);
        setModal(true); // Ensure the dialog blocks input to other windows

        JPanel panel = new JPanel(new GridLayout(4, 1));

        JLabel label = new JLabel(message);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton acceptButton = new JButton("Accept");
        JButton cancelButton = new JButton("Cancel");
        JButton declineButton = new JButton("Decline");

        // Add action listeners for each button
        acceptButton.addActionListener((ActionEvent e) -> {
            result = JOptionPane.OK_OPTION;
            dispose(); // Close the dialog
        });

        cancelButton.addActionListener((ActionEvent e) -> {
            result = JOptionPane.CANCEL_OPTION;
            dispose(); // Close the dialog
        });

        declineButton.addActionListener((ActionEvent e) -> {
            result = JOptionPane.NO_OPTION;
            dispose(); // Close the dialog
        });

        panel.add(label);
        panel.add(acceptButton);
        panel.add(cancelButton);
        panel.add(declineButton);

        getContentPane().add(panel);

        pack();
        setLocationRelativeTo(null); // Center the dialog on the screen
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
    
    public int getResult() 
    {
        return result;
    }
}
