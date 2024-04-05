// package Project;

public class AdminPanel extends javax.swing.JFrame {

        public AdminPanel() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                Right = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                Left = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                userList = new javax.swing.JList<>();
                deleteButton = new javax.swing.JButton();
                deactivateButton = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Admin Panel");
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
                jLabel6.setText("Admin Panel");

                jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(204, 204, 204));
                jLabel7.setText("copyright ©Sid");

                javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
                Right.setLayout(RightLayout);
                RightLayout.setHorizontalGroup(
                                RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(69, Short.MAX_VALUE)
                                                                .addGroup(RightLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel5)
                                                                                .addGroup(RightLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(39, 39, 39)
                                                                                                .addComponent(jLabel6)))
                                                                .addGap(63, 63, 63))
                                                .addGroup(RightLayout.createSequentialGroup()
                                                                .addGap(101, 101, 101)
                                                                .addComponent(jLabel7)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                RightLayout.setVerticalGroup(
                                RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(RightLayout.createSequentialGroup()
                                                                .addGap(136, 136, 136)
                                                                .addComponent(jLabel5)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                115,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel7)
                                                                .addGap(78, 78, 78)));

                jPanel1.add(Right);
                Right.setBounds(0, 0, 400, 500);

                Left.setBackground(new java.awt.Color(255, 255, 255));
                Left.setMinimumSize(new java.awt.Dimension(400, 500));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 102, 102));
                jLabel1.setText("User List");

                userList.setModel(new javax.swing.AbstractListModel<String>() {
                        String[] strings = { "User 1", "User 2", "User 3", "User 4", "User 5" };

                        public int getSize() {
                                return strings.length;
                        }

                        public String getElementAt(int i) {
                                return strings[i];
                        }
                });
                jScrollPane1.setViewportView(userList);

                deleteButton.setBackground(new java.awt.Color(255, 51, 51));
                deleteButton.setForeground(new java.awt.Color(255, 255, 255));
                deleteButton.setText("Delete User");

                deactivateButton.setBackground(new java.awt.Color(0, 102, 102));
                deactivateButton.setForeground(new java.awt.Color(255, 255, 255));
                deactivateButton.setText("Deactivate User");

                javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
                Left.setLayout(LeftLayout);
                LeftLayout.setHorizontalGroup(
                                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(LeftLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(LeftLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(LeftLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel1)
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                370,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                LeftLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                                .addGroup(LeftLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addComponent(deleteButton,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(deactivateButton,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                147,
                                                                                                                                                Short.MAX_VALUE))))
                                                                .addContainerGap()));
                LeftLayout.setVerticalGroup(
                                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(LeftLayout.createSequentialGroup()
                                                                .addGap(37, 37, 37)
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                296,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(deleteButton)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(deactivateButton)
                                                                .addContainerGap(34, Short.MAX_VALUE)));

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
                                                                .addGap(0, 400, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new AdminPanel().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel Left;
        private javax.swing.JPanel Right;
        private javax.swing.JButton deleteButton;
        private javax.swing.JButton deactivateButton;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JList<String> userList;
        // End of variables declaration//GEN-END:variables
}
