/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package digitalexamsystem;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import Project.Projectconnectionprovider;
import java.awt.event.KeyEvent;
import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author NATNAEL
 */
public class Index extends javax.swing.JFrame implements Runnable {

    Random random=new Random();
    Connection con;
     public static int examcode;
      public static int count;
      public static String name;
    public Index() {
        initComponents();
        try {
            con = Projectconnectionprovider.getConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void run() {
        new AdminHome().socket();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtpasswordadmin = new javax.swing.JPasswordField();
        btnloginadmin = new javax.swing.JButton();
        cheakboxpassword = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login page");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1216, 333, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Your Id:");

        txtpasswordadmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordadminKeyPressed(evt);
            }
        });

        btnloginadmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnloginadmin.setForeground(new java.awt.Color(0, 51, 255));
        btnloginadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/login2.png"))); // NOI18N
        btnloginadmin.setText("Login");
        btnloginadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginadminActionPerformed(evt);
            }
        });

        cheakboxpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cheakboxpassword.setForeground(new java.awt.Color(255, 255, 255));
        cheakboxpassword.setText("show passwod");
        cheakboxpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheakboxpasswordActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login Page");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(112, 112, 112))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtpasswordadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cheakboxpassword)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnloginadmin)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(txtpasswordadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cheakboxpassword)
                .addGap(33, 33, 33)
                .addComponent(btnloginadmin)
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 360, 390));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/index background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cheakboxpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheakboxpasswordActionPerformed
        if (cheakboxpassword.isSelected()) {
            txtpasswordadmin.setEchoChar((char) 0);
        } else {
            txtpasswordadmin.setEchoChar('*');
        }
    }//GEN-LAST:event_cheakboxpasswordActionPerformed

    private void btnloginadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginadminActionPerformed
        //String adminname = txtusernameadmin.getText();
       
        String password = String.valueOf(txtpasswordadmin.getPassword());
        try {
            String query = "select*from adminuser where password='" + password + "'";
             
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
             
            if (rs.next()) {
                
                try{
                Thread t = new Thread(this);
                new AdminHome().setVisible(true);
                    studentrun studentrun = new studentrun(false);
                t.start();
                setVisible(false);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Server is already started");
                    new AdminHome().setVisible(false);
                }
                
                    
                
            }
            else{
            String sql="select*from student where regno='"+String.valueOf(txtpasswordadmin.getPassword())+"'";
            ResultSet rs1 = st.executeQuery(sql);
            if(rs1.next()){
        ExaminationPage.min=0;
        ExaminationPage.sec=0;
        ExaminationPage.mark=0;
        count=0;
        examcode=1+random.nextInt(10);
            name=rs1.getString(3)+" "+rs1.getString(4);
            setVisible(false);
            Thread t1=new Thread(new studentrun());
            t1.start();
            new InstructionStudent(password).setVisible(true);
            }
            else if (String.valueOf(txtpasswordadmin.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill out the required information ");
            } else {
                JOptionPane.showMessageDialog(null, "No user Found");
            }
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnloginadminActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnloginadmin;
    private javax.swing.JCheckBox cheakboxpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPasswordField txtpasswordadmin;
    // End of variables declaration//GEN-END:variables
}
