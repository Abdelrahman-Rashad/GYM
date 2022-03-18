package gym;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Classes extends session{
    String c_name;
    String id_member;


    public void add(JTextField s1, JTextField s2) {
        c_name = s1.getText();
        id_member = s2.getText();
				String t_classname;
				String c_day ;
				String  c_time;
				String c_des;
                                String c_name_trainer;
                                String c_size;
                int size_sec=0;               
       
	   String name , address , contact, membership;
        String t_id;
		//String id_members;
       // String  t_cname, t_id1;
        boolean b = false;
        
            try {
                
            File f_session = new File("session.txt");
            Scanner s_session = new Scanner(f_session);
            File f_member = new File("members.txt");
            Scanner s_member = new Scanner(f_member);
            while (s_session.hasNext()){
                t_classname = s_session.next();  
                c_day = s_session.next();
                c_time = s_session.next();
                c_des = s_session.next();
                c_name_trainer = s_session.next();
                c_size = s_session.next();
                if(c_name.equals(t_classname)){
                size_sec= Integer.parseInt(c_size);
            }
		while(s_member.hasNext()){
						t_id=s_member.next();
						name=s_member.next();
						address=s_member.next();
						contact=s_member.next();
						membership=s_member.next();  
                                                
						   
			if (t_id.equals(id_member)) {
                            b = true;
                            
                            System.out.println("jhdfjkhkjdhfjkhdsjkf;jkwh;k");
                    
			  }			
			}
                
                
			
            }
	
             s_session.close();
            s_member.close();
                
        } catch (Exception e)
		{
            System.out.println(e.getMessage());
        }
            
		if (b==true&&size_sec!=0){ 
                    
                    //Integer.parseInt(c_size);
                   // for(int i=0;i<size_sec;i++){

                      
		try {
                    File f_class = new File("class.txt");
                    FileWriter mywriter = new FileWriter(f_class, true);
                    File f_member = new File("members.txt");
                    Scanner s_member = new Scanner(f_member);
                    
                    
                    
                    File session_1 = new File("session.txt");
                    Scanner scanner_1 = new Scanner(session_1);
                    File session_temp=new File("temp.txt");
            FileWriter output =new FileWriter(session_temp,true);
            while(scanner_1.hasNext())
            {
                t_classname = scanner_1.next();  
                c_day = scanner_1.next();
                c_time = scanner_1.next();
                c_des = scanner_1.next();
                c_name_trainer = scanner_1.next();
                c_size = scanner_1.next();
                
                output.write(t_classname+"\t");
                output.write(c_day+"\t");
                output.write(c_time+"\t");
                output.write(c_des+"\t");
                 output.write(c_name_trainer+"\t");
                 output.write(c_size+"\n");
                 
            }
                    
            output.close();
            scanner_1.close();
            session_1.delete();
                    
             scanner_1 =new Scanner(session_temp);
             output =new FileWriter(session_1,true);
             while(scanner_1.hasNext())
            {
                t_classname = scanner_1.next();  
                c_day = scanner_1.next();
                c_time = scanner_1.next();
                c_des = scanner_1.next();
                c_name_trainer = scanner_1.next();
                c_size = scanner_1.next();
                
                
                if(c_name.equals(t_classname)){
                     size_sec--;
                 output.write(t_classname+"\t");
                output.write(c_day+"\t");
                output.write(c_time+"\t");
                output.write(c_des+"\t");
                 output.write(c_name_trainer+"\t");
                 output.write(size_sec+"\n");
                 
                }
                else{
                    output.write(t_classname+"\t");
                output.write(c_day+"\t");
                output.write(c_time+"\t");
                output.write(c_des+"\t");
                 output.write(c_name_trainer+"\t");
                 output.write(c_size+"\n");
                }
                
                     
                  
                System.out.println(t_classname+" "+c_day+" "+c_time+" "+c_des+" "+c_name_trainer+" "+c_size);
                 
            
            }
             scanner_1.close();
            output.close();
                 session_temp.delete();
                    //Member k=new Member();
while(s_member.hasNext()){
						t_id=s_member.next();
						name=s_member.next();
						address=s_member.next();
						contact=s_member.next();
						membership=s_member.next();
                        if(id_member.equals(t_id)){
                        mywriter.write(c_name + "\t");
                        mywriter.write(id_member + "\t");
                        mywriter.write(name + "\n");
                        System.out.println(c_name +" "+id_member+" " +name+" " + address+" " +membership+" " +contact);
                        JOptionPane.showMessageDialog(null, "added Successfully");
                                             
                                                }
                        
                        
                }
                        mywriter.close();
s_member.close();
		} catch (Exception e) {
                    System.out.println(e.getMessage());
                }	//}
				}
                
                
             else {
                JOptionPane.showMessageDialog(null, "added faild");
                
                ClassesGui v = new ClassesGui();
            }
        


    }//end void add


    public void delete(JTextField s1, JTextField s2 ) {
        c_name = s1.getText();
        id_member = s2.getText();
//c_name +" "+id_member+" " +name+" " + email+" " +membership+" " +contact
        String t_classn ,t_name, t_id;
        try {
            File f = new File("class.txt");
            Scanner input = new Scanner(f);
            File f_temp = new File("temp.txt");
            FileWriter output = new FileWriter(f_temp, true);
            while (input.hasNext()) {
                t_classn=input.next();
	        t_id = input.next();
                t_name = input.next();
                

                output.write(t_classn + "\t");
	        output.write(t_name + "\t");
                output.write(t_id + "\n");
                

            }
            input.close();
            output.close();
            f.delete();
            input = new Scanner(f_temp);
            output = new FileWriter(f, true);
            while (input.hasNext()) {

                t_classn=input.next();
                t_id = input.next();
                t_name = input.next();
                
                System.out.println(t_classn+t_id+t_name);
                if (t_id.equals(id_member)&&t_classn.equals(c_name)) {
                    //skip line
                    JOptionPane.showMessageDialog(null, "deleted successfully");
                } else {
                    output.write(t_classn + "\t");
                    output.write(t_name + "\t");
                    output.write(t_id + "\n");
                    

                }
            }
            input.close();
            output.close();
            f_temp.delete();
            //ClassesGui c = new ClassesGui();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    }