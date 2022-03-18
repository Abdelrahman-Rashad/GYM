package gym;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Emad
 */
public class show_member_specificclass_gui extends JFrame implements ActionListener {
    JButton b1_show;
    JButton back;
    JPanel p;
    JLabel idsc;
    JLabel classc;
    JLabel usernamesc;
    JLabel addresssc;
    JLabel contactsc;
    JLabel membershipsc;
    JButton resetButton;
    Color lightbutton = new Color(71,92,150);
    JTextField t1_id;
    JTextField t2_username;
    JTextField t3_address;
    JTextField t4_contact;
    JTextField t5_membership;
    JTextField t6_classname;
      JTextField g3,g4;

show_member_specificclass_gui(){
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
      ImageIcon img = new ImageIcon("gymImage.jpg");
      lbl.setIcon(img);
      lbl.setBounds(200,2,800,250);
      p.add(lbl);
     
      //initialise label
      idsc= new JLabel("Enter id  :");
     
      idsc.setBounds(80,240,100,25);
      idsc.setFont(new Font("Arial",Font.PLAIN,15));
      idsc.setForeground(Color.black);
      //add_label......
      p.add(idsc);

      //initialise text field
      t1_id=new JTextField();
      t1_id.setBounds(160,240,110,30);
      //add_text field......
      p.add(t1_id);
      //initialise label
      classc= new JLabel("Enter class  :");
      classc.setBounds(300,240,200,25);

      classc.setFont(new Font("Arial",Font.PLAIN,15));
      classc.setForeground(Color.black);
      
      //add_label......
      p.add(classc);

      //initialise text field
      t6_classname=new JTextField();
      t6_classname.setBounds(405,240,110,30);
      //add_text field......
      p.add(t6_classname);
      
      
      
//initialise label
      usernamesc= new JLabel("class name  :");
      usernamesc.setBounds(135,360,125,25);
      usernamesc.setFont(new Font("Arial",Font.PLAIN,15));
      usernamesc.setForeground(Color.black);
      //add_label......
      p.add(usernamesc);//pass
      
      //initialise text field
      t2_username=new JTextField();
      t2_username.setBounds(135,400,125,30);
      //add_text field......
      p.add(t2_username);
      
      //initialise label
      addresssc= new JLabel("Id of member  :");
      addresssc.setBounds(335,360,125,25);
      addresssc.setFont(new Font("Arial",Font.PLAIN,15));
      addresssc.setForeground(Color.black);
      //add_label......
      p.add(addresssc);//pass
      
      //initialise text field
      t3_address=new JTextField();
      t3_address.setBounds(335,400,125,30);
      //add_text field......
      p.add(t3_address);
      
      
    
      
         
      //initialise label
      membershipsc= new JLabel("name of member :");
      membershipsc.setBounds(335,450,125,25);
      membershipsc.setFont(new Font("Arial",Font.PLAIN,15));
      membershipsc.setForeground(Color.black);
      //add_label......
      p.add(membershipsc);//pass
      
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
      setTitle("show member in specific class"); //Title
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
t6_classname.setText("");

            t5_membership.setText("");
            
        }
        if(ae.getSource()==b1_show){
            show_member_specificclass shw = new show_member_specificclass();
          String s[] =shw.search(t1_id,t6_classname);
            t2_username.setText(s[0]);
            t3_address.setText(s[1]);
            t5_membership.setText(s[2]);
            
            
            
            
        }
  
        if(ae.getSource()==back){
            Employee ad2=new Employee();
            this.hide();
            
        }
      

}
}