package bank.managment.system;


import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Login extends javax.swing.JFrame {
    private String cardNumber;

    

    
    public Login(String cardNumber) {
    this.cardNumber = cardNumber;
    initComponents();
    setResizable(false);
   


        setTitle("AUTOMATIED TELLER MACHINE");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 =i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100,100);
        add(label);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        
        setLocation(350, 200);
        
        
    }
    public Login(){
        this(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAccountManagment = new javax.swing.JLabel();
        lbbCardNo = new javax.swing.JLabel();
        lblPin = new javax.swing.JLabel();
        cardTextField = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCreateNewAccount = new javax.swing.JButton();
        pinPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblAccountManagment.setBackground(new java.awt.Color(255, 255, 255));
        lblAccountManagment.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblAccountManagment.setText("ACCOUNT MANAGMENT");

        lbbCardNo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbbCardNo.setText("Card No:");

        lblPin.setBackground(new java.awt.Color(255, 255, 255));
        lblPin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPin.setText("PIN:");

        cardTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardTextFieldActionPerformed(evt);
            }
        });

        btnEnter.setBackground(new java.awt.Color(0, 0, 0));
        btnEnter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setText("ENTER");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCreateNewAccount.setBackground(new java.awt.Color(0, 0, 0));
        btnCreateNewAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreateNewAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateNewAccount.setText("CREATE NEW");
        btnCreateNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewAccountActionPerformed(evt);
            }
        });

        pinPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinPasswordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(lblAccountManagment)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCreateNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbbCardNo))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cardTextField)
                            .addComponent(pinPasswordField))))
                .addGap(0, 146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblAccountManagment)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbbCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPin, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addGap(244, 244, 244))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pinPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCreateNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        String cardnumber = cardTextField.getText();
    String pin = new String(pinPasswordField.getPassword());

    if (cardnumber.isEmpty() || pin.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter your Card No and PIN.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        Conn c = new Conn(); 
        String query = "SELECT * FROM users WHERE card=? AND pin=?";
        java.sql.PreparedStatement pst = c.c.prepareStatement(query);
        pst.setString(1, cardnumber);
        pst.setString(2, pin);

        java.sql.ResultSet rs = pst.executeQuery();
        if(rs.next()){
          this.cardNumber = cardnumber; 
          this.dispose();
          new MainPage(this.cardNumber).setVisible(true);
        } else {
           
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid Card Number or PIN.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

    } catch(Exception e){
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

        
        
        
        
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        cardTextField.setText("");
        pinPasswordField.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCreateNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewAccountActionPerformed
       
      
        SignUpPage1 registrationPage = new SignUpPage1();
        registrationPage.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnCreateNewAccountActionPerformed

    private void cardTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardTextFieldActionPerformed
        
    }//GEN-LAST:event_cardTextFieldActionPerformed

    private void pinPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinPasswordFieldActionPerformed
        
    }//GEN-LAST:event_pinPasswordFieldActionPerformed

    
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Login().setVisible(true); 
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreateNewAccount;
    private javax.swing.JButton btnEnter;
    private javax.swing.JTextField cardTextField;
    private javax.swing.JLabel lbbCardNo;
    private javax.swing.JLabel lblAccountManagment;
    private javax.swing.JLabel lblPin;
    private javax.swing.JPasswordField pinPasswordField;
    // End of variables declaration//GEN-END:variables
}
