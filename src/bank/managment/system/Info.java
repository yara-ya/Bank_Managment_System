package bank.managment.system;


import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Info extends javax.swing.JFrame {
    private String cardNumber;


public Info(String cardNumber) {
    this.cardNumber = cardNumber;
    initComponents();
  
    setTitle("CLIENT'S INFORMATION");

    setLayout(null);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/user.png"));
    Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel label = new JLabel(i3);
    label.setBounds(40, 25, 100, 100);
    add(label);

    loadClientInfo(cardNumber);

    getContentPane().setBackground(Color.LIGHT_GRAY);

    setSize(800, 480);
    setLocation(350, 200);
    
}
    public Info() {
    this(null);   
}



   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_FullName = new javax.swing.JLabel();
        lbl_DateOfBirth = new javax.swing.JLabel();
        lbl_Gender = new javax.swing.JLabel();
        lbl_Maritalstatues = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        lbl_Pin = new javax.swing.JLabel();
        lbl_ID = new javax.swing.JLabel();
        lbl_Regligion = new javax.swing.JLabel();
        lbl_Eduction = new javax.swing.JLabel();
        lbl_Occupation = new javax.swing.JLabel();
        lbl_Income = new javax.swing.JLabel();
        lbl_Governorate = new javax.swing.JLabel();
        lbl_AccountType = new javax.swing.JLabel();
        lbl_CardNumber = new javax.swing.JLabel();
        Separator = new javax.swing.JSeparator();
        btn_BackButton = new javax.swing.JToggleButton();
        lbl_EductionField = new javax.swing.JLabel();
        lbl_OccupationField = new javax.swing.JLabel();
        lbl_IncomField = new javax.swing.JLabel();
        lbl_PinField = new javax.swing.JLabel();
        lbl_IDfield = new javax.swing.JLabel();
        lbl_RegligionField = new javax.swing.JLabel();
        lbl_EmailField = new javax.swing.JLabel();
        lbl_AccountTypeField = new javax.swing.JLabel();
        lbl_CardNumField = new javax.swing.JLabel();
        btn_Edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_FullName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_FullName.setText("Yara AbdelFattah mohammed");

        lbl_DateOfBirth.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_DateOfBirth.setText("20/4/2006");

        lbl_Gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Gender.setText("Female");

        lbl_Maritalstatues.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Maritalstatues.setText("Unmarried");

        lbl_Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Email.setText("Email:");

        lbl_Pin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Pin.setText("Pin:");

        lbl_ID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ID.setText("ID: ");

        lbl_Regligion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Regligion.setText("Religion:");

        lbl_Eduction.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Eduction.setText("Eduction:");

        lbl_Occupation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Occupation.setText("Occupation:");

        lbl_Income.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Income.setText("Income:");

        lbl_Governorate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Governorate.setText("Cairo");

        lbl_AccountType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_AccountType.setText("Account Type:");

        lbl_CardNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_CardNumber.setText("Card Number:");

        Separator.setForeground(new java.awt.Color(102, 102, 102));

        btn_BackButton.setBackground(new java.awt.Color(0, 0, 0));
        btn_BackButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_BackButton.setForeground(new java.awt.Color(255, 255, 255));
        btn_BackButton.setText("BACK");
        btn_BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackButtonActionPerformed(evt);
            }
        });

        lbl_EductionField.setText("non-grade");

        lbl_OccupationField.setText("student");

        lbl_IncomField.setText("null");

        lbl_PinField.setText("5487");

        lbl_IDfield.setText("0565971326989945");

        lbl_RegligionField.setText("muslim");

        lbl_EmailField.setText("yara@gmail.com");

        lbl_AccountTypeField.setText("saving account");

        lbl_CardNumField.setText("5664137066865");

        btn_Edit.setBackground(new java.awt.Color(0, 0, 0));
        btn_Edit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_Edit.setText("EDIT");
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Regligion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_ID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_RegligionField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_IDfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_Income, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Pin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Occupation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Eduction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Separator, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lbl_DateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbl_Gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbl_FullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbl_AccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_CardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lbl_CardNumField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbl_AccountTypeField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbl_EmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                                    .addGap(198, 198, 198)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_Governorate, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_Maritalstatues, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_PinField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_IncomField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_EductionField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_OccupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 330, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_FullName)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Governorate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Gender)
                    .addComponent(lbl_Maritalstatues))
                .addGap(30, 30, 30)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ID)
                    .addComponent(lbl_Eduction)
                    .addComponent(lbl_EductionField)
                    .addComponent(lbl_IDfield))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Regligion)
                    .addComponent(lbl_Occupation, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_OccupationField)
                    .addComponent(lbl_RegligionField))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Pin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_PinField))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_AccountType)
                        .addComponent(lbl_AccountTypeField)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Income)
                        .addComponent(lbl_IncomField))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_CardNumber)
                        .addComponent(lbl_CardNumField)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_EmailField)
                    .addComponent(lbl_Email))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackButtonActionPerformed
        new MainPage(cardNumber).setVisible(true);
    this.dispose(); 
    }//GEN-LAST:event_btn_BackButtonActionPerformed

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        new Edit(cardNumber).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_EditActionPerformed

private void loadClientInfo(String cardNumber){
    try {
        Conn c = new Conn();
        String query = "SELECT cu.*, u.card, u.pin, u.balance " +
                       "FROM customers cu " +
                       "JOIN users u ON cu.id = u.customer_id " +
                       "WHERE u.card=?";

        java.sql.PreparedStatement pst = c.c.prepareStatement(query);
        pst.setString(1, cardNumber);

        java.sql.ResultSet rs = pst.executeQuery();

        if(rs.next()){
            
            lbl_FullName.setText(rs.getString("full_name"));
            lbl_DateOfBirth.setText(rs.getString("date_of_birth"));
            lbl_Gender.setText(rs.getString("gender"));
            lbl_Maritalstatues.setText(rs.getString("marital_status"));
            lbl_IDfield.setText(rs.getString("national_id"));
            lbl_RegligionField.setText(rs.getString("religion"));
            lbl_EductionField.setText(rs.getString("education"));
            lbl_OccupationField.setText(rs.getString("occupation"));
            lbl_IncomField.setText(rs.getString("income"));
            lbl_EmailField.setText(rs.getString("email"));
            lbl_AccountTypeField.setText(rs.getString("account_type"));
            lbl_Governorate.setText(rs.getString("governorate"));

            
            lbl_CardNumField.setText(rs.getString("card"));
            lbl_PinField.setText(rs.getString("pin"));
        }

    } catch(Exception e){
        e.printStackTrace();
    }


}
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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        String cardNumber = "5664-1370-6686-5"; 
    java.awt.EventQueue.invokeLater(() -> {
        new Info(cardNumber).setVisible(true);
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator;
    private javax.swing.JToggleButton btn_BackButton;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JLabel lbl_AccountType;
    private javax.swing.JLabel lbl_AccountTypeField;
    private javax.swing.JLabel lbl_CardNumField;
    private javax.swing.JLabel lbl_CardNumber;
    private javax.swing.JLabel lbl_DateOfBirth;
    private javax.swing.JLabel lbl_Eduction;
    private javax.swing.JLabel lbl_EductionField;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_EmailField;
    private javax.swing.JLabel lbl_FullName;
    private javax.swing.JLabel lbl_Gender;
    private javax.swing.JLabel lbl_Governorate;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JLabel lbl_IDfield;
    private javax.swing.JLabel lbl_IncomField;
    private javax.swing.JLabel lbl_Income;
    private javax.swing.JLabel lbl_Maritalstatues;
    private javax.swing.JLabel lbl_Occupation;
    private javax.swing.JLabel lbl_OccupationField;
    private javax.swing.JLabel lbl_Pin;
    private javax.swing.JLabel lbl_PinField;
    private javax.swing.JLabel lbl_Regligion;
    private javax.swing.JLabel lbl_RegligionField;
    // End of variables declaration//GEN-END:variables
}
