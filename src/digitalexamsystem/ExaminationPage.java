/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package digitalexamsystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import Project.Projectconnectionprovider;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author NATNAEL
 */
public class ExaminationPage extends javax.swing.JFrame {

    Random random=new Random();
    public String questionid;
    //public String questionno="1";
    
    public int [] arr=new int[10];
    public int [] choice=new int[10];
     public int [] latter=new int[10];
    public String answer;
    int [] solved={0,0,0,0,0,0,0,0,0,0};
    public static int min=0;
    int ct=0;
    int qID;
    int trku=0;
    int che=0;
    int i=0;
    public static int sec=0;
    public static int mark=0;
    public static int next=0;
    public static int reserve=0;
    private String exam;
    boolean found=true;
       public void answerCheck(){
           String studentAnswer=" ";
           if(jRadioButton1.isSelected()){
               studentAnswer=jRadioButton1.getText();
              
               if(che==0){
               //solved[loginhere.count]=1;
               solved[Index.count]=1;
                 }
               else{
               solved[trku]=1;   
               }
           }
           else if(jRadioButton2.isSelected()){
               studentAnswer=jRadioButton2.getText();
               if(che==0){
               //solved[loginhere.count]=1;
                solved[Index.count]=1;
                 }
               else{
               solved[trku]=1;   
               }
           }
           else if(jRadioButton3.isSelected()){
               studentAnswer=jRadioButton3.getText();
               if(che==0){
               //solved[loginhere.count]=1;
                solved[Index.count]=1;
                 }
               else{
               solved[trku]=1;   
               }
           }
           else if(jRadioButton4.isSelected()){
               studentAnswer=jRadioButton4.getText();
               if(che==0){
               //solved[loginhere.count]=1;
               solved[Index.count]=1;
                 }
               else{
               solved[trku]=1;   
               }
           }
           //mark count
           if(studentAnswer.equals(answer)){
               mark=mark+1;
               String mark1=String.valueOf(mark);
               jLabel18.setText(mark1);
           }
           
           //clear radio button
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
             
           /* for(int j=0;j<10;j++){
                if(solved[j]==0){
                    found=false;
                }
            }*/
           //if(loginhere.count==9&& solved[0]==1 && solved[1]==1&&solved[2]==1&&solved[3]==1&&solved[4]==1&&solved[5]==1&&solved[6]==1&&solved[7]==1&&solved[8]==1&&solved[9]==1){
              if(Index.count==9&& solved[0]==1 && solved[1]==1&&solved[2]==1&&solved[3]==1&&solved[4]==1&&solved[5]==1&&solved[6]==1&&solved[7]==1&&solved[8]==1&&solved[9]==1){ 
               btntest.setVisible(false);
                
              
           }
           //solved[0]==1 && solved[1]==1&&solved[2]==1&&solved[3]==1&&solved[4]==1&&solved[5]==1&&solved[6]==1&&solved[7]==1&&solved[8]==1&&solved[9]==1
           //else if(loginhere.count==9){
               else if( Index.count==9){
               che=1;
               boolean chek=true;
               while(chek){
               if(solved[ct]==0){
                   qID=arr[ct];
                   trku=ct;
                   chek=false;
               }
                   ct++;
               if(ct==10){
                   ct=0;
               }
               }
           }
            //if(loginhere.count<9){
                if(Index.count<9){
            //loginhere.count++;
             Index.count++;
            qID=arr[Index.count];
            //qID=arr[loginhere.count];
            }
       }
       public void question(){
           try{
            Connection con=Projectconnectionprovider.getConnection();
            Statement st=con.createStatement();
            //if(loginhere.count<10){
            if("Java".equals(exam)){
            ResultSet rs1=st.executeQuery("select * from  questions where CID='"+0+"' and  ID='"+qID+"'");
             while(rs1.next()){
                 if(che==0){
                 //jLabel16.setText(String.valueOf(loginhere.count+1));
                  jLabel16.setText(String.valueOf(Index.count+1));
                 }else{
                   jLabel16.setText(String.valueOf(trku+1));  
                 }
                 jLabel20.setText(rs1.getString(4));
                 jRadioButton1.setText(rs1.getString(choice[0]));
                 jRadioButton2.setText(rs1.getString(choice[1]));
                 jRadioButton3.setText(rs1.getString(choice[2]));
                 jRadioButton4.setText(rs1.getString(choice[3]));
                 answer=rs1.getString(9);
             }
            }
            else if("Computer Network".equals(exam)){
             ResultSet rs1=st.executeQuery("select * from  questions where CID='"+1+"' and ID='"+qID+"'");
             while(rs1.next()){
                    //if(loginhere.count<10){
                         if(Index.count<10){
                        //jLabel16.setText(String.valueOf(loginhere.count+1));
                          jLabel16.setText(String.valueOf(Index.count+1));
                    }
                    else{
                      jLabel16.setText(String.valueOf(trku+1));  
                     }
                 jLabel20.setText(rs1.getString(4));
                 jRadioButton1.setText(rs1.getString(choice[0]));
                 jRadioButton2.setText(rs1.getString(choice[1]));
                 jRadioButton3.setText(rs1.getString(choice[2]));
                 jRadioButton4.setText(rs1.getString(choice[3]));
                 answer=rs1.getString(9);
             }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
       }
      
       
        public void Submit(){
          String rollNo=lblrollno.getText();
          answerCheck();
          
          try{
              Connection con=Projectconnectionprovider.getConnection();
              Statement st=con.createStatement();
              if("Java".equals(exam)){
              st.executeUpdate("update student set mark='"+mark+"' where regno='"+rollNo+"'");
              String mark1=String.valueOf(mark);
              setVisible(false);
              new Succsessfullysubmited(mark1,rollNo).setVisible(true);
              }
              else if("Computer Network".equals(exam)){
              st.executeUpdate("update student set markcn='"+mark+"' where regno='"+rollNo+"'");
              String mark1=String.valueOf(mark);
              setVisible(false);
              new Succsessfullysubmited(mark1,rollNo).setVisible(true);
              }
              
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
          }
        } 
        
    public ExaminationPage() {
        initComponents();
        }
    Timer time;
 public ExaminationPage(String regno,String exam) {
        this.exam=exam;
        initComponents();
        SimpleDateFormat dformat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        lbldate.setText(dformat.format(date));
        lblrollno.setText(regno);
         //switch(loginhere.examcode){
             switch(Index.examcode){
             case 1:
             int [] arr2={2,4,6,8,1,9,7,3,10,5};
             int [] cho1={5,7,6,8};
             arr=arr2;
             choice=cho1;
             break;
             case 2:
             int [] arr3={4,6,2,9,1,8,5,3,10,7};
             int [] cho2={6,5,7,8};
             arr=arr3;
             choice=cho2;
             break;
              case 3:
             int [] arr4={1,3,10,7,4,8,5,6,2,9};
              int [] cho3={5,6,7,8};
             arr=arr4;
             choice=cho3;
             break;
              case 4:
             int [] arr5={5,6,8,2,10,1,7,3,9,4};
              int [] cho4={7,6,5,8};
             arr=arr5;
             choice=cho4;
             break;
              case 5:
             int [] arr6={7,6,5,2,9,1,8,4,10,3};
              int [] cho5={6,7,5,8};
             arr=arr6;
             choice=cho5;
             break;
              case 6:
             int [] arr7={9,10,5,3,7,1,4,2,6,8};
              int [] cho6={5,7,6,8};
             arr=arr7;
             choice=cho6;
             break;
              case 7:
             int [] arr8={6,1,8,4,9,7,5,3,10,2};
              int [] cho7={5,6,7,8};
             arr=arr8;
             choice=cho7;
             break;
              case 8:
             int [] arr9={2,4,6,8,10,1,3,5,7,9};
              int [] cho8={6,7,5,8};
             arr=arr9;
             choice=cho8;
             break;
              case 9:
             int [] arr10={10,9,8,7,5,6,3,4,1,2};
             int [] cho9={6,5,7,8};
             arr=arr10;
             choice=cho9;
             break;
              case 10:
             int [] arr11={3,6,9,1,4,7,10,8,5,2};
             int [] cho10={7,6,5,8};
             arr=arr11;
             choice=cho10;
             break;
         }
            //questionid=String.valueOf(arr[count]);
        
        try{
            Connection con=Projectconnectionprovider.getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from student where regno='"+regno+"'");
            while(rs.next()){
                jLabel12.setText(rs.getString(3));
                jLabel19.setText(rs.getString(4));
            }
            if("Java".equals(this.exam)){
             //ResultSet rs1=st.executeQuery("select * from  questions where CID='"+0+"' and ID='"+arr[loginhere.count]+"'");
              ResultSet rs1=st.executeQuery("select * from  questions where CID='"+0+"' and ID='"+arr[Index.count]+"'");
             while(rs1.next()){
                  //jLabel16.setText(String.valueOf(loginhere.count+1));
                 jLabel16.setText(String.valueOf(Index.count+1));
                 jLabel20.setText(rs1.getString(4));
                 jRadioButton1.setText(rs1.getString(choice[0]));
                 jRadioButton2.setText(rs1.getString(choice[1]));
                 jRadioButton3.setText(rs1.getString(choice[2]));
                 jRadioButton4.setText(rs1.getString(choice[3]));
                 answer=rs1.getString(9);
             }
            }
            else if("Computer Network".equals(this.exam)){
             //ResultSet rs1=st.executeQuery("select * from  questions where CID='"+1+"' and ID='"+arr[loginhere.count]+"'");
             ResultSet rs1=st.executeQuery("select * from  questions where CID='"+1+"' and ID='"+arr[Index.count]+"'");
             while(rs1.next()){
                 //jLabel16.setText(String.valueOf(loginhere.count+1));
                 jLabel16.setText(String.valueOf(Index.count+1));
                 jLabel20.setText(rs1.getString(4));
                 jRadioButton1.setText(rs1.getString(choice[0]));
                 jRadioButton2.setText(rs1.getString(choice[1]));
                 jRadioButton3.setText(rs1.getString(choice[2]));
                 jRadioButton4.setText(rs1.getString(choice[3]));
                 answer=rs1.getString(8);
             }
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        setLocationRelativeTo(this);
        time=new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                lblsecond.setText(String.valueOf(sec));
                lblminute.setText(String.valueOf(min));
                if(sec==60){
                    sec=0;
                    min++;
                    //time ends
                    if(min==2){//why?
                        time.stop();
                        btntest.setVisible(false);
                        answerCheck();
                        Submit();
                    }
                }
                sec++;
            }
            
        });
        time.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblminute = new javax.swing.JLabel();
        lblsecond = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblrollno = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btntest = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/index student.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("welcome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date:");

        lbldate.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbldate.setForeground(new java.awt.Color(255, 255, 255));
        lbldate.setText("Today");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Time Allowed:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("2 Min");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Time Taken:");

        lblminute.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblminute.setForeground(new java.awt.Color(153, 255, 51));
        lblminute.setText("00");

        lblsecond.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblsecond.setForeground(new java.awt.Color(204, 255, 51));
        lblsecond.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(292, 292, 292)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblminute, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsecond, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(lbldate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblminute)
                                .addComponent(lblsecond))
                            .addComponent(jLabel7))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Reg No:");

        lblrollno.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblrollno.setForeground(new java.awt.Color(255, 255, 255));
        lblrollno.setText("1000");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Name");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Natnael");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total Question:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("10");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("00");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Berhanu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblrollno, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblrollno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel20.setText("Question Demo?");

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/save.png"))); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(".");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("00");

        btntest.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btntest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalexamsystem/Next.png"))); // NOI18N
        btntest.setText("Next");
        btntest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntestMouseClicked(evt);
            }
        });
        btntest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btntest, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(396, 396, 396)
                        .addComponent(jButton2)))
                .addContainerGap(226, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jRadioButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jRadioButton2)
                        .addGap(48, 48, 48)
                        .addComponent(jRadioButton3)
                        .addGap(48, 48, 48)
                        .addComponent(jRadioButton4)
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntest, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(205, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int a =JOptionPane.showConfirmDialog(null, "Do you relly want to submit?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
             answerCheck();
             Submit();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
             }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton2.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
             }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if(jRadioButton3.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
             }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if(jRadioButton4.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton1.setSelected(false);
             }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void btntestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntestMouseClicked
        answerCheck();
        question();
    }//GEN-LAST:event_btntestMouseClicked

    private void btntestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntestActionPerformed

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
            java.util.logging.Logger.getLogger(ExaminationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExaminationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExaminationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExaminationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExaminationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntest;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblminute;
    private javax.swing.JLabel lblrollno;
    private javax.swing.JLabel lblsecond;
    // End of variables declaration//GEN-END:variables
}
