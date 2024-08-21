/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package digitalexamsystem;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class AdminHome extends javax.swing.JFrame implements Runnable {

    public static int opan = 0;
    private static int rolNo=1;
    public static String Exam = " ";
    public static String Details = " ";
    private static ServerSocket server;
    protected static List<ClientHandler> clients;
    private static boolean connected=false;
    private static DataInputStream in;
    private static String active_user;
    private static boolean Refreshed=false;
    public AdminHome() {
        initComponents();
        txt_Activestud.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Activestud = new javax.swing.JTextArea();
        btn_Refresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuaddjava = new javax.swing.JMenuItem();
        menuaddcompnet = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuallqjava = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuallqCN = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu9 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        menustartJava = new javax.swing.JMenuItem();
        menustartCN = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        jMenu10.setText("File");
        jMenuBar2.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar2.add(jMenu11);

        jMenu12.setText("jMenu12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AdminHome");
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                hh(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Activestud.setBackground(new java.awt.Color(0, 0, 0));
        txt_Activestud.setColumns(20);
        txt_Activestud.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txt_Activestud.setForeground(new java.awt.Color(255, 255, 255));
        txt_Activestud.setRows(5);
        jScrollPane1.setViewportView(txt_Activestud);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 280));

        btn_Refresh.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        btn_Refresh.setForeground(new java.awt.Color(0, 0, 153));
        btn_Refresh.setText("Refresh active students");
        btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setText("Active Students ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/index background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -142, 1920, 960));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navigation Bar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/addnewquestion2.png"))); // NOI18N
        jMenu1.setText("Add New Question");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menuaddjava.setText("Java");
        menuaddjava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuaddjavaMouseClicked(evt);
            }
        });
        menuaddjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuaddjavaActionPerformed(evt);
            }
        });
        jMenu1.add(menuaddjava);

        menuaddcompnet.setText("Computer network");
        menuaddcompnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuaddcompnetActionPerformed(evt);
            }
        });
        jMenu1.add(menuaddcompnet);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/all questions.png"))); // NOI18N
        jMenu3.setText("All Question");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });

        menuallqjava.setText("Java");
        menuallqjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuallqjavaActionPerformed(evt);
            }
        });
        jMenu3.add(menuallqjava);
        jMenu3.add(jSeparator1);

        menuallqCN.setText("Computer Network");
        menuallqCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuallqCNActionPerformed(evt);
            }
        });
        jMenu3.add(menuallqCN);

        jMenuBar1.add(jMenu3);
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/delete Question.png"))); // NOI18N
        jMenu5.setText("Delete Question");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.add(jSeparator2);

        jMenuBar1.add(jMenu5);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/Update Question.png"))); // NOI18N
        jMenu2.setText("Update questions");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenu2.add(jSeparator3);

        jMenuBar1.add(jMenu2);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/adduser.png"))); // NOI18N
        jMenu9.setText("Add Student");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu9);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/all student result.png"))); // NOI18N
        jMenu6.setText(" Result");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/Start-Sign64.png"))); // NOI18N
        jMenu13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu13.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });

        menustartJava.setText("Java");
        menustartJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menustartJavaActionPerformed(evt);
            }
        });
        jMenu13.add(menustartJava);

        menustartCN.setText("Computer Network");
        menustartCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menustartCNActionPerformed(evt);
            }
        });
        jMenu13.add(menustartCN);

        jMenuBar1.add(jMenu13);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/Logout.png"))); // NOI18N
        jMenu7.setText("Logout");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/Close.png"))); // NOI18N
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu8.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1383, 776));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hh(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_hh
        // TODO add your handling code here:
    }//GEN-LAST:event_hh

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        JFrame jf = new JFrame();
        int a = JOptionPane.showConfirmDialog(jf, "Do you Relly Want To Logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            Index obj = new Index();
            obj.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        JFrame jf = new JFrame();
        int a = JOptionPane.showConfirmDialog(jf, "Do you Relly Want To Exit This Application?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
       if (opan == 0) {
            new Deletequestion().setVisible(true);
            opan = 1;
        } else {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "First Close The Current Page");
        }
                                         
        
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        if (opan == 0) {
            new Allstudentresult().setVisible(true);
            opan = 1;
        } else {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "First Close The Current Page");
        }
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        if (opan == 0) {
            new PStudentDetail().setVisible(true);
            opan = 1;
        } else {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "First Close The Current Page");
        }
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu13MouseClicked

    private void menustartJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menustartJavaActionPerformed
        if (opan == 0) {
            if(connected==false){
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "No Students are connected");
            }
            else {
                Exam = menustartJava.getText();
                new SendMessage(clients, Exam);
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "Java Exam Started Successfully");
            }
        } else {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "First Close The Current Page");
        }
    }//GEN-LAST:event_menustartJavaActionPerformed

    private void menuaddjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddjavaActionPerformed
         Details =  menuaddjava.getText();
        if (opan == 0) {
            new addnewquestions(0).setVisible(true);
            opan = 1;
        } else {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "First Close The Current Page");
        }
    }//GEN-LAST:event_menuaddjavaActionPerformed

    private void menuaddjavaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuaddjavaMouseClicked

    }//GEN-LAST:event_menuaddjavaMouseClicked

    private void menuaddcompnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddcompnetActionPerformed
         Details =  menuaddcompnet.getText();
        if (opan == 0) {
            new addnewquestions(1).setVisible(true);
            opan = 1;
        } else {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "First Close The Current Page");
        }
    }//GEN-LAST:event_menuaddcompnetActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menustartCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menustartCNActionPerformed
        if (opan == 0) {
            if(connected==false){
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "No Students are connected");
            }
            else {
                Exam = menustartCN.getText();
                new SendMessage(clients, Exam);
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "Computer Network Exam Started Successfully");
            }
        } else {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "First Close The Current Page");
        }
    }//GEN-LAST:event_menustartCNActionPerformed

    private void menuallqjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuallqjavaActionPerformed
        Details = menuallqjava.getText();
        if (opan == 0) {
            new Allquestion(0).setVisible(true);
            opan = 1;
        } else {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "First Close The Current Page");
        }
    }//GEN-LAST:event_menuallqjavaActionPerformed

    private void menuallqCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuallqCNActionPerformed
        Details = menuallqCN.getText();
        if (opan == 0) {
            new Allquestion().setVisible(true);
            opan = 1;
        } else {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "First Close The Current Page");
        }
    }//GEN-LAST:event_menuallqCNActionPerformed

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
        // TODO add your handling code here:
        if(!Refreshed&&active_user!=null){
            txt_Activestud.append(rolNo+", "+active_user+"\n");
            Refreshed=true;
            rolNo++;
        }
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu9ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    
        if (opan == 0) {
            new UpdateQuestion().setVisible(true);
            opan = 1;
        } else {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "First Close The Current Page");
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
      
        if (opan == 0) {
            new UpdateQuestion().setVisible(true);
            opan = 1;
        } else {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "First Close The Current Page");
        }
    }//GEN-LAST:event_jMenu2ActionPerformed

    public void socket() {
        try {
            server = new ServerSocket(8080);
            System.out.println("New server initialized!");
            clients = Collections
                    .synchronizedList(new ArrayList<ClientHandler>());
            Thread t = new Thread(this);
            t.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        while (true) {
            try {
                Socket client = server.accept();
                System.out.println(client.getInetAddress().getHostName()
                        + " connected");
                connected=true;
                in=new DataInputStream(client.getInputStream());
                active_user=in.readLine();
                Refreshed=false;
                ClientHandler newClient = new ClientHandler(client);
                clients.add(newClient);
            } catch (Exception e) {
                e.printStackTrace();
            }
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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem menuaddcompnet;
    private javax.swing.JMenuItem menuaddjava;
    private javax.swing.JMenuItem menuallqCN;
    private javax.swing.JMenuItem menuallqjava;
    private javax.swing.JMenuItem menustartCN;
    private javax.swing.JMenuItem menustartJava;
    private javax.swing.JTextArea txt_Activestud;
    // End of variables declaration//GEN-END:variables
}
