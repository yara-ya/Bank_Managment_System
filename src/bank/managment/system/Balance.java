package bank.managment.system;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
 

public class Balance extends javax.swing.JFrame {
private String cardNumber;

    public Balance(String cardNumber) {
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
    
    setTitle("BALANCE");

    loadBalance(); 
}


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        yrCurr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(360, 510, 150, 30);

        yrCurr.setBackground(new java.awt.Color(0, 0, 0));
        yrCurr.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        yrCurr.setForeground(new java.awt.Color(255, 255, 255));
        yrCurr.setText("Your Current Account Balance Is LE 6555");
        getContentPane().add(yrCurr);
        yrCurr.setBounds(170, 300, 360, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
                                          
    new MainPage(cardNumber).setVisible(true);
    this.dispose();       

    
    }//GEN-LAST:event_btnBackActionPerformed
private void loadBalance() {
    try {
        Conn c = new Conn();
        String q = "SELECT balance FROM users WHERE card=?";
         java.sql.PreparedStatement pst = c.c.prepareStatement(q);
         pst.setString(1, cardNumber);
         java.sql.ResultSet rs = pst.executeQuery();
 
        

        if(rs.next()) {
            int balance = rs.getInt("balance"); 
            yrCurr.setText("Your Current Account Balance Is LE " + balance);
        } else {
            yrCurr.setText("Card not found!");
        }

    } catch(Exception e) {
        e.printStackTrace();
        yrCurr.setText("Error loading balance!");
    }
}

    public static void main(String args[]) {
 
    String cardNumber = "12345"; 
    java.awt.EventQueue.invokeLater(() -> {
        new Balance(cardNumber).setVisible(true);
    });
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel yrCurr;
    // End of variables declaration//GEN-END:variables
}
