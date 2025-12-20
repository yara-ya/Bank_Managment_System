package bank.managment.system;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JLabel;




public class Deposit extends javax.swing.JFrame {
private String cardNumber;

    
    public Deposit(String cardNumber) {
    this.cardNumber = cardNumber;
    initComponents();
    setResizable(false);
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
    
    setTitle("DEPOSIT");
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDeposit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtEnterYourDeposit = new javax.swing.JTextField();
        lblEnterYourDeposit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDeposit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeposit.setText("DEPOSIT");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtEnterYourDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterYourDepositActionPerformed(evt);
            }
        });

        lblEnterYourDeposit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblEnterYourDeposit.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterYourDeposit.setText("ENTER AMOUNT YOU WANT TO DEPOSIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(lblEnterYourDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEnterYourDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(293, Short.MAX_VALUE)
                .addComponent(lblEnterYourDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnterYourDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
                                                 
                                             
    String amountStr = txtEnterYourDeposit.getText();

    if (amountStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an amount!");
        return;
    }

    try {
        double amount = Double.parseDouble(amountStr);
        if (amount <= 0) {
            JOptionPane.showMessageDialog(this, "Enter a valid amount!");
            return;
        }

        Conn c = new Conn();

        
        String update = "UPDATE users SET balance = balance + ? WHERE card = ?";
        java.sql.PreparedStatement pst = c.c.prepareStatement(update);
        pst.setDouble(1, amount); 
        pst.setString(2, cardNumber); 
        int rowsUpdated = pst.executeUpdate();

        if (rowsUpdated == 0) {
            JOptionPane.showMessageDialog(this, "Card number not found!");
            return;
        }

        
        String insert = "INSERT INTO transaction_history(card_no, transaction_type, amount) VALUES (?, 'Deposit', ?)";
        java.sql.PreparedStatement pst2 = c.c.prepareStatement(insert);
        pst2.setString(1, cardNumber);
        pst2.setDouble(2, amount);
        pst2.executeUpdate(); 

        JOptionPane.showMessageDialog(this, "Deposit Successful!");

       
        txtEnterYourDeposit.setText("");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Enter a numeric value!");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
    }

    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       new MainPage(cardNumber).setVisible(true);               
    this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtEnterYourDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterYourDepositActionPerformed
       
    }//GEN-LAST:event_txtEnterYourDepositActionPerformed

    
    public static void main(String args[]) {
    String cardNumber = "12345"; 
    java.awt.EventQueue.invokeLater(() -> {
        new Deposit(cardNumber).setVisible(true);
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JLabel lblEnterYourDeposit;
    private javax.swing.JTextField txtEnterYourDeposit;
    // End of variables declaration//GEN-END:variables
}
