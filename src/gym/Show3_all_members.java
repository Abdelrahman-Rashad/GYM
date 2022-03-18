package gym;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;         
import java.util.Scanner; 
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author vip
 */
public class Show3_all_members {
    //Show3_gui2 t3 = new Show3_gui2();
     String id;
    public void search(){
       
            
           
            String t_name,t_address,t_contact,t_id,t_membership ;
            
            try{
                
            File f=new File("members.txt");
            Scanner input =new Scanner(f);
            
           System.out.println("id\t"+"name\t"+"address\t"+"contact\t"+"membership\n");
            while(input.hasNext())
            {
               
                t_id=input.next();
               t_name=input.next();
                t_address=input.next();
                t_contact=input.next();
                t_membership=input.next();
               
                
                System.out.printf(t_id+"\t"+t_name+"\t"+t_address+"\t"+t_contact+"\t"+t_membership+"\n");
           
                 
            }
            input.close();
         

         
            
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
       
    }
    
}