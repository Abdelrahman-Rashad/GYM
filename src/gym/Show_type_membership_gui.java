package gym;
import java.awt.*;
import java.awt.event.*;
 import javax.swing.*;

public class Show_type_membership_gui extends JFrame implements ActionListener{
    JButton b1_show,back;
    JPanel p;
    JLabel l1_id,l2_username,l3_address,l4_contact,l5_membership;
    JButton resetButton;
    Color lightbutton = new Color(71,92,150);
    JTextField t1_id,t2_username,t3_address,t4_contact,t5_membership;
     String s[] = new String[4];
      static boolean check2;
    
    // constructor
     
      Show_type_membership_gui(boolean check){
          check2 = check;
      // style frame
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(false);
      this.setLocation(350,40 );
    
      // add panel
      p=new JPanel();
      add(p);
     
      // style of panel
      p.setBackground(Color.white);
      p.setLayout(null);
     
      // add image ....
      JLabel lbl = new JLabel();
      ImageIcon img = new ImageIcon("gym2.jpg");
      lbl.setIcon(img);
      lbl.setBounds(200,2,800,250);
      p.add(lbl);
     
      //initialise label
      l1_id= new JLabel("Enter id  :");
      l1_id.setBounds(180,215,125,30);
      l1_id.setFont(new Font("Arial",Font.PLAIN,15));
      l1_id.setForeground(Color.black);
      //add_label......
      p.add(l1_id);

      //initialise text field
      t1_id=new JTextField();
      t1_id.setBounds(250,215,125,30);
      //add_text field......
      p.add(t1_id);
       
      //initialise label
      l2_username= new JLabel("His name  :");
      l2_username.setBounds(135,360,125,25);
      l2_username.setFont(new Font("Arial",Font.PLAIN,15));
      l2_username.setForeground(Color.black);
      //add_label......
      p.add(l2_username);//pass
      
      //initialise text field
      t2_username=new JTextField();
      t2_username.setBounds(135,400,125,30);
      //add_text field......
      p.add(t2_username);
      
      //initialise label
      l3_address= new JLabel("His address  :");
      l3_address.setBounds(335,360,125,25);
      l3_address.setFont(new Font("Arial",Font.PLAIN,15));
      l3_address.setForeground(Color.black);
      //add_label......
      p.add(l3_address);//pass
      
      //initialise text field
      t3_address=new JTextField();
      t3_address.setBounds(335,400,125,30);
      //add_text field......
      p.add(t3_address);
      
      //initialise label
      l4_contact= new JLabel("his contact :");
      l4_contact.setBounds(135,450,125,25);
      l4_contact.setFont(new Font("Arial",Font.PLAIN,15));
      l4_contact.setForeground(Color.black);
      //add_label......
      p.add(l4_contact);//pass
      
      //initialise text field
      t4_contact=new JTextField();
      t4_contact.setBounds(135,485,125,30);
      //add_text field......
      p.add(t4_contact);
         
      //initialise label
      l5_membership= new JLabel("Type of membership :");
      l5_membership.setBounds(335,450,125,25);
      l5_membership.setFont(new Font("Arial",Font.PLAIN,15));
      l5_membership.setForeground(Color.black);
      //add_label......
      p.add(l5_membership);//pass
      
      //initialise text field
      t5_membership=new JTextField();
      t5_membership.setBounds(335,485,125,30);
      //add_text field......
      p.add(t5_membership);
      
      //initialise button
      b1_show= new JButton("Show Details");
     b1_show.setBounds(150,300,120,30);
     
     // style of button
     b1_show.setFont(new Font("Arial",Font.PLAIN,15));
     b1_show.setBackground(lightbutton);
     b1_show.setForeground(Color.black);
     
     //add event 
     b1_show.addActionListener(this);
     
     //add button 
     p.add(b1_show);
          
     //initialise button
     resetButton = new JButton("RESET");
     resetButton.setBounds(300,300,120,30);
      
      // style of button
     resetButton.setFont(new Font("Arial",Font.PLAIN,15));
     resetButton.setBackground(lightbutton);
     resetButton.setForeground(Color.black);
     
     //add event 
     resetButton.addActionListener(this);
     
     //add button 
     p.add(resetButton);
     

     //initialise button
      back=new JButton("Back");
         back.setBounds(50, 50, 80, 30);
     
      // style of button
     back.setFont(new Font("Arial",Font.PLAIN,15));
     back.setBackground(lightbutton);
     back.setForeground(Color.black);
     
     //add event 
     back.addActionListener(this);
     
     //add button 
     p.add(back);
      setTitle("add-edit-delete page"); //Title
      setSize(600,650); //size_frame
      setVisible(true);
      }
    @Override
    public void actionPerformed(ActionEvent ae) {
         //Coding Part of RESET button
        if (ae.getSource() == resetButton) {
            t1_id.setText("");
            t2_username.setText("");
            t3_address.setText("");
            t4_contact.setText("");
            t5_membership.setText("");
        }
        if(ae.getSource()==b1_show){
          
           Show_type_membership shw = new Show_type_membership();
           
       String s[] = shw.search(t1_id);
            t2_username.setText(s[0]);
             t3_address.setText(s[1]);
             t4_contact.setText(s[2]);
             t5_membership.setText(s[3]);
            
            //this.hide();
        }
  
        if(ae.getSource()==back){
            if(check2){
             admin ad2=new admin();
                        this.hide();
            }
              else{
             Employee ad2=new Employee();
                        this.hide();
            }
        }
    }

}