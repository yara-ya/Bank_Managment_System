package bank.managment.system;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class CashWithdrawl extends javax.swing.JFrame {
private String cardNumber;

    
    public CashWithdrawl(String cardNumber) {
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
    
    setTitle("CASH WITHDRAWL");
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCash = new javax.swing.JTextField();
        WITHDRAWL = new javax.swing.JButton();
        BACK = new javax.swing.JButton();

        jButton1.setText("THDRAWLWI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTER THE AMOUNT YOU WANT TO WITHDRAWL");

        txtCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashActionPerformed(evt);
            }
        });

        WITHDRAWL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        WITHDRAWL.setText("WITHDRAWL");
        WITHDRAWL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WITHDRAWLActionPerformed(evt);
            }
        });

        BACK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(WITHDRAWL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCash, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(WITHDRAWL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashActionPerformed
        
    }//GEN-LAST:event_txtCashActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void WITHDRAWLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WITHDRAWLActionPerformed
  String amountStr = txtCash.getText(); 
    if (amountStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an amount!");
        return;
    }

 


        
       try {
    Conn c = new Conn();
    double amount = Double.parseDouble(amountStr);
    String check = "SELECT balance FROM users WHERE card = ?";
    java.sql.PreparedStatement pst1 = c.c.prepareStatement(check);
    pst1.setString(1, cardNumber);
    java.sql.ResultSet rs = pst1.executeQuery();

    if (rs.next()) {
        double balance = rs.getDouble("balance");

        if (balance < amount) {
            JOptionPane.showMessageDialog(null, "Insufficient Balance");
            return;
        }
    }

    String update = "UPDATE users SET balance = balance - ? WHERE card = ?";
    java.sql.PreparedStatement pst2 = c.c.prepareStatement(update);
    pst2.setDouble(1, amount);
    pst2.setString(2, cardNumber);
    pst2.executeUpdate();

    String insert = "INSERT INTO transaction_history(card_no, transaction_type, amount) VALUES (?, 'Withdraw', ?)";
    java.sql.PreparedStatement pst3 = c.c.prepareStatement(insert);
    pst3.setString(1, cardNumber);
    pst3.setDouble(2, amount);
    pst3.executeUpdate();
    JOptionPane.showMessageDialog(null, "Withdrawal Successful");
    txtCash.setText("");

} catch (Exception e) {
    e.printStackTrace();
}

        
 
    }//GEN-LAST:event_WITHDRAWLActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
                                          
    new MainPage(cardNumber).setVisible(true);               
    this.dispose(); 

    }//GEN-LAST:event_BACKActionPerformed

    
    public static void main(String args[]) {
    String cardNumber = "12345"; 
    java.awt.EventQueue.invokeLater(() -> {
        new CashWithdrawl(cardNumber).setVisible(true);
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton WITHDRAWL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtCash;
    // End of variables declaration//GEN-END:variables
}
