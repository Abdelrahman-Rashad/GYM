package gym;
import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
/**
 *
 * @author vip
 */
public class Trainer_gui extends JFrame implements ActionListener {
    
    JButton b1,b2,b3,b4,back;
    JPanel p;
    JLabel l1,l2,l3,l4;
    JButton resetButton;
    Color lightbutton = new Color(71,92,150);
    JTextField t1,t2,t3,t4;
    
    // constructor
      Trainer_gui(){
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
      l1= new JLabel("Enter id  :");
      l1.setBounds(80,215,125,30);
      l1.setFont(new Font("Arial",Font.PLAIN,15));
      l1.setForeground(Color.black);
      //add_label......
      p.add(l1);

      //initialise text field
      t1=new JTextField();
      t1.setBounds(80,245,125,30);
      //add_text field......
      p.add(t1);
       
      //initialise label
      l2= new JLabel("Enter username  :");
      l2.setBounds(80,285,125,25);
      l2.setFont(new Font("Arial",Font.PLAIN,15));
      l2.setForeground(Color.black);
      //add_label......
      p.add(l2);//pass
      
      //initialise text field
      t2=new JTextField();
      t2.setBounds(80,315,125,30);
      //add_text field......
      p.add(t2);
      
      //initialise label
      l3= new JLabel("salary  :");
      l3.setBounds(300,215,125,30);
      l3.setFont(new Font("Arial",Font.PLAIN,15));
      l3.setForeground(Color.black);
      //add_label......
      p.add(l3);//pass
      
      //initialise text field
      t3=new JTextField();
      t3.setBounds(300,245,125,30);
      //add_text field......
      p.add(t3);
      
      //initialise label
      l4= new JLabel("contact :");
      l4.setBounds(300,285,125,25);
      l4.setFont(new Font("Arial",Font.PLAIN,15));
      l4.setForeground(Color.black);
      //add_label......
      p.add(l4);//pass
      
      //initialise text field
      t4=new JTextField();
      t4.setBounds(300,315,125,30);
      //add_text field......
      p.add(t4);
         
      //initialise button
      b1= new JButton("add");
     b1.setBounds(100,440,120,30);
     
     // style of button
     b1.setFont(new Font("Arial",Font.PLAIN,15));
     b1.setBackground(lightbutton);
     b1.setForeground(Color.black);
     
     //add event 
     b1.addActionListener(this);
     
     //add button 
     p.add(b1);
          
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
     b3 = new JButton("Delete");
     b3.setBounds(380,440,120,30);
      
      // style of button
     b3.setFont(new Font("Arial",Font.PLAIN,15));
     b3.setBackground(lightbutton);
     b3.setForeground(Color.black);
     
     //add event 
     b3.addActionListener(this);
     
     //add button 
     p.add(b3);
     
     //initialise button
      b2= new JButton("edit"); 
     b2.setBounds(241,440,120,30);
     
      // style of button
     b2.setFont(new Font("Arial",Font.PLAIN,15));
     b2.setBackground(lightbutton);
     b2.setForeground(Color.black);
     
     //add event 
     b2.addActionListener(this);
     
     //add button 
     p.add(b2);
     
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
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        }
        if(ae.getSource()==b1){
            Trainer ty = new Trainer();
            
            ty.add(t1, t2, t3, t4);
            this.hide();
        }
         if(ae.getSource()==b2){
            Trainer ty = new Trainer();
       
            ty.edit(t1, t2, t3,t4 );
            this.hide();
        }
         if(ae.getSource()==b3){
            Trainer ty = new Trainer();
           
            ty.delete(t1, t2, t3,t4 );
            this.hide();
        }
        
        if(ae.getSource()==back){
            admin ad2=new admin();
                        this.hide();

        }
    }

    
    
}