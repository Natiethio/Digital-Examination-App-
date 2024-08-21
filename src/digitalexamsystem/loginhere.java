/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package digitalexamsystem;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author NATNAEL
 */
public class loginhere extends javax.swing.JFrame implements Runnable{
     public boolean found=false;
      Random random=new Random();
      public static int count;
      public static int examcode;
      public static int choice;
      private static String name;
     public Connection cn;
     public Statement st;
    public loginhere() {
        initComponents();
         Starttest.cheak=false;
        try{
           
            Class.forName("com.mysql.cj.jdbc.Driver");
             cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_examination","root","");
             st=cn.createStatement();
            //JOptionPane.showMessageDialog(null,"Connected");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Not Connected");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtpasswordadmin = new javax.swing.JPasswordField();
        cheakboxpassword = new javax.swing.JCheckBox();
        btnloginsdt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 153, 51));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login Here");

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/Close.png"))); // NOI18N
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(190, 190, 190)
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclose)
                    .addComponent(jLabel3))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 690, 100));

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reg No:");

        txtpasswordadmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtpasswordadmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordadminKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordadminKeyReleased(evt);
            }
        });

        cheakboxpassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cheakboxpassword.setForeground(new java.awt.Color(255, 255, 255));
        cheakboxpassword.setText("Show Password");
        cheakboxpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheakboxpasswordActionPerformed(evt);
            }
        });

        btnloginsdt.setBackground(new java.awt.Color(0, 153, 0));
        btnloginsdt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnloginsdt.setForeground(new java.awt.Color(255, 255, 255));
        btnloginsdt.setText("Submit");
        btnloginsdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginsdtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cheakboxpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtpasswordadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnloginsdt)
                .addGap(282, 282, 282))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpasswordadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(cheakboxpassword)
                .addGap(12, 12, 12)
                .addComponent(btnloginsdt)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 690, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/index background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginsdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginsdtActionPerformed
        ExaminationPage.min=0;
        ExaminationPage.sec=0;
        ExaminationPage.mark=0;
        count=0;
        examcode=1+random.nextInt(10);
        
        try{
 
       String regno= String.valueOf(txtpasswordadmin.getPassword());
        String sql="select*from student where regno='"+String.valueOf(txtpasswordadmin.getPassword())+"'";
        ResultSet rs=st.executeQuery(sql);
        if(rs.next()){
            name=rs.getString(3)+" "+rs.getString(4);
            setVisible(false);
            Thread t=new Thread(this);
            t.start();
            new InstructionStudent(regno).setVisible(true);
        }
       /* if(found=true){
            JOptionPane.showMessageDialog(null,"Username or password incorrect");
        }*/
        else if( String.valueOf(txtpasswordadmin.getPassword()).equals("") ){
            JOptionPane.showMessageDialog(null,"Please fill out the required information ");
        }
        else{
            ImageIcon icon=new ImageIcon("Incorrect Password.png");
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red;font-size:10px\"><b>Incorrect Registeration Number Re-Enter Again</b></html>","Error Message",JOptionPane.INFORMATION_MESSAGE,icon);
            setVisible(false);
            new loginhere().setVisible(true);
        }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "we are exiting");
        }
    }//GEN-LAST:event_btnloginsdtActionPerformed

    private void cheakboxpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheakboxpasswordActionPerformed
        if(cheakboxpassword.isSelected()){
          txtpasswordadmin.setEchoChar((char)0);
      }
      else{
          txtpasswordadmin.setEchoChar('*');
      }
    }//GEN-LAST:event_cheakboxpasswordActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        this.setVisible(false);
        new Starttest().setVisible(true);
        //System.exit(0);
    }//GEN-LAST:event_btncloseActionPerformed

    private void txtpasswordadminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordadminKeyReleased
        
        
    }//GEN-LAST:event_txtpasswordadminKeyReleased

    private void txtpasswordadminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordadminKeyPressed
        int key = evt.getKeyCode();
        if(key!=KeyEvent.VK_BACK_SPACE){
        int length=txtpasswordadmin.getText().length();
        if(length > 6){
        txtpasswordadmin.setEditable(false);
        ImageIcon icon=new ImageIcon("Incorrect Password.png");
        JOptionPane.showMessageDialog(null, "<html><b style=\"color:red;font-size:10px\"><b>No Registeration Number More Than Seven Character</b></html>","Error Message",JOptionPane.INFORMATION_MESSAGE,icon);
        txtpasswordadmin.setEditable(true);
        }
        else if(length <=6){
             txtpasswordadmin.setEditable(true);
         }
        }
    }//GEN-LAST:event_txtpasswordadminKeyPressed

    private void txtpasswordadminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordadminKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordadminKeyTyped

    private void txtpasswordadminComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtpasswordadminComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordadminComponentAdded

    @Override
    public void run() {
        InstructionStudent inn=new InstructionStudent();
        inn.socket(Index.name);
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
            java.util.logging.Logger.getLogger(loginhere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginhere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginhere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginhere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginhere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnloginsdt;
    private javax.swing.JCheckBox cheakboxpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField txtpasswordadmin;
    // End of variables declaration//GEN-END:variables
}