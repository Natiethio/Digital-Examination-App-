/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package digitalexamsystem;
import java.sql.*;
import Project.Projectconnectionprovider;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author NATNAEL
 */
public class PStudentDetail extends javax.swing.JFrame {

    /**
     * Creates new form StudentDetail
     */
    public PStudentDetail() {
        initComponents();
        tatextarea.setEditable(false);
        SimpleDateFormat dformat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        lbldate.setText(dformat.format(date));
        
    }

    public boolean valemail(String input){
      String emailregx="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";  
      Pattern emailpat=Pattern.compile(emailregx,Pattern.CASE_INSENSITIVE);
      Matcher matcher=emailpat.matcher(input);
      return matcher.find();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        txtschool10 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        txtschool12 = new javax.swing.JTextField();
        txtgraduation = new javax.swing.JTextField();
        txtaddresstudent = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtpointgain10 = new javax.swing.JTextField();
        txtpassoutmark10 = new javax.swing.JTextField();
        txtpointgain12 = new javax.swing.JTextField();
        txtpassoutmark12 = new javax.swing.JTextField();
        txtcgpa = new javax.swing.JTextField();
        txtpassuni = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tatextarea = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/index student.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, 66, 74));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 40)); // NOI18N
        jLabel2.setText("  Examination Register Form");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 630, 54));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel3.setText("Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, 32));

        lbldate.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        lbldate.setText("ggg");
        getContentPane().add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 120, 26));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 1366, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setText("Reg No:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 148, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setText("Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 196, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setText("Father Name:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 241, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setText("Mother Name:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 295, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setText("Gender:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 352, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setText("Email:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setText("Grade 10 Details:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setText("Grade 12 Details:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setText("Gradation:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setText("Address:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 145, 290, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 196, 290, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 250, 290, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 301, 290, -1));

        txtschool10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtschool10.setForeground(new java.awt.Color(204, 204, 204));
        txtschool10.setText("Enter School Name");
        txtschool10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtschool10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtschool10FocusLost(evt);
            }
        });
        getContentPane().add(txtschool10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 290, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(204, 204, 204));
        jTextField7.setText("Example000@gmail.com");
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 290, -1));

        txtschool12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtschool12.setForeground(new java.awt.Color(204, 204, 204));
        txtschool12.setText("Enter School Name");
        txtschool12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtschool12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtschool12FocusLost(evt);
            }
        });
        getContentPane().add(txtschool12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 290, -1));

        txtgraduation.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtgraduation.setForeground(new java.awt.Color(204, 204, 204));
        txtgraduation.setText("Enter University Name");
        txtgraduation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtgraduationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtgraduationFocusLost(evt);
            }
        });
        getContentPane().add(txtgraduation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 290, -1));

        txtaddresstudent.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(txtaddresstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 1056, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 352, 290, -1));

        txtpointgain10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtpointgain10.setForeground(new java.awt.Color(204, 204, 204));
        txtpointgain10.setText("Enter Point That You Earned");
        txtpointgain10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpointgain10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpointgain10FocusLost(evt);
            }
        });
        getContentPane().add(txtpointgain10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, 280, -1));

        txtpassoutmark10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtpassoutmark10.setForeground(new java.awt.Color(204, 204, 204));
        txtpassoutmark10.setText("Enter Passout  Year");
        txtpassoutmark10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpassoutmark10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpassoutmark10FocusLost(evt);
            }
        });
        getContentPane().add(txtpassoutmark10, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 510, 330, -1));

        txtpointgain12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtpointgain12.setForeground(new java.awt.Color(204, 204, 204));
        txtpointgain12.setText("Enter Mark Out Of 700");
        txtpointgain12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpointgain12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpointgain12FocusLost(evt);
            }
        });
        getContentPane().add(txtpointgain12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, 280, -1));

        txtpassoutmark12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtpassoutmark12.setForeground(new java.awt.Color(204, 204, 204));
        txtpassoutmark12.setText("Enter Passout  Year");
        txtpassoutmark12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpassoutmark12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpassoutmark12FocusLost(evt);
            }
        });
        getContentPane().add(txtpassoutmark12, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, 330, -1));

        txtcgpa.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtcgpa.setForeground(new java.awt.Color(204, 204, 204));
        txtcgpa.setText("Enter CGPA");
        txtcgpa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcgpaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcgpaFocusLost(evt);
            }
        });
        getContentPane().add(txtcgpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 610, 280, -1));

        txtpassuni.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtpassuni.setForeground(new java.awt.Color(204, 204, 204));
        txtpassuni.setText("Enter Passout  Year");
        txtpassuni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpassuniFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpassuniFocusLost(evt);
            }
        });
        getContentPane().add(txtpassuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 610, 330, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/save.png"))); // NOI18N
        jButton3.setText("Save and Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 710, 497, -1));

        tatextarea.setColumns(20);
        tatextarea.setRows(5);
        tatextarea.setText("Digital Examination System");
        jScrollPane1.setViewportView(tatextarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 206, 657, 164));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 6, -1, -1));

        jLabel16.setToolTipText("");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("Contact Number:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 410, 290, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 210, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/Close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 75, 70));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/pages background student.jpg"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtschool10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtschool10FocusGained
       if( txtschool10.getText().equals("Enter School Name")){
           txtschool10.setText("");
           txtschool10.setForeground(new Color(0,0,0));
       }
    }//GEN-LAST:event_txtschool10FocusGained

    private void txtschool12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtschool12FocusGained
        if( txtschool12.getText().equals("Enter School Name")){
           txtschool12.setText("");
           txtschool12.setForeground(new Color(0,0,0));
       }
    }//GEN-LAST:event_txtschool12FocusGained

    private void txtgraduationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtgraduationFocusGained
        if( txtgraduation.getText().equals("Enter University Name")){
           txtgraduation.setText("");
           txtgraduation.setForeground(new Color(0,0,0));
       }
    }//GEN-LAST:event_txtgraduationFocusGained

    private void txtpointgain10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpointgain10FocusGained
     if(txtpointgain10.getText().equals("Enter Point That You Earned")){
         txtpointgain10.setText("");
         txtpointgain10.setForeground(new Color(0,0,0));
     }
    }//GEN-LAST:event_txtpointgain10FocusGained

    private void txtpointgain12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpointgain12FocusGained
        if(txtpointgain12.getText().equals("Enter Mark Out Of 700")){
         txtpointgain12.setText("");
         txtpointgain12.setForeground(new Color(0,0,0));
     }
    }//GEN-LAST:event_txtpointgain12FocusGained

    private void txtcgpaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcgpaFocusGained
       if(txtcgpa.getText().equals("Enter CGPA")){
         txtcgpa.setText("");
         txtcgpa.setForeground(new Color(0,0,0));
     }
    }//GEN-LAST:event_txtcgpaFocusGained

    private void txtpassoutmark10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassoutmark10FocusGained
        if(txtpassoutmark10.getText().equals("Enter Passout  Year")){
         txtpassoutmark10.setText("");
         txtpassoutmark10.setForeground(new Color(0,0,0));
     }
        
    }//GEN-LAST:event_txtpassoutmark10FocusGained

    private void txtpassoutmark12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassoutmark12FocusGained
        if(txtpassoutmark12.getText().equals("Enter Passout  Year")){
         txtpassoutmark12.setText("");
         txtpassoutmark12.setForeground(new Color(0,0,0));
     }
        
    }//GEN-LAST:event_txtpassoutmark12FocusGained

    private void txtpassuniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassuniFocusGained
        if(txtpassuni.getText().equals("Enter Passout  Year")){
         txtpassuni.setText("");
         txtpassuni.setForeground(new Color(0,0,0));
     }
    }//GEN-LAST:event_txtpassuniFocusGained

    private void txtschool10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtschool10FocusLost
       if(  txtschool10.getText().equals("")){
           txtschool10.setText("Enter School Name");
           txtschool10.setForeground(new Color(204,204,204));
       }
    }//GEN-LAST:event_txtschool10FocusLost

    private void txtschool12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtschool12FocusLost
       if(  txtschool12.getText().equals("")){
           txtschool12.setText("Enter School Name");
           txtschool12.setForeground(new Color(204,204,204));
       }
    }//GEN-LAST:event_txtschool12FocusLost

    private void txtgraduationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtgraduationFocusLost
        if(  txtgraduation.getText().equals("")){
           txtgraduation.setText("Enter University Name");
           txtgraduation.setForeground(new Color(204,204,204));
       }
    }//GEN-LAST:event_txtgraduationFocusLost

    private void txtpointgain10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpointgain10FocusLost
        if(txtpointgain10.getText().equals("")){
           txtpointgain10.setText("Enter Point That You Earned");
           txtpointgain10.setForeground(new Color(204,204,204));
       }
    }//GEN-LAST:event_txtpointgain10FocusLost

    private void txtpointgain12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpointgain12FocusLost
        if(txtpointgain12.getText().equals("")){
           txtpointgain12.setText("Enter Mark Out Of 700");
           txtpointgain12.setForeground(new Color(204,204,204));
       }
    }//GEN-LAST:event_txtpointgain12FocusLost

    private void txtcgpaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcgpaFocusLost
        if(txtcgpa.getText().equals("")){
           txtcgpa.setText("Enter CGPA");
           txtcgpa.setForeground(new Color(204,204,204));
       }
    }//GEN-LAST:event_txtcgpaFocusLost

    private void txtpassoutmark10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassoutmark10FocusLost
        if(txtpassoutmark10.getText().equals("")){
           txtpassoutmark10.setText("Enter Passout  Year");
           txtpassoutmark10.setForeground(new Color(204,204,204));
       }
    }//GEN-LAST:event_txtpassoutmark10FocusLost

    private void txtpassoutmark12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassoutmark12FocusLost
      if(txtpassoutmark12.getText().equals("")){
           txtpassoutmark12.setText("Enter Passout  Year");
           txtpassoutmark12.setForeground(new Color(204,204,204));
       }
    }//GEN-LAST:event_txtpassoutmark12FocusLost

    private void txtpassuniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassuniFocusLost
        if(txtpassuni.getText().equals("")){
           txtpassuni.setText("Enter Passout  Year");
           txtpassuni.setForeground(new Color(204,204,204));
       }
    }//GEN-LAST:event_txtpassuniFocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String regno=jTextField1.getText();
        String name=jTextField2.getText();
        String fathername=jTextField3.getText();
        String mothername=jTextField4.getText();
        String gender=(String)jComboBox1.getSelectedItem();
        String contactno=jTextField5.getText();
        String email=jTextField7.getText();
        String Gradetenschoolname=txtschool10.getText();
        String Gradetenresult=txtpointgain10.getText();
        String Gradetenpassoutyear=txtpassoutmark10.getText();
        String Gradetwelveschoolname=txtschool12.getText();
        String Gradetwelveresult=txtpointgain12.getText();
        String Gradetwelvepassoutyear=txtpassoutmark12.getText();
        String gradatedfrom=txtgraduation.getText();
        String CGPA=txtcgpa.getText();
        String unipassoutyear=txtpassuni.getText();
        String address=txtaddresstudent.getText();
        String mark="0";
        
        try{
           Connection con=Projectconnectionprovider.getConnection();
           PreparedStatement ps=con.prepareStatement("insert into student(regno,name,fathername,mothername,gender,contactno,email,gradetenschool,gradetenresult,gradetenpassouty,gradetwelveschool,gradetwelveresult,gradetwelvepassouty,graduatedfrom,cgpa,unipassoutyear,address,mark) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
           ps.setString(1, regno);
           ps.setString(2, name);
           ps.setString(3, fathername);
           ps.setString(4, mothername);
           ps.setString(5, gender);
           ps.setString(6, contactno);
           ps.setString(7, email);
           ps.setString(8, Gradetenschoolname);
           ps.setString(9, Gradetenresult);
           ps.setString(10, Gradetenpassoutyear);
           ps.setString(11, Gradetwelveschoolname);
           ps.setString(12, Gradetwelveresult);
           ps.setString(13, Gradetwelvepassoutyear);
           ps.setString(14, gradatedfrom);
           ps.setString(15, CGPA);
           ps.setString(16, unipassoutyear);
           ps.setString(17, address);
           ps.setString(18, mark);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Student added successfully");
           this.dispose();
          
        }
        catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        if(jTextField7.getText().equals("Example000@gmail.com")){
         jTextField7.setText("");
         jTextField7.setForeground(new Color(0,0,0));
     }
    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        if(jTextField7.getText().equals("")){
           jTextField7.setText("Example000@gmail.com");
           jTextField7.setForeground(new Color(204,204,204));
       }
        String email=jTextField7.getText();
        boolean x=valemail(email);
        if(x==false){
            jTextField5.setBackground(new Color(255,0,51));
        }
    }//GEN-LAST:event_jTextField7FocusLost

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
               
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
         String mobilenumber=jTextField5.getText();
         int mobile=mobilenumber.length();
         
               if(mobilenumber.matches("^[0-9]*$")){
                    
                    if(mobile==10){
                        jTextField5.setText("correct");
                    }
                   else{
                   jLabel18.setText("incorrect phone number");
                   jTextField5.setBackground(new Color(255,0,51));
               }
               }
               
               
        
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
         jTextField5.setEditable(true);
        jTextField5.setText(" ");
        jLabel18.setText(" ");
         jTextField5.setBackground(new Color(255,255,255));
         
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
                   String mobilenumber=jTextField5.getText();
                    int mobile=mobilenumber.length();
            if(mobile>10){
                  jTextField5.setEditable(false);
                   }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         AdminHome.opan=0;
         setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    

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
            java.util.logging.Logger.getLogger(PStudentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PStudentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PStudentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PStudentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PStudentDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lbldate;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextArea tatextarea;
    private javax.swing.JTextField txtaddresstudent;
    private javax.swing.JTextField txtcgpa;
    private javax.swing.JTextField txtgraduation;
    private javax.swing.JTextField txtpassoutmark10;
    private javax.swing.JTextField txtpassoutmark12;
    private javax.swing.JTextField txtpassuni;
    private javax.swing.JTextField txtpointgain10;
    private javax.swing.JTextField txtpointgain12;
    private javax.swing.JTextField txtschool10;
    private javax.swing.JTextField txtschool12;
    // End of variables declaration//GEN-END:variables
}
