package gym;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class startpage extends JFrame implements ActionListener {
    // variables
    JLabel label1,label2,label3;
    Color lightbutton2 = new Color(71,92,150);
    JPanel p2;
    JButton button_tologin,exit;
    
    //constructor
   startpage(){
       
       // style of frame
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLocation(350,40 );
    
    // add panel
    p2=new JPanel();
     add(p2);
     p2.setBackground(Color.white);
     p2.setLayout(null);
     
     // add image.....
     JLabel lbl1 = new JLabel();
     ImageIcon img = new ImageIcon("gym2.jpg");
     lbl1.setIcon(img);
     lbl1.setBounds(200,0,800,250);
     p2.add(lbl1);
     
    //initialise label
     label1= new JLabel(" Welcome  ");
      label1.setBounds(250,220,125,30);
     label1.setFont(new Font("Arial",Font.BOLD,18));
     label1.setForeground(Color.black);
     
     // add label
      p2.add(label1);
      
      //initialise label
      label2= new JLabel(" to our ...   ");
      label2.setBounds(220,250,125,30);
     label2.setFont(new Font("Arial",Font.BOLD,18));
     label2.setForeground(Color.black);
     //add label...
      p2.add(label2);
      
      //initialise label
      label3= new JLabel(" system   ");
      label3.setBounds(295,250,125,30);
     label3.setFont(new Font("Arial",Font.BOLD,18));
     label3.setForeground(Color.black);
     
      //add label...
      p2.add(label3);
      
      //initialise button
      button_tologin= new JButton("To login ..");//initialise button
     button_tologin.setBounds(150,320,120,30);
     button_tologin.setFont(new Font("Arial",Font.PLAIN,15));
     button_tologin.setBackground(lightbutton2);
     button_tologin.setForeground(Color.black);
     
     //add event 
     button_tologin.addActionListener(this);
     // add button
     p2.add(button_tologin);
     
     //initialise button
       exit= new JButton("Exit");
     exit.setBounds(350,320,120,30);
     exit.setFont(new Font("Arial",Font.PLAIN,15));
     exit.setBackground(lightbutton2);
     exit.setForeground(Color.black);
     //add event 
     exit.addActionListener(this);
     // add button
     p2.add(exit);
     
     //style of panel
       setTitle("Admin-login page");
      setSize(600,650);
      setVisible(true);
   }
   
   // method of event
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==button_tologin){
            Login_page l1 =new Login_page();
            this.hide();
      }
        else {
            this.hide();
        }
    
    }
}
