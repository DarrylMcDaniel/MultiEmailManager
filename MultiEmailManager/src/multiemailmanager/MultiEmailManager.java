/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiemailmanager;
import java.util.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Sazib
 */
public class MultiEmailManager {
     String password="";
     public String globalpwmng="";
 public String readerEmailpw(String Source) { //This Method Stores Password For Initial Login "Sazib" 1st method for accessing login
     
        try
        {
            File f = new File(Source);
            if(f.exists())
            {
               Scanner scn = new Scanner(f);
            password=scn.nextLine();
//             FileWriter fr = new FileWriter(f);
//          BufferedWriter br  = new BufferedWriter(fr);
//            br.write(password);
            if(globalpwmng.equals("")){
                globalpwmng=password;
            }
               
            }
            
            
            
      
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return password;
    }
 
 
 public void writerEmailpw(String Source) { //This Method Stores Password For Initial Login "Sazib" 1st method for accessing login
     
        try
        {
         
          Scanner scan = new Scanner(System.in);
         // File f = new File(Source);
          String oldpw=readerEmailpw(Source);
          FileWriter fr = new FileWriter(Source);
          BufferedWriter br  = new BufferedWriter(fr);
          
          String newpw="";
          String oldpwVerify=JOptionPane.showInputDialog("ENTER Old Password");
          if(oldpw.equals(oldpwVerify)) {
            newpw=JOptionPane.showInputDialog("ENTER NEW PASSWORD");
                br.write(newpw);
                br.flush();
          }else {
               br.write(oldpw);
               br.flush();
              JOptionPane.showMessageDialog(null, "WRONG Password Provided");
             
          }
        
        
        
              
      
   
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
      
    }
  public void writerEmailAcc(String Source,String username,String password) { //This Method Stores Password For Initial Login "Sazib" 1st method for accessing login
     
        try
        {
         File f=new File(Source);
         if(f.exists()) {
        //  Scanner scan = new Scanner(System.in);
         // File f = new File(Source);
          FileWriter fr = new FileWriter(Source);
          BufferedWriter br  = new BufferedWriter(fr);
          
          br.write(username);
          br.newLine();
          br.write(password);
          br.newLine();
          br.flush();
          }else {
               PrintWriter p=new PrintWriter(f);
               p.println("written");
              writerEmailAcc(Source,username,password);
             
             
          }
        
        
        
              
      
   
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
      
    }
     
      
    
    
    
    
    public static void main(String[] args) {
     MultiEmailManager o=new MultiEmailManager();
     o.readerEmailpw("DoNotOpen.txt");
        
    }
    
}
