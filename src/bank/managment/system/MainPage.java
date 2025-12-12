package bank.managment.system;


import bank.managment.system.Info;
import bank.managment.system.FastCash;
import bank.managment.system.Deposit;
import bank.managment.system.CashWithdrawl;
import bank.managment.system.Balance;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class MainPage extends javax.swing.JFrame {

   
    private String cardNumber; 

public MainPage(String cardNumber) {
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
    setTitle("Transactions");
}
public MainPage() {
    this(null);   
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlsSelect = new javax.swing.JLabel();
        btnDeposit = new javax.swing.JButton();
        btnCashWithrawl = new javax.swing.JButton();
        btnfastCash = new javax.swing.JButton();
        btnMiniStatement = new javax.swing.JButton();
        btnPinChange = new javax.swing.JButton();
        btnBalance = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPlsSelect.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblPlsSelect.setForeground(new java.awt.Color(255, 255, 255));
        lblPlsSelect.setText("Please Select Your Transaction");

        btnDeposit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeposit.setText("DEPOSIT");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnCashWithrawl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCashWithrawl.setText("CASH WITHDRAWL");
        btnCashWithrawl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashWithrawlActionPerformed(evt);
            }
        });

        btnfastCash.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnfastCash.setText("FAST CASH");
        btnfastCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfastCashActionPerformed(evt);
            }
        });

        btnMiniStatement.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMiniStatement.setText("MINI STATEMENT");
        btnMiniStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiniStatementActionPerformed(evt);
            }
        });

        btnPinChange.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPinChange.setText("PIN CHANGE");
        btnPinChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinChangeActionPerformed(evt);
            }
        });

        btnBalance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBalance.setText("BALANCE ENQUIRY");
        btnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("CLINENT INFO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnfastCash, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPinChange, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCashWithrawl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMiniStatement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPlsSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(lblPlsSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCashWithrawl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMiniStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfastCash, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPinChange, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCashWithrawlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashWithrawlActionPerformed
        this.dispose();
    new CashWithdrawl(cardNumber).setVisible(true);
    }//GEN-LAST:event_btnCashWithrawlActionPerformed

    private void btnfastCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfastCashActionPerformed
        this.dispose();
    new FastCash(cardNumber).setVisible(true);
    }//GEN-LAST:event_btnfastCashActionPerformed

    private void btnMiniStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiniStatementActionPerformed
        this.dispose();
    new MiniStatement(cardNumber).setVisible(true);
    }//GEN-LAST:event_btnMiniStatementActionPerformed

    private void btnPinChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinChangeActionPerformed
        this.dispose();
    new PinChange(cardNumber).setVisible(true);
    }//GEN-LAST:event_btnPinChangeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        this.dispose();
    new Deposit(cardNumber).setVisible(true);
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceActionPerformed
         this.dispose();
    new Balance(cardNumber).setVisible(true);
    }//GEN-LAST:event_btnBalanceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Info(cardNumber).setVisible(true);
        this.dispose();


    
    }//GEN-LAST:event_jButton1ActionPerformed

    
        public static void main(String args[]) {
    String cardNumber = "5664-1370-6686-5"; 
    java.awt.EventQueue.invokeLater(() -> {
        new MainPage(cardNumber).setVisible(true);
    });
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnCashWithrawl;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMiniStatement;
    private javax.swing.JButton btnPinChange;
    private javax.swing.JButton btnfastCash;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblPlsSelect;
    // End of variables declaration//GEN-END:variables
}
