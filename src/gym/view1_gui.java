/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Abdelrahman Rashad
 */
public class view1_gui extends JFrame implements ActionListener{
    JLabel l1_image,l2_id , l3_trainer , l4_day , l5_time;
    JTextField t1_id, t2_trainer , t3_day , t4_time;
    JButton b_search , b4_back;
    JPanel p;
    String x[]= new String [3];
    ImageIcon imageGym = new ImageIcon("gym2.jpg");
    Color lightbutton = new Color(71,92,150);
    public view1_gui() 
    {
        setTitle("View");
        setLocation(350,40);
        setSize(600, 650);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        l1_image=new JLabel();
        l1_image.setIcon(imageGym);
        l1_image.setBounds(190, 10, 200, 200);
        
        
        //panel
        p= new JPanel();
        p.setLayout(null);
        p.setBackground(Color.white);
        
        
        //button
        b_search = new JButton("search");
        b_search.setBounds(250, 450, 80, 30);
        b4_back=new JButton("back");
        b4_back.setBounds(50, 50, 80, 30);
        
        //format button
        b_search.setBackground(lightbutton);
        b_search.setForeground(Color.BLACK);
        b4_back.setBackground(lightbutton);
        b4_back.setForeground(Color.BLACK);
        
        //label
        l3_trainer=new JLabel("Name of trainer : ");
        l3_trainer.setBounds(350, 200, 120, 30);
        l4_day=new JLabel("Day of session : ");
        l4_day.setBounds(350, 250, 150, 30);
        l5_time=new JLabel("Time of session : ");
        l5_time.setBounds(350, 300, 150, 30);
        l2_id=new JLabel("ID member : ");
        l2_id.setBounds(50, 250, 120, 30);
        
        //font
        l2_id.setFont(new Font("sansserif",Font.BOLD,14));
        l3_trainer.setFont(new Font("sansserif",Font.BOLD,14));
        l4_day.setFont(new Font("sansserif",Font.BOLD,14));
        l5_time.setFont(new Font("sansserif",Font.BOLD,14));
        
        //textfield
        t1_id=new JTextField();
        t1_id.setBounds(140, 250, 100, 25);
        t2_trainer=new JTextField();
        t2_trainer.setBounds(475, 200, 80, 25);
        t3_day=new JTextField();
        t3_day.setBounds(475, 250, 80, 25);
        t4_time=new JTextField();
        t4_time.setBounds(475, 300, 100, 25);
        
        //add
        add(p);
        p.add(l1_image);
        p.add(l2_id);
        p.add(l3_trainer);
        p.add(l4_day);
        p.add(l5_time);
        p.add(t1_id);
        p.add(t2_trainer);
        p.add(t3_day);
        p.add(t4_time);
        p.add(b_search);
        p.add(b4_back);
        
        b_search.addActionListener(this);
        b4_back.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b_search)
        {
            view1 v=new view1();
            String x []= v.search(t1_id);
            
            t2_trainer.setText(x[0]);
            t3_day.setText(x[1]);
            t4_time.setText(x[2]);
            //this.hide();
            
        }
        if(ae.getSource()==b4_back)
        {
            admin a=new admin();
            this.hide();
        }
    }
}
