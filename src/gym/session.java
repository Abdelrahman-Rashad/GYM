
package gym;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class session {

     String s_name;
     String s_day;
     String s_time;
     String s_des;
     String s_name_trainer;
     public String s_size;
     
     public void add(JTextField s1 ,JTextField s2 ,JTextField s3,JTextField s4,JTextField s5,JTextField s6){
            s_name=s1.getText();
            s_day=s2.getText();
            s_time=s3.getText();
            s_des=s4.getText();
            s_name_trainer=s5.getText();
            s_size=s6.getText();
            String t_name,t_id,t_salary,t_contact;
            String t_name1,t_day,t_time ,t_des,t_name_trainer,t_size;
            boolean b=false;
            try{
            File f_user=new File("users.txt");
            Scanner s_user =new Scanner(f_user);
            File f_session=new File("session.txt");
            Scanner s_session =new Scanner(f_session);
            while(s_user.hasNext())
            {
                t_id=s_user.next();
                t_name=s_user.next();
                t_salary=s_user.next();
                t_contact=s_user.next();
                if(t_name.equals(s_name_trainer))
                {
                     b=true;   
                }
            
            }
            while(s_session.hasNext())
            {
                t_name1=s_session.next();
                t_day=s_session.next();
                t_time=s_session.next();
                t_des=s_session.next();
                t_name_trainer=s_session.next();
                t_size=s_session.next();
                
                
                if(b&&(t_name_trainer.equals(s_name_trainer)&&t_time.equals(s_time)&&t_day.equals(s_day)))
                {
                    b=false;
                } 
                
            
            }
            s_user.close();
            s_session.close();
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            if(b)
            {
                 try{
            FileWriter mywriter =new FileWriter("session.txt",true);
            
            mywriter.write(s_name+"\t");
            mywriter.write(s_day+"\t");
            mywriter.write(s_time+"\t");
            mywriter.write(s_des+"\t");
            mywriter.write(s_name_trainer+"\t");
            mywriter.write(s_size+"\n");
            
       
            mywriter.close();
            JOptionPane.showMessageDialog(null, "added Successfully");
            
            session_frame x=new session_frame();
            
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "added faild");
                session_frame v= new session_frame();
            }
            
            
   
     }
     public void edit(JTextField s1 ,JTextField s2 ,JTextField s3,JTextField s4,JTextField s5,JTextField s6){
            s_name=s1.getText();
            s_day=s2.getText();
            s_time=s3.getText();
            s_des=s4.getText();
            s_name_trainer=s5.getText();
            s_size=s6.getText();
            String t_name,t_id,t_salary,t_contact;
            String t_names,t_days,t_times ,t_dess,t_name_trainers,t_sizes;
            String t_name1,t_day,t_time ,t_des,t_name_trainer,t_size;
            boolean b=false;
            try{
            File f_user=new File("users.txt");
            Scanner s_user =new Scanner(f_user);
            File f_session=new File("session.txt");
            Scanner s_session =new Scanner(f_session);
            while(s_user.hasNext())
            {
                t_id=s_user.next();
                t_name=s_user.next();
                t_salary=s_user.next();
                t_contact=s_user.next();
                if(t_name.equals(s_name_trainer))
                {
                     b=true;   
                }
            
            }
            while(s_session.hasNext())
            {
                t_names=s_session.next();
                t_days=s_session.next();
                t_times=s_session.next();
                t_dess=s_session.next();
                t_name_trainers=s_session.next();
                t_sizes=s_session.next();
                
                
                if(b&&(t_name_trainers.equals(s_name_trainer)&&t_times.equals(s_time)&&t_days.equals(s_day)))
                {
                    b=false;
                }   
            }
            s_user.close();
            s_session.close();
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            if(b){
                try{
            File f=new File("session.txt");
            Scanner input =new Scanner(f);
            File f_temp=new File("temp.txt");
            FileWriter output =new FileWriter(f_temp,true);
            while(input.hasNext())
            {
                t_name1=input.next();
                t_day=input.next();
                t_time=input.next();
                t_des=input.next();
                t_name_trainer=input.next();
                t_size=input.next();
                
                
                output.write(t_name1+"\t");
                output.write(t_day+"\t");
                output.write(t_time+"\t");
                output.write(t_des+"\t");
                output.write(t_name_trainer+"\t");
                output.write(t_size+"\n");
                
                
            }
            input.close();
            output.close();
            f.delete();
             input =new Scanner(f_temp);
             output =new FileWriter(f,true);
            while(input.hasNext())
            {
                t_name1=input.next();
                t_day=input.next();
                t_time=input.next();
                t_des=input.next();
                t_name_trainer=input.next();
                t_size=input.next();
                
                if(t_name1.equals(s_name))
                {
                     output.write(s_name+"\t");
                     output.write(s_day+"\t");
                     output.write(s_time+"\t");
                     output.write(s_des+"\t");
                     output.write(s_name_trainer+"\t");
                     output.write(s_size+"\n");
                     
                     JOptionPane.showMessageDialog(null, "Modified successfully");
                }
                else{
                    output.write(t_name1+"\t");
                output.write(t_day+"\t");
                output.write(t_time+"\t");
                output.write(t_des+"\t");
                output.write(t_name_trainer+"\t");
                output.write(t_size+"\n");
                }   
            }
            input.close();
            output.close();
            f_temp.delete();
            session_frame x=new session_frame();
            }catch(Exception ea)
            {
                System.out.println(ea.getMessage());
            }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Modified faild");
                session_frame v= new session_frame();
            }
   
     }
     public void delete(JTextField s1 ,JTextField s2 ,JTextField s3,JTextField s4,JTextField s5,JTextField s6){
            s_name=s1.getText();
            s_day=s2.getText();
            s_time=s3.getText();
            s_des=s4.getText();
            s_name_trainer=s5.getText();
            s_size=s6.getText();
            
            String t_name,t_day,t_time ,t_des,t_name_trainer,t_size;
            try{
            File f=new File("session.txt");
            Scanner input =new Scanner(f);
            File f_temp=new File("temp.txt");
            FileWriter output =new FileWriter(f_temp,true);
            while(input.hasNext())
            {
                t_name=input.next();
                t_day=input.next();
                t_time=input.next();
                t_des=input.next();
                t_name_trainer=input.next();
                t_size=input.next();
                
                output.write(t_name+"\t");
                output.write(t_day+"\t");
                output.write(t_time+"\t");
                output.write(t_des+"\t");
                output.write(t_name_trainer+"\t");
                output.write(t_size+"\n");
                
            }
            input.close();
            output.close();
            f.delete();
             input =new Scanner(f_temp);
             output =new FileWriter(f,true);
            while(input.hasNext())
            {
                t_name=input.next();
                t_day=input.next();
                t_time=input.next();
                t_des=input.next();
                t_name_trainer=input.next();
                t_size=input.next();
                if(t_name.equals(s_name))
                {
                   //skip line
                    JOptionPane.showMessageDialog(null, "deleted successfully");
                }
                else{
                    output.write(t_name+"\t");
                output.write(t_day+"\t");
                output.write(t_time+"\t");
                output.write(t_des+"\t");
                output.write(t_name_trainer+"\t");
                output.write(t_size+"\n");
                }   
            }
            input.close();
            output.close();
            f_temp.delete();
            session_frame x=new session_frame();
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    
}
