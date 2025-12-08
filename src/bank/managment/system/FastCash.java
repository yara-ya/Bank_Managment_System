package bank.managment.system;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yaraw
 */
public class FastCash extends javax.swing.JFrame {
    int balance=6555;
    private String cardNumber;

    /**
     * Creates new form FastCash
     */
    public FastCash(String cardNumber) {
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
    label.setBounds(0, 0, 900, 900);
    add(label);

    setTitle("FAST CASH");
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeltitle = new javax.swing.JLabel();
        button200 = new javax.swing.JButton();
        button1000 = new javax.swing.JButton();
        button5000 = new javax.swing.JButton();
        button4break = new javax.swing.JButton();
        button500 = new javax.swing.JButton();
        button2000 = new javax.swing.JButton();
        button100 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        labeltitle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labeltitle.setForeground(new java.awt.Color(255, 255, 255));
        labeltitle.setText("SELECT WITHDRAWAL AMOUNT");
        getContentPane().add(labeltitle);
        labeltitle.setBounds(210, 290, 290, 30);

        button200.setBackground(new java.awt.Color(204, 204, 255));
        button200.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        button200.setText("200 LE");
        button200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button200ActionPerformed(evt);
            }
        });
        getContentPane().add(button200);
        button200.setBounds(350, 390, 150, 30);

        button1000.setBackground(new java.awt.Color(204, 204, 255));
        button1000.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        button1000.setText("1000 LE");
        button1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1000ActionPerformed(evt);
            }
        });
        getContentPane().add(button1000);
        button1000.setBounds(350, 430, 150, 30);

        button5000.setBackground(new java.awt.Color(204, 204, 255));
        button5000.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        button5000.setText("5000 LE");
        button5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5000ActionPerformed(evt);
            }
        });
        getContentPane().add(button5000);
        button5000.setBounds(350, 470, 150, 30);

        button4break.setBackground(new java.awt.Color(204, 204, 255));
        button4break.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        button4break.setText("BACK");
        button4break.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4breakActionPerformed(evt);
            }
        });
        getContentPane().add(button4break);
        button4break.setBounds(350, 510, 150, 30);

        button500.setBackground(new java.awt.Color(204, 204, 255));
        button500.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        button500.setText("500 LE");
        button500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button500ActionPerformed(evt);
            }
        });
        getContentPane().add(button500);
        button500.setBounds(170, 430, 150, 30);

        button2000.setBackground(new java.awt.Color(204, 204, 255));
        button2000.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        button2000.setText("2000 LE");
        button2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2000ActionPerformed(evt);
            }
        });
        getContentPane().add(button2000);
        button2000.setBounds(170, 470, 150, 30);

        button100.setBackground(new java.awt.Color(204, 204, 255));
        button100.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        button100.setText("100 LE");
        button100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button100ActionPerformed(evt);
            }
        });
        getContentPane().add(button100);
        button100.setBounds(170, 390, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void withdraw(int amount) {
    try {
        Conn c = new Conn();

        int currentBalance = 0;
        String q = "SELECT balance FROM users WHERE card=?";
        PreparedStatement pst = c.c.prepareStatement(q);
        pst.setString(1, cardNumber);
        ResultSet rs = pst.executeQuery();

        if(rs.next()){
            currentBalance = rs.getInt("balance");
        }

        if(amount > currentBalance){
            JOptionPane.showMessageDialog(null, "Insufficient balance!");
            return;
        }

        int newBalance = currentBalance - amount;

        String t = "INSERT INTO transaction_history(card_no, transaction_type, amount) VALUES (?, 'Quick Withdraw', ?)";
        PreparedStatement pst2 = c.c.prepareStatement(t);
        pst2.setString(1, cardNumber);
        pst2.setDouble(2, amount);
        pst2.executeUpdate();

        String updateBalance = "UPDATE users SET balance=? WHERE card=?";
        PreparedStatement pst3 = c.c.prepareStatement(updateBalance);
        pst3.setInt(1, newBalance);
        pst3.setString(2, cardNumber);
        pst3.executeUpdate();

        JOptionPane.showMessageDialog(null, "You have withdrawn " + amount + " LE.\nCurrent balance: " + newBalance);

    } catch(Exception ex){
        ex.printStackTrace();
    }
}



    private void button200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button200ActionPerformed
        withdraw(200);
    }//GEN-LAST:event_button200ActionPerformed

    private void button4breakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4breakActionPerformed
   
     MainPage mp = new MainPage(cardNumber); 
    mp.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_button4breakActionPerformed

    private void button500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button500ActionPerformed
        withdraw(500);
    }//GEN-LAST:event_button500ActionPerformed
      
    private void button100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button100ActionPerformed
        withdraw(100);
    }//GEN-LAST:event_button100ActionPerformed

    private void button1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1000ActionPerformed
        withdraw(1000);
    }//GEN-LAST:event_button1000ActionPerformed

    private void button2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2000ActionPerformed
        withdraw(2000);
    }//GEN-LAST:event_button2000ActionPerformed

    private void button5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5000ActionPerformed
        withdraw(5000);
    }//GEN-LAST:event_button5000ActionPerformed



   public static void main(String args[]) {
    String cardNumber = "12345"; 
    java.awt.EventQueue.invokeLater(() -> {
        new FastCash(cardNumber).setVisible(true);
    });
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button100;
    private javax.swing.JButton button1000;
    private javax.swing.JButton button200;
    private javax.swing.JButton button2000;
    private javax.swing.JButton button4break;
    private javax.swing.JButton button500;
    private javax.swing.JButton button5000;
    private javax.swing.JLabel labeltitle;
    // End of variables declaration//GEN-END:variables
}
