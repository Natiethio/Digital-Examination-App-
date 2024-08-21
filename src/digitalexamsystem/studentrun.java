/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalexamsystem;

/**
 *
 * @author NATNAEL
 */
public class studentrun extends Thread{
   static boolean reserved=true;
  public studentrun(){
      
  } 
  public studentrun(boolean test){
      reserved=test;
  } 
  public void run() {
        InstructionStudent inn=new InstructionStudent();
        inn.socket(Index.name);
    }
}
