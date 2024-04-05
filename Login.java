
// Login.java
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends javax.swing.JFrame {

        public Login() {
                initComponents();
        }

        private void initComponents() {
                jPanel1 = new javax.swing.JPanel();
                Right = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                Left = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jPasswordField1 = new javax.swing.JPasswordField();
                jButton1 = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jButton2 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("LOGIN");
                setPreferredSize(new java.awt.Dimension(800, 500));

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
                jPanel1.setLayout(null);

                Right.setBackground(new java.awt.Color(0, 102, 102));
                Right.setPreferredSize(new java.awt.Dimension(400, 500));

                jLabel5.setIcon(new javax.swing.ImageIcon(
                                "C:\\Users\\Rahemet\\Documents\\NetBeansProjects\\LoginAndSignUp\\src\\Icon\\logo.png")); // NOI18N

                jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                jLabel6.setText("We_Shop!");

                jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(204, 204, 204));
                jLabel7.setText("copyright ©Sid");

                javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
                Right.setLayout(RightLayout);
                RightLayout.setHorizontalGroup(RightLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout
                                                .createSequentialGroup()
                                                .addContainerGap(81, Short.MAX_VALUE)
                                                .addGroup(RightLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel5)
                                                                .addGroup(RightLayout.createSequentialGroup()
                                                                                .addGap(35, 35, 35)
                                                                                .addComponent(jLabel6)))
                                                .addGap(63, 63, 63))
                                .addGroup(RightLayout.createSequentialGroup()
                                                .addGap(98, 98, 98)
                                                .addComponent(jLabel7)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));
                RightLayout.setVerticalGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(RightLayout.createSequentialGroup()
                                                .addGap(136, 136, 136)
                                                .addComponent(jLabel5)
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                115, Short.MAX_VALUE)
                                                .addComponent(jLabel7)
                                                .addGap(78, 78, 78)));

                jPanel1.add(Right);
                Right.setBounds(0, 0, 400, 500);

                Left.setBackground(new java.awt.Color(255, 255, 255));
                Left.setMinimumSize(new java.awt.Dimension(400, 500));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 102, 102));
                jLabel1.setText("LOGIN");

                jLabel2.setBackground(new java.awt.Color(102, 102, 102));
                jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel2.setText("Email");

                jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jTextField1.setForeground(new java.awt.Color(102, 102, 102));

                jLabel3.setBackground(new java.awt.Color(102, 102, 102));
                jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel3.setText("Password");

                jButton1.setBackground(new java.awt.Color(0, 102, 102));
                jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jButton1.setForeground(new java.awt.Color(255, 255, 255));
                jButton1.setText("Login");

                jLabel4.setText("I don't have an account");

                jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jButton2.setForeground(new java.awt.Color(255, 51, 51));
                jButton2.setText("Sign Up");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
                Left.setLayout(LeftLayout);
                LeftLayout.setHorizontalGroup(
                                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(LeftLayout.createSequentialGroup()
                                                                .addGroup(LeftLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(LeftLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(138, 138, 138)
                                                                                                .addComponent(jLabel1))
                                                                                .addGroup(LeftLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(30, 30, 30)
                                                                                                .addGroup(LeftLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel2)
                                                                                                                .addComponent(jTextField1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                343,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel3)
                                                                                                                .addComponent(jPasswordField1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                343,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                93,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(LeftLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel4)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jButton2)))))
                                                                .addContainerGap(27, Short.MAX_VALUE)));
                LeftLayout.setVerticalGroup(
                                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(LeftLayout.createSequentialGroup()
                                                                .addGap(51, 51, 51)
                                                                .addComponent(jLabel1)
                                                                .addGap(40, 40, 40)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTextField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jPasswordField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                36,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)
                                                                .addGroup(LeftLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jButton2))
                                                                .addContainerGap(77, Short.MAX_VALUE)));

                jPanel1.add(Left);
                Left.setBounds(400, 0, 400, 500);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 129, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 149, Short.MAX_VALUE)));

                getAccessibleContext().setAccessibleName("LOGIN");

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
                SignUp SignUpFrame = new SignUp();
                SignUpFrame.setVisible(true);
                SignUpFrame.pack();
                SignUpFrame.setLocationRelativeTo(null);
                this.dispose();
        }// GEN-LAST:event_jButton2ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/WeShop", "root",
                                        "Sandhya@05");

                        // Write the SQL INSERT query
                        String query = "INSERT INTO users (email, password) VALUES (?, ?)";

                        // Create a PreparedStatement
                        PreparedStatement pstmt = con.prepareStatement(query);

                        // Set parameter values
                        pstmt.setString(1, jTextField1.getText()); // Assuming jTextField1 is for email
                        pstmt.setString(2, new String(jPasswordField1.getPassword())); // Assuming jPasswordField1 is
                                                                                       // for password

                        // Execute the query
                        int rowsInserted = pstmt.executeUpdate();

                        if (rowsInserted > 0) {
                                System.out.println("A new user was inserted successfully!");
                        }

                        // Close resources
                        pstmt.close();
                        con.close();
                } catch (ClassNotFoundException | SQLException ex) {
                        // Handle exceptions properly (e.g., show error message dialog)
                        ex.printStackTrace();
                }

        }

        public static void main(String[] args) {
                Login LoginFrame = new Login();
                LoginFrame.setVisible(true);
                LoginFrame.pack();
                LoginFrame.setLocationRelativeTo(null);
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel Left;
        private javax.swing.JPanel Right;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPasswordField jPasswordField1;
        private javax.swing.JTextField jTextField1;
        // End of variables declaration//GEN-END:variables
}
