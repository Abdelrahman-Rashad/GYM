package gym;
import java.io.File;
import java.io.FileWriter;         
import java.util.Scanner; 
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author vip
 */
public class Member extends session  {
     
    
   String st1,st2,st3,st4,st5;
    
    public void edit(JTextField s1 ,JTextField s2 ,JTextField s3,JTextField s4,String s5){
            st1=s1.getText();
            st2=s2.getText();
            st3=s3.getText();
            st4=s4.getText();
            st5= s5;
            st5=s5;
             String t_name,t_id,t_address,t_contact,t_membership;
        try{
           
            File f=new File("members.txt");
            Scanner input =new Scanner(f);
            File f_temp=new File("temp.txt");
            FileWriter output =new FileWriter(f_temp,true);
            while(input.hasNext())
            {
                t_id=input.next();
                t_name=input.next();
                
                t_address=input.next();
                t_contact=input.next();
                  t_membership=input.next();
                 output.write(t_id+"\t");
                output.write(t_name+"\t");
               
                output.write(t_address+"\t");
                output.write(t_contact+"\t");
                   output.write(t_membership+"\n");
                    System.out.println(t_id+t_name+t_address+t_contact);
            }
             input.close();
            output.close();
            f.delete();
             input =new Scanner(f_temp);
             output =new FileWriter(f,true);
             
             while(input.hasNext())
            {
                t_id=input.next();
                t_name=input.next();
                t_address=input.next();
                t_contact=input.next();
                t_membership=input.next();
                
                if(t_id.equals(st1))
                {
                    
                     output.write(st1+"\t");
                      output.write(st2+"\t");
                    
                     output.write(st3+"\t");
                     output.write(st4+"\t");
                     output.write(st5+"\n");
                     JOptionPane.showMessageDialog(null, "Modified successfully");
                     
                }
                else{
                      output.write(t_id+"\t");
                     output.write(t_name+"\t");
                   
                     output.write(t_address+"\t");
                     output.write(t_contact+"\t");
                     output.write(t_membership+"\n");
                 
                }   
                 
            
            }
             input.close();
             output.close();
             f_temp.delete();
        }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
    }
    
    public void add(JTextField s1 ,JTextField s2 ,JTextField s3,JTextField s4,String s5) {
            st1=s1.getText();
            st2=s2.getText();
            st3=s3.getText();
            st4=s4.getText();
             st5=s5;
         try {
        FileWriter fw = new FileWriter("members.txt", true);
             fw.write(st1+"\t");
             fw.write(st2+"\t");
             
             fw.write(st3+"\t");
             fw.write(st4+"\t");
             fw.write(st5+"\n");
             fw.close(); 
                     JOptionPane.showMessageDialog(null, "added successfully");
 
        } catch (Exception e) {                   
            System.out.print(e.toString());
        }         
  }

    public void delete(JTextField s1) {
            st1=s1.getText();

             String t_name,t_id,t_address,t_contact,t_membership;
       try{
           
           File f=new File("members.txt");
            Scanner input =new Scanner(f);
            File f_temp=new File("temp.txt");
            FileWriter output =new FileWriter(f_temp,true);
            while(input.hasNext())
            {
                t_id=input.next();
                t_name=input.next();
                t_address=input.next();
                t_contact=input.next();
                t_membership=input.next();
                
                output.write(t_id+"\t");
                output.write(t_name+"\t");
                output.write(t_address+"\t");
                output.write(t_contact+"\t");
                output.write(t_membership+"\n");
                    
            }
             input.close();
            output.close();
            f.delete();
             input =new Scanner(f_temp);
             output =new FileWriter(f,true);
             while(input.hasNext())
            {
                t_id=input.next();
                t_name=input.next();
                t_address=input.next();
                t_contact=input.next();
                t_membership=input.next();
                 System.out.println(t_id+t_name+t_address+t_contact+t_membership);
                if(t_id.equals(st1))
                {
                     //skip line
                    JOptionPane.showMessageDialog(null, "deleted successfully");
                }
                else{
                     output.write(t_id+"\t");
                     output.write(t_name+"\t");
                     output.write(t_address+"\t");
                     output.write(t_contact+"\t");
                      output.write(t_membership+"\n");
                     
                  
                }   
                 
            
            }
             input.close();
                 output.close();
                 f_temp.delete();
        }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
    }

    
}