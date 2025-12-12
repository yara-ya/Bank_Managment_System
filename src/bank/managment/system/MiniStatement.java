
package bank.managment.system;

import java.sql.SQLException;
import java.util.logging.Level;

public class MiniStatement extends javax.swing.JFrame {
    
   
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MiniStatement.class.getName());

    
    private final String cardNumber;
    
   
    private javax.swing.JTextArea txt;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel cardLabel;
    
    
    
    
    
   
    public MiniStatement(String cardNumber) {
        this.cardNumber = cardNumber;
        initComponents();
        
        this.setTitle("MiniStatement");
        this.setLocationRelativeTo(null);
       
        setupCustomPanel(); 
        loadTransactions(); 
    }
    
   
    private void setupCustomPanel() {
     
        getContentPane().setLayout(null); 
        
      
        cardLabel = new javax.swing.JLabel();
        cardLabel.setFont(new java.awt.Font("Segoe UI", 1, 14));
        cardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardLabel.setBounds(0, 40, 400, 20); 
        add(cardLabel); 

        
        panel = new javax.swing.JPanel();
        panel.setLayout(null);
        panel.setBounds(10, 70, 380, 350); 

        
        txt = new javax.swing.JTextArea();
        txt.setEditable(false);

        
        scroll = new javax.swing.JScrollPane(txt);
        scroll.setBounds(10, 10, 360, 250);
        panel.add(scroll);

      
        balanceLabel = new javax.swing.JLabel("Your Total Balance is 0");
        balanceLabel.setBounds(10, 270, 300, 30);
        panel.add(balanceLabel);

        add(panel);
    
    }
    
   
    private void loadTransactions() {
       
       
        try {
            
            String url = "jdbc:mysql://localhost:3306/bankmanagmentsystem";
            String user = "root";
            String pass = "Root"; 

            try (java.sql.Connection con = java.sql.DriverManager.getConnection(url, user, pass)) {
                
               
                cardLabel.setText("Card Number: " + cardNumber); 

                
                String sqlTransactions = "SELECT transaction_date, transaction_type, amount FROM transaction_history WHERE card_no = ? ORDER BY transaction_date DESC";
                java.sql.PreparedStatement psT = con.prepareStatement(sqlTransactions);
                psT.setString(1, cardNumber);
                java.sql.ResultSet rsT = psT.executeQuery();
                
                StringBuilder out = new StringBuilder();
                
                while (rsT.next()) {
                    String date = rsT.getString("transaction_date");
                    String type = rsT.getString("transaction_type");
                    double amount = rsT.getDouble("amount");
                    out.append("              ").append(date).append("      ").append(type).append("          ").append(amount).append("\n");
                }
                txt.setText(out.toString()); 
                
              
                String sqlBalance = "SELECT balance FROM users WHERE card = ?";
                java.sql.PreparedStatement psB = con.prepareStatement(sqlBalance);
                psB.setString(1, cardNumber);
                java.sql.ResultSet rsB = psB.executeQuery();
                
                double currentBalance = 0;
                if (rsB.next()) {
                    currentBalance = rsB.getDouble("balance");
                }
                
                balanceLabel.setText("Your Total Balance is " + currentBalance + "EP"); 
            }

        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR: Failed to load data from database: " + e.getMessage());
            logger.log(Level.SEVERE, "SQL Error in loadTransactions", e);
        
    }
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Egyptian  Bank");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
        MainPage mp = new MainPage(cardNumber); 
    mp.setVisible(true);
    this.dispose();
    }                                    

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiniStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        
      String cardNumber = "4587XXXXXXXX7896"; 
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new MiniStatement(cardNumber).setVisible(true);
        }   
   
    });
    
            }
    // Variables declaration - do not modify                     
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
