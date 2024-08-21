/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package digitalexamsystem;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author NATNAEL
 */
public class InstructionStudent extends javax.swing.JFrame {
    public static String ex=" ";
    private static DataInputStream in;
    protected PrintWriter out;
    private String regno;
    private String reg;
    public InstructionStudent() {
        initComponents();
        jTextArea1.setEditable(false);
    }
     public InstructionStudent(String regno1) {
        initComponents();
        this.reg=regno1;
        regno=regno1;
         jTextArea1.setEditable(false);
    }

     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/index student.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 40)); // NOI18N
        jLabel2.setText("Instruction For Examinee");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 6, 563, 64));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1366, 10));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Nyala", 0, 30)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("During the exam:\n\n1.Any attempt to cheat will result complete dismissal from the examination.\n\n2.Using textbooks,noats,electronic devices and other related subject materials is strictly forbidden.\nThis results automatic dismissal from the examination.\n\n3.The exam started in the predefines time and ends after the time allowed endes.When time ends answer\n automatically Submited.\n\n4.Jumped question will appers after the last question.Jumping more than once is not recommended. \n\n5.Student must not stop the seasion and and then return to it.This is especially important in the online environment \nwhere the system will time-out and not allow the student to reenter the exam.\n\nnumber of questions:\nQuestion type:Multiple Choice\nGood Luck!");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1350, 590));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setText("Start The Exam");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 680, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/pages background student.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (ex.equals("Java")||ex.equals("Computer Network")) {
            setVisible(false);
            new ExaminationPage(regno,ex).setVisible(true);
        } else{
            ImageIcon icon = new ImageIcon("Incorrect Password.png");
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red;font-size:10px\">Exam <br>Is Not Available This Time</b></html>", "Error Message", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */ 
    public void socket(String name) {
        Socket client;
        try {
            client = new Socket("localhost", 8080);
            out=new PrintWriter(client.getOutputStream());
            in=new DataInputStream(client.getInputStream());
            out.println(name+"\n");
            out.flush();
            ex = in.readLine();
        } catch (IOException ex) {
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
            java.util.logging.Logger.getLogger(InstructionStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructionStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructionStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructionStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructionStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
