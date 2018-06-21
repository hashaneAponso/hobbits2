/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Glory_GUI;

import Player.Register;
import Settings.SoundEffect;
import glory.schema.PlayersElement;

/**
 *
 * @author Nisal Silva
 */
public class SignUpForm extends javax.swing.JFrame {

    /**
     * Creates new form SignUpForm
     */
    public SignUpForm() {
        initComponents();
        errorMsg1.setVisible(false);
        errorMsg2.setVisible(false);
        errorMsg3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        confirmPassword = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        password = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        errorMsg2 = new javax.swing.JLabel();
        errorMsg3 = new javax.swing.JLabel();
        errorMsg1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Jokerman", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("GLORY");
        jLabel5.setToolTipText("");
        jLabel5.setIconTextGap(6);
        jLabel5.setName(""); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 120, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 204, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 210, 10));

        username.setBackground(new java.awt.Color(64, 64, 148));
        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 102, 102));
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 210, 20));

        jLabel6.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Username  :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, 40));

        btnSignUp.setBackground(new java.awt.Color(255, 204, 0));
        btnSignUp.setFont(new java.awt.Font("Jokerman", 1, 12)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(64, 64, 148));
        btnSignUp.setText("SIGN UP");
        btnSignUp.setToolTipText("");
        btnSignUp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignUp.setContentAreaFilled(false);
        btnSignUp.setOpaque(true);
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 90, 30));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close_delete.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jSeparator3.setForeground(new java.awt.Color(255, 204, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 210, 10));

        confirmPassword.setBackground(new java.awt.Color(64, 64, 148));
        confirmPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmPassword.setForeground(new java.awt.Color(255, 102, 102));
        confirmPassword.setBorder(null);
        confirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 210, 20));

        jSeparator4.setForeground(new java.awt.Color(255, 204, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 210, 20));

        password.setBackground(new java.awt.Color(64, 64, 148));
        password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 102, 102));
        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 210, 20));

        jLabel8.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Confirm - Password :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 40));

        jLabel18.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 204, 0));
        jLabel18.setText("Password :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Webp.net-resizeimage.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3.setSelected(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 70, -1));

        errorMsg2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(errorMsg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 210, 10));

        errorMsg3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(errorMsg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 210, 10));

        errorMsg1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(errorMsg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 210, 10));

        jLabel1.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginNew.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void confirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        SoundEffect.BUTTONCLICK.play();
        errorMsg1.setVisible(false);
        errorMsg2.setVisible(false);
        errorMsg3.setVisible(false);
        boolean passwordCheck=this.CheckConfirmPassword();
        if(passwordCheck){
            boolean usernameCheck=this.CheckUserNameLength();
            if(usernameCheck){
                boolean passwordLengthCheck=this.CheckPasswordLength();
                if(passwordLengthCheck){
                    PlayersElement newPlayer= new PlayersElement();
                    newPlayer.setPlayerName(username.getText());
                    newPlayer.setPassword(password.getText());
                    
                    Register newRegister= new Register();
                    int result= newRegister.RegisterPlayer(newPlayer);
                    if(result!=0){
                        this.dispose();
                        new LoginForm().setVisible(true);                        
                    }else{                        
                        errorMsg3.setText("Sorry something went wrong.");
                        errorMsg3.setVisible(true);
                    }
                }
            }            
        }
        
    }//GEN-LAST:event_btnSignUpActionPerformed

    private boolean CheckConfirmPassword(){
        boolean returnValue=false;
        String value=password.getText();
        String valueToCheck=confirmPassword.getText();
        if(value!=null && valueToCheck!=null){
            if(value.equals(valueToCheck)){
               // errorMsg.setVisible(false);
                returnValue=true;
            }else{
                errorMsg3.setText("Password does not match");
                errorMsg3.setVisible(true);
            }
        }else if(valueToCheck==null){
                errorMsg3.setText("Enter password again to confirm");
                errorMsg3.setVisible(true);
        }
        
        return returnValue;
    }
    
    private boolean CheckUserNameLength(){
        boolean returnValue=false;
        if(username.getDocument().getLength() <=12){
           // errorMsg.setVisible(false);
            returnValue=true;
        }else{
         errorMsg1.setText("Username length exceeded. Maximum length is 12");
         errorMsg1.setVisible(true);
        }
        return returnValue;    
    }
    private boolean CheckPasswordLength(){
        boolean returnValue=false;
        if(password.getDocument().getLength() <=10){
           // errorMsg.setVisible(false);
            returnValue=true;
        }else{
         errorMsg2.setText("Password length exceeded. Maximum length is 10");
         errorMsg2.setVisible(true);
        }
        return returnValue;
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JTextField confirmPassword;
    private javax.swing.JLabel errorMsg1;
    private javax.swing.JLabel errorMsg2;
    private javax.swing.JLabel errorMsg3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
