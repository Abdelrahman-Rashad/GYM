package gym;
import java.awt.*;
import java.awt.event.*;
import javafx.scene.Group;
import javax.swing.*;
/**
 *
 * @author vip
 */
  public class Member_gui extends JFrame implements ActionListener {
    
    JButton b1_add,b2_edit,b3_delete,back;
    JPanel p;
    JLabel l1_id,l2_username,l3_address,l4_contact,l5_membership;
    JButton resetButton;
    Color lightbutton = new Color(71,92,150);
    JTextField t1_id,t2_username,t3_address,t4_contact;
    JCheckBox ch1,ch2,ch3;
    ButtonGroup g1=new ButtonGroup();
    String st3;
      
    // constructor
      Member_gui(){
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
      l1_id.setBounds(80,215,125,30);
      l1_id.setFont(new Font("Arial",Font.PLAIN,15));
      l1_id.setForeground(Color.black);
      //add_label......
      p.add(l1_id);

      //initialise text field
      t1_id=new JTextField();
      t1_id.setBounds(80,245,125,30);
      //add_text field......
      p.add(t1_id);
       
      //initialise label
      l2_username= new JLabel("Enter username  :");
      l2_username.setBounds(80,285,125,25);
      l2_username.setFont(new Font("Arial",Font.PLAIN,15));
      l2_username.setForeground(Color.black);
      //add_label......
      p.add(l2_username);//pass
      
      //initialise text field
      t2_username=new JTextField();
      t2_username.setBounds(80,315,125,30);
      //add_text field......
      p.add(t2_username);
      l5_membership= new JLabel("Enter type of membership  :");
      l5_membership.setBounds(80,350,300,25);
      l5_membership.setFont(new Font("Arial",Font.PLAIN,15));
      l5_membership.setForeground(Color.black);
      //add_label......
      p.add(l5_membership);//pass
      
      //initialise check box
      ch1 = new JCheckBox("pay as you go");
      ch1.setBackground(Color.WHITE);
      ch1.setBounds(80,380,135,25);
         
      //add event
      //ch1.addItemListener(this); 
         
      //add check box 
      p.add(ch1);
      //initialise check box
      ch2 = new JCheckBox("Open membership");
      ch2.setBackground(Color.WHITE);
      ch2.setBounds(220,380,135,25);
         
      //add event
      //ch2.addItemListener(this); 
         
      //add check box 
      p.add(ch2);
      //initialise check box
      ch3 = new JCheckBox("Term membership");
      ch3.setBackground(Color.WHITE);
      ch3.setBounds(360,380,135,25);
         
      //add event
      //ch3.addItemListener(this); 
         
      //add check box 
      p.add(ch3);
      g1.add(ch1); g1.add(ch2); g1.add(ch3);
      //initialise label
      l3_address= new JLabel("address  :");
      l3_address.setBounds(300,215,125,30);
      l3_address.setFont(new Font("Arial",Font.PLAIN,15));
      l3_address.setForeground(Color.black);
      //add_label......
      p.add(l3_address);//pass
      
      //initialise text field
      t3_address=new JTextField();
      t3_address.setBounds(300,245,125,30);
      //add_text field......
      p.add(t3_address);
      
      //initialise label
      l4_contact= new JLabel("contact :");
      l4_contact.setBounds(300,285,125,25);
      l4_contact.setFont(new Font("Arial",Font.PLAIN,15));
      l4_contact.setForeground(Color.black);
      //add_label......
      p.add(l4_contact);//pass
      
      //initialise text field
      t4_contact=new JTextField();
      t4_contact.setBounds(300,315,125,30);
      //add_text field......
      p.add(t4_contact);
         
      //initialise button
      b1_add= new JButton("add");
     b1_add.setBounds(100,440,120,30);
     
     // style of button
     b1_add.setFont(new Font("Arial",Font.PLAIN,15));
     b1_add.setBackground(lightbutton);
     b1_add.setForeground(Color.black);
     
     //add event 
     b1_add.addActionListener(this);
     
     //add button 
     p.add(b1_add);
          
     //initialise button
     resetButton = new JButton("RESET");
     resetButton.setBounds(240,500,120,30);
      
      // style of button
     resetButton.setFont(new Font("Arial",Font.PLAIN,15));
     resetButton.setBackground(lightbutton);
     resetButton.setForeground(Color.black);
     
     //add event 
     resetButton.addActionListener(this);
     
     //add button 
     p.add(resetButton);
     
     //initialise button
     b3_delete = new JButton("Delete");
     b3_delete.setBounds(380,440,120,30);
      
      // style of button
     b3_delete.setFont(new Font("Arial",Font.PLAIN,15));
     b3_delete.setBackground(lightbutton);
     b3_delete.setForeground(Color.black);
     
     //add event 
     b3_delete.addActionListener(this);
     
     //add button 
     p.add(b3_delete);
     
     //initialise button
      b2_edit= new JButton("edit"); 
     b2_edit.setBounds(241,440,120,30);
     
      // style of button
     b2_edit.setFont(new Font("Arial",Font.PLAIN,15));
     b2_edit.setBackground(lightbutton);
     b2_edit.setForeground(Color.black);
     
     //add event 
     b2_edit.addActionListener(this);
     
     //add button 
     p.add(b2_edit);
     
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
      public String check(JCheckBox ch1,JCheckBox ch2,JCheckBox ch3){
           if(ch1.isSelected()){
               st3 = "pay_as_you_go";
           } 
           else if(ch2.isSelected()){
               st3 = "Open_membership";
           }
           else {
               st3 = "Term_membership";
           }
           return st3;
      }
    @Override
    public void actionPerformed(ActionEvent ae) {
         //Coding Part of RESET button
        if (ae.getSource() == resetButton) {
            t1_id.setText("");
            t2_username.setText("");
            t3_address.setText("");
            t4_contact.setText("");
        }
        if(ae.getSource()==b1_add){
            Member ts = new Member();
            String cc = check(ch1,ch2,ch3);
            ts.add(t1_id,t2_username,t3_address,t4_contact,cc);
            this.hide();
            Member_gui t3 = new Member_gui();

        }
         if(ae.getSource()==b2_edit){
            Member ts = new Member();
            String cc = check(ch1,ch2,ch3);
            ts.edit(t1_id,t2_username,t3_address,t4_contact,cc);
            this.hide();
            Member_gui t3 = new Member_gui();

        }
         if(ae.getSource()==b3_delete){
            Member ts = new Member();
          String cc = check(ch1,ch2,ch3);
          ts.delete(t1_id);
          this.hide();
          Member_gui t3 = new Member_gui();

        }
        
        if(ae.getSource()==back){
            Employee ad2=new Employee();
                        this.hide();

        }
    }
}