package gym;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Employee extends JFrame implements ActionListener {
    ImageIcon gymImage=new ImageIcon("gym.jpeg");
    JLabel image=new JLabel();
    JLabel l1=new JLabel("To add/edit/delete member :  ");
    JButton b1=new JButton("Member");
    Color lightbutton=new Color(71,92,150);
    JLabel l2=new JLabel("To add/delete member from classes :  ");
    JButton b2=new JButton("Classes");
    JLabel l3=new JLabel("View member in a specific class : ");
    JButton b3=new JButton("Show");
    JLabel l4=new JLabel("View members under a specific type of membership :  ");
    JButton b4=new JButton("Show");
    JLabel l5=new JLabel(" View all members info : ");
    JButton b5=new JButton("Show");
    JButton b6=new JButton("Sign Out");
    JPanel p=new JPanel();
    public Employee(){
        this.setTitle("Employee Page");
        this.setSize(600,650);
        this.setLocation(350,40);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(null);
        p.setBackground(Color.white);
        JLabel lbl = new JLabel();
      ImageIcon img = new ImageIcon("gym2.jpg");
      lbl.setIcon(img);
      lbl.setBounds(200,2,800,250);
      p.add(lbl);
        l1.setBounds(70,200,250,100);
        p.add(l1);
        b1.setBounds(250,235,100,25);
        b1.setBackground(lightbutton);
        b1.setForeground(Color.black);
        p.add(b1);
        l2.setBounds(70,250,250,100);
        p.add(l2);
        b2.setBounds(300,285,100,25);
        b2.setBackground(lightbutton);
        b2.setForeground(Color.black);
        p.add(b2);
        l3.setBounds(70,300,250,100);
        p.add(l3);
        b3.setBounds(280,340,100,25);
        b3.setBackground(lightbutton);
        b3.setForeground(Color.black);
        p.add(b3);
        l4.setBounds(70,350,400,100);
        p.add(l4);
        b4.setBounds(400,390,100,25);
        b4.setBackground(lightbutton);
        b4.setForeground(Color.black);
        p.add(b4);
        l5.setBounds(70,400,250,100);
        p.add(l5);
        b5.setBounds(250,440,100,25);
        b5.setBackground(lightbutton);
        b5.setForeground(Color.black);
        p.add(b5);
        b6.setBounds(50,50,100,25);
        b6.setBackground(lightbutton);
        b6.setForeground(Color.black);
        p.add(b6);
        this.add(p);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
         b5.addActionListener(this);
          b6.addActionListener(this);
           b4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            Member_gui lo2=new Member_gui();
             this.hide();
           
        }
        if (ae.getSource()==b2){
             ClassesGui t2 =new ClassesGui();
            this.hide();
        }

        if (ae.getSource()==b3){
             show_member_specificclass_gui t2=new show_member_specificclass_gui();
            this.hide();
        }

        if (ae.getSource()==b4){
             Show_type_membership_gui t2 = new Show_type_membership_gui(false);
            this.hide();
        }
        
        if (ae.getSource()==b5){
             Show3_all_members t2 = new Show3_all_members();
            t2.search();
            
        }
        if(ae.getSource()==b6){
            Login_page lo2=new Login_page();
                        this.hide();

        }
    }
}