package gym;
import java.io.File;
import java.io.FileWriter;         
import java.util.Scanner; 
import javax.swing.JOptionPane;
import javax.swing.JTextField;




public class Trainer extends session implements email {
    Trainer_gui t3 = new Trainer_gui();
   private String name;
   private int salary;
   private int id;
   private String contact;
   String st1,st2,st3,st4;
   
    @Override
   public void add(JTextField s1 ,JTextField s2 ,JTextField s3,JTextField s4) {
            st1=s1.getText();
            st2=s2.getText();
            st3=s3.getText();
            st4=s4.getText();
         try {
        FileWriter fw = new FileWriter("users.txt", true);
             fw.write(st1+"\t");
             fw.write(st2+"\t");
             
             fw.write(st3+"\t");
             fw.write(st4+"\n");
             fw.close(); 
                     JOptionPane.showMessageDialog(null, "Added successfully");
 
        } catch (Exception e) {                   
            System.out.print(e.toString());
        }         
  }
    @Override
    public void edit(JTextField s1 ,JTextField s2 ,JTextField s3,JTextField s4){
            st1=s1.getText();
            st2=s2.getText();
            st3=s3.getText();
            st4=s4.getText();
             String t_name,t_id,t_salary,t_contact;
        try{
           
            File f=new File("users.txt");
            Scanner input =new Scanner(f);
            File f_temp=new File("temp.txt");
            FileWriter output =new FileWriter(f_temp,true);
            while(input.hasNext())
            {
                t_id=input.next();
                t_name=input.next();
                
                t_salary=input.next();
                t_contact=input.next();
                 output.write(t_id+"\t");
                output.write(t_name+"\t");
               
                output.write(t_salary+"\t");
                output.write(t_contact+"\n");
                    System.out.println(t_id+t_name+t_salary+t_contact);
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
                t_salary=input.next();
                t_contact=input.next();
                
                if(t_id.equals(st1))
                {
                    
                     output.write(st1+"\t");
                      output.write(st2+"\t");
                    
                     output.write(st3+"\t");
                     output.write(st4+"\n");
                     JOptionPane.showMessageDialog(null, "Modified successfully");
                     
                }
                else{
                      output.write(t_id+"\t");
                     output.write(t_name+"\t");
                   
                     output.write(t_salary+"\t");
                     output.write(t_contact+"\n");
                 
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
    
    @Override
    public void delete(JTextField s1 ,JTextField s2 ,JTextField s3,JTextField s4) {
            st1=s1.getText();
            st2=s2.getText();
            st3=s3.getText();
            st4=s4.getText();
             String t_name,t_id,t_salary,t_contact;
       try{
           
            File f=new File("users.txt");
            Scanner input =new Scanner(f);
            File f_temp=new File("temp.txt");
            FileWriter output =new FileWriter(f_temp,true);
            while(input.hasNext())
            {
                 t_id=input.next();
                t_name=input.next();
               
                t_salary=input.next();
                t_contact=input.next();
                output.write(t_id+"\t");
                output.write(t_name+"\t");
                
                output.write(t_salary+"\t");
                output.write(t_contact+"\n");
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
                t_salary=input.next();
                t_contact=input.next();
                if(t_id.equals(st1))
                {
                     //skip line
                    JOptionPane.showMessageDialog(null, "deleted successfully");
                }
                else{
                     output.write(t_id+"\t");
                     output.write(t_name+"\t");
                     output.write(t_salary+"\t");
                     output.write(t_contact+"\n");
                  
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
