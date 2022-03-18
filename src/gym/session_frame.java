
package gym;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class session_frame extends JFrame implements ActionListener{

    
    
    JButton b1_add , b2_edit ,b3_delete , b4_back;
    JLabel l_name_trainer  , l_time , l_day , l6_image;
    JLabel l_name , l_des , l_size ;
    JTextField t_name_trainer , t_time , t_day;
    JTextField t_name , t_des , t_size ;
    JPanel p;
    ImageIcon imageGym = new ImageIcon("gym2.jpg");
    Color lightbutton = new Color(71,92,150);
    
    public session_frame(){
        setTitle("Session");
        setLocation(350,40);
        setSize(600, 650);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l6_image=new JLabel();
        l6_image.setIcon(imageGym);
        l6_image.setBounds(190, 10, 200, 200);
        
        //panel
        p= new JPanel();
        p.setLayout(null);
        p.setBackground(Color.white);
        
        //label
        l_name=new JLabel("session name : ");
        l_name.setBounds(50, 200, 120, 30);
        l_day=new JLabel("Day of session : ");
        l_day.setBounds(50, 250, 150, 30);
        l_time=new JLabel("Time of session : ");
        l_time.setBounds(50, 300, 150, 30);
        l_des=new JLabel(" description : ");
        l_des.setBounds(300, 200, 120, 30);
        l_name_trainer=new JLabel("Name of trainer : ");
        l_name_trainer.setBounds(300, 250, 200, 30);
        l_size=new JLabel("number of member : ");
        l_size.setBounds(300, 300, 150, 30);
       
        
        
        //font
        l_name_trainer.setFont(new Font("sansserif",Font.BOLD,14));
        l_day.setFont(new Font("sansserif",Font.BOLD,14));
        l_time.setFont(new Font("sansserif",Font.BOLD,14));
        l_day.setFont(new Font("sansserif",Font.BOLD,14));
        l_des.setFont(new Font("sansserif",Font.BOLD,14));
        l_name.setFont(new Font("sansserif",Font.BOLD,14));
        l_size.setFont(new Font("sansserif",Font.BOLD,14));
        
        
        //textfield
        t_name=new JTextField();
        t_name.setBounds(170, 200, 100, 25);
        t_day=new JTextField();
        t_day.setBounds(170, 250, 100, 25);
        t_time=new JTextField();
        t_time.setBounds(175, 300, 100, 25);
        t_des=new JTextField();
        t_des.setBounds(420, 200, 130, 25);
        t_name_trainer=new JTextField();
        t_name_trainer.setBounds(450, 250, 100, 25);
        t_size=new JTextField();
        t_size.setBounds(450, 300, 100, 25);
        
        
        //button
        b1_add=new JButton("add");
        b1_add.setBounds(150, 450, 80, 30);
        b2_edit=new JButton("edit");
        b2_edit.setBounds(250, 450, 80, 30);
        b3_delete=new JButton("delete");
        b3_delete.setBounds(350, 450, 80, 30);
        b4_back=new JButton("back");
        b4_back.setBounds(50, 50, 80, 30);
        
        //format button
        b1_add.setBackground(lightbutton);
        b1_add.setForeground(Color.BLACK);
        b2_edit.setBackground(lightbutton);
        b2_edit.setForeground(Color.BLACK);
        b3_delete.setBackground(lightbutton);
        b3_delete.setForeground(Color.BLACK);
        b4_back.setBackground(lightbutton);
        b4_back.setForeground(Color.BLACK);
        
        
        //add panel & label
        add(p);
        p.add(l_name_trainer);
        p.add(l_day);
        p.add(l_time);
        p.add(l_des);
        p.add(l_name);
        p.add(l_size);
        
        
        //add textfield
        p.add(t_name_trainer);
        p.add(t_day);
        p.add(t_time);
        p.add(t_des);
        p.add(t_name);
        p.add(t_size);
        
        //add button & image
        p.add(b1_add);
        p.add(b2_edit);
        p.add(b3_delete);
        p.add(l6_image);
        p.add(b4_back);
        
        
        //event
        b1_add.addActionListener(this);
        b2_edit.addActionListener(this);
        b3_delete.addActionListener(this);
        b4_back.addActionListener(this);
        
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==b1_add)
        {
            session x=new session();
            x.add(t_name, t_day, t_time,t_des,t_name_trainer , t_size);
            this.hide();
        }
        if(ae.getSource()==b2_edit)
        {
            session x=new session();
            x.edit(t_name, t_day, t_time,t_des,t_name_trainer , t_size);
            this.hide();
        }
        if(ae.getSource()==b3_delete)
        {
            session x=new session();
            x.delete(t_name, t_day, t_time,t_des,t_name_trainer , t_size);
            this.hide();
        }
        if(ae.getSource()==b4_back)
        {
            admin a=new admin();
            this.hide();
        }
        
    }
}
