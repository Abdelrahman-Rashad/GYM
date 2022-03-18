package gym;
import java.io.File;
import java.io.FileWriter;         
import java.io.IOException;
import java.util.Scanner; 
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JTextField;
/**
 *
 * @author Emad
 */
public class show_member_specificclass {
    String t_name;          
    String t_id;       
    String t_classname;
				
    

    String id;
    String classname ;   

String []s_search= new String[3];
    public String[] search(JTextField s1,JTextField s2){
    id = s1.getText();
    classname=s2.getText();
    

try{
             
            
            
            File session_1 = new File("class.txt");
                    Scanner scanner_1 = new Scanner(session_1);
                   
             while(scanner_1.hasNext())
            {
                t_classname = scanner_1.next();  
                t_id=scanner_1.next();
                t_name=scanner_1.next();
                
                
             
              if(t_classname.equals(classname)&&t_id.equals(id))
              {
                  s_search[0]=t_classname;
                     s_search[1]=t_id;
                     s_search[2]=t_name;
                     JOptionPane.showMessageDialog(null, "The search was successful");
              }
                 
            }
                    
            
            scanner_1.close();
            
            
            }
catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
return s_search;
}
    


}