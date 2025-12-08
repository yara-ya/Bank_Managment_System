package bank.managment.system;

import bank.managment.system.MainPage;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yaraw
 */
public class PinChange extends javax.swing.JFrame  implements ActionListener{
private String cardNumber;

   
    public PinChange(String cardNumber) {
    this.cardNumber = cardNumber; 

    initComponents();
    setLayout(null);
    this.setSize(900, 900);
    setLocation(300, 0);
    setVisible(true);

    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel label = new JLabel(i3);
    label.setBounds(0, 0, 900,900);
    add(label);

    
    btnChg.addActionListener(this);
    btnBack.addActionListener(this);

    setTitle("PIN CHANGE");
}

@Override
public void actionPerformed(ActionEvent e){

   
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        npin = new javax.swing.JPasswordField();
        npin2 = new javax.swing.JPasswordField();
        btnChg = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        rEntPIN = new javax.swing.JLabel();
        nwPIN = new javax.swing.JLabel();
        chgPIN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        npin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npinActionPerformed(evt);
            }
        });
        getContentPane().add(npin);
        npin.setBounds(310, 340, 200, 22);

        npin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npin2ActionPerformed(evt);
            }
        });
        getContentPane().add(npin2);
        npin2.setBounds(310, 370, 200, 22);

        btnChg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChg.setText("Change");
        btnChg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChgActionPerformed(evt);
            }
        });
        getContentPane().add(btnChg);
        btnChg.setBounds(360, 470, 150, 30);

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(360, 510, 150, 30);

        rEntPIN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rEntPIN.setForeground(new java.awt.Color(255, 255, 255));
        rEntPIN.setText("Re-Enter New PIN :");
        getContentPane().add(rEntPIN);
        rEntPIN.setBounds(160, 370, 130, 20);

        nwPIN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nwPIN.setForeground(new java.awt.Color(255, 255, 255));
        nwPIN.setText("New PIN :");
        getContentPane().add(nwPIN);
        nwPIN.setBounds(160, 330, 80, 30);

        chgPIN.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        chgPIN.setForeground(new java.awt.Color(255, 255, 255));
        chgPIN.setText("CHANGE YOUR PIN ");
        getContentPane().add(chgPIN);
        chgPIN.setBounds(260, 300, 150, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void npin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npin2ActionPerformed

    private void btnChgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChgActionPerformed
         String newPin = new String(npin.getPassword());
    String rePin = new String(npin2.getPassword());

    if(newPin.equals("") || rePin.equals("")){
        JOptionPane.showMessageDialog(null, "Please enter PIN!");
        return;
    }

    if(!newPin.equals(rePin)){
        JOptionPane.showMessageDialog(null, "PINs do NOT match!");
        return;
    }

    try {
        Conn c = new Conn();

        String update = "UPDATE users SET pin=? WHERE card=?";
        java.sql.PreparedStatement pst = c.c.prepareStatement(update);

        pst.setString(1, newPin);
        pst.setString(2, cardNumber);

        int rows = pst.executeUpdate();

        if(rows > 0){
            JOptionPane.showMessageDialog(this, "PIN Changed Successfully!");
            npin.setText("");
            npin2.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "Card not found in database!");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating PIN!");
}

 

    }//GEN-LAST:event_btnChgActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
 
                                           
                                       
    new MainPage(cardNumber).setVisible(true);
    this.dispose(); 


    }//GEN-LAST:event_btnBackActionPerformed

    private void npinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    String cardNumber = "12345"; 
    java.awt.EventQueue.invokeLater(() -> {
        new PinChange(cardNumber).setVisible(true);
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChg;
    private javax.swing.JLabel chgPIN;
    private javax.swing.JPasswordField npin;
    private javax.swing.JPasswordField npin2;
    private javax.swing.JLabel nwPIN;
    private javax.swing.JLabel rEntPIN;
    // End of variables declaration//GEN-END:variables

}