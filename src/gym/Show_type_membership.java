package gym;
import java.io.File;
import java.io.FileWriter;         
import java.util.Scanner; 
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author vip
 */
public class Show_type_membership {
    //Show3_gui t3 = new Show3_gui();
     String id,name ;
    String s_search[]= new String[4];
    public String[] search(JTextField s){
       
           id = s.getText();
           
            String t_name,t_address,t_contact,t_id,t_membership ;
            
            try{
            File f=new File("members.txt");
            Scanner input =new Scanner(f);
            File f_temp2=new File("temp5.txt");
            FileWriter output =new FileWriter(f_temp2,true);
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
            
             input =new Scanner(f_temp2);
             output =new FileWriter(f,true);
             
           while(input.hasNext())
            {
                 t_id=input.next();
                t_name=input.next();
                t_address=input.next();
                t_contact=input.next();
                t_membership=input.next();
                  
                if(t_id.equals(id))
                {
                     output.write(t_id+"\t");
                     output.write(t_name+"\t");
                     output.write(t_address+"\t");
                     output.write(t_contact+"\t");
                     output.write(t_membership+"\n");
                  
                     s_search[0]=t_name;
                     s_search[1]=t_address;
                     s_search[2]=t_contact;
                     s_search[3]=t_membership;
                
                     JOptionPane.showMessageDialog(null, "The search was successful");
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
            f_temp2.delete();
            
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        return s_search ;
    }
}