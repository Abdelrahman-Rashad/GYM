
package gym;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.*;
public class view1 {
    
    String id ;
    String s_search[]= new String[3];
    public String[] search(JTextField s){
        
        id=s.getText() ;
        
        
            String t_name,t_day,t_time ,t_mem1,t_mem2,t_mem3 ,t_mem4 ;
            
            try{
            File f=new File("session.txt");
            Scanner input =new Scanner(f);
            File f_temp=new File("temp.txt");
            FileWriter output =new FileWriter(f_temp,true);
            int count = 0;
            while(input.hasNext())
            {
                t_name=input.next();
                t_day=input.next();
                t_time=input.next();
                t_mem1=input.next();
                t_mem2=input.next();
                t_mem3=input.next();
                t_mem4=input.next();
                
                output.write(t_name+"\t");
                output.write(t_day+"\t");
                output.write(t_time+"\t");
                output.write(t_mem1+"\t");
                output.write(t_mem2+"\t");
                output.write(t_mem3+"\t");
                output.write(t_mem4+"\n");
                
                count++;
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
                t_mem1=input.next();
                t_mem2=input.next();
                t_mem3=input.next();
                t_mem4=input.next();
                
                     
                     
                if(t_mem1.equals(id)||t_mem2.equals(id)||t_mem3.equals(id)||t_mem4.equals(id))
                {
                     
                     output.write(t_name+"\t");
                     output.write(t_day+"\t");
                     output.write(t_time+"\t");
                     output.write(t_mem1+"\t");
                     output.write(t_mem2+"\t");
                     output.write(t_mem3+"\t");
                     output.write(t_mem4+"\n");
                     s_search[0]=t_name;
                     s_search[1]=t_day;
                     s_search[2]=t_time;
                     
                     JOptionPane.showMessageDialog(null, "The search was successful");
                }
                else{
                    output.write(t_name+"\t");
                output.write(t_day+"\t");
                output.write(t_time+"\t");
                output.write(t_mem1+"\t");
                output.write(t_mem2+"\t");
                output.write(t_mem3+"\t");
                output.write(t_mem4+"\n");
                }   
            }
            input.close();
            output.close();
            f_temp.delete();
                System.out.println(count);
            
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        return s_search ;
    }
}
