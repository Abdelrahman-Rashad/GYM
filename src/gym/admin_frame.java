package gym;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class admin_frame extends JFrame implements ActionListener{
    JButton b1_trainer , b2_classes , b3_mem_class , b4_mem_membership , b5_mem_info,signout;
    JLabel l1_trainer , l2_classes , l3_mem_class , l4_mem_membership , l5_mem_info , l6_image ;
    JPanel p_frame;
    Color lightbutton = new Color(71,92,150);
    ImageIcon imageGym = new ImageIcon("gym2.jpg");
   
    public admin_frame()
    {
        setTitle("Admin");
        this.setLocation(350,40);
        this.setSize(600, 650);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //background panel
        p_frame=new JPanel();
        p_frame.setLayout(null);
        p_frame.setBackground(Color.white);
        
        //labels
        l1_trainer=new JLabel("To add / edit / delete trainer : ");
        l1_trainer.setBounds(80, 200, 250, 30);
         l2_classes=new JLabel("To open / edit / delete classes : ");
        l2_classes.setBounds(80, 250, 250, 30);
         l3_mem_class=new JLabel("View members in a specific class : ");
        l3_mem_class.setBounds(80, 300, 250, 30);
         l4_mem_membership=new JLabel("View members under a specific type of membership : ");
        l4_mem_membership.setBounds(80, 350, 400, 30);
         l5_mem_info=new JLabel("View all members information : ");
        l5_mem_info.setBounds(80, 400, 250, 30);
        
        //image
        l6_image=new JLabel();
        l6_image.setIcon(imageGym);
        l6_image.setBounds(190, 10, 200, 200);
        
        //buttons
        b1_trainer=new JButton("trainer");
        b1_trainer.setBounds(300, 200, 80, 30);
        b2_classes=new JButton("classes");
        b2_classes.setBounds(320, 250, 80, 30);
        b3_mem_class=new JButton("show");
        b3_mem_class.setBounds(330, 300, 80, 30);
        b4_mem_membership=new JButton("show");
        b4_mem_membership.setBounds(460, 350, 80, 30);
        b5_mem_info=new JButton("show");
        b5_mem_info.setBounds(310, 400, 80, 30);
         signout=new JButton("Sign out");
         signout.setBounds(50, 50, 80, 30);
        
        //format buttons
        b1_trainer.setBackground(lightbutton);
        b1_trainer.setForeground(Color.BLACK);
        b2_classes.setBackground(lightbutton);
        b2_classes.setForeground(Color.BLACK);
        b3_mem_class.setBackground(lightbutton);
        b3_mem_class.setForeground(Color.BLACK);
        b4_mem_membership.setBackground(lightbutton);
        b4_mem_membership.setForeground(Color.BLACK);
        b5_mem_info.setBackground(lightbutton);
        b5_mem_info.setForeground(Color.BLACK);
         signout.setBackground(lightbutton);
        signout.setForeground(Color.BLACK);
        
        //fonts
        l1_trainer.setFont(new Font("sansserif",Font.BOLD,14));
        l2_classes.setFont(new Font("sansserif",Font.BOLD,14));
        l3_mem_class.setFont(new Font("sansserif",Font.BOLD,14));
        l4_mem_membership.setFont(new Font("sansserif",Font.BOLD,14));
        l5_mem_info.setFont(new Font("sansserif",Font.BOLD,14));
        
        //add label
        p_frame.add(l1_trainer);
        p_frame.add(l2_classes);
        p_frame.add(l3_mem_class);
        p_frame.add(l4_mem_membership);
        p_frame.add(l5_mem_info);
        
        //add button
        p_frame.add(b1_trainer);
        p_frame.add(b2_classes);
        p_frame.add(b3_mem_class);
        p_frame.add(b4_mem_membership);
        p_frame.add(b5_mem_info);
         p_frame.add(signout);
        
        //add image & panel
        p_frame.add(l6_image);
        add(p_frame);
        
        //add event
        signout.addActionListener(this);
        b1_trainer.addActionListener(this);
        b2_classes.addActionListener(this);
        b3_mem_class.addActionListener(this);
        b4_mem_membership.addActionListener(this);
        b5_mem_info.addActionListener(this);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==signout){
            Login_page lo2=new Login_page();
                        this.hide();
                  
        }
        if (ae.getSource()==b1_trainer){
            Trainer_gui t2 = new Trainer_gui();
            this.hide();
        }
        if (ae.getSource()==b2_classes){
            session_frame t2 = new session_frame();
            this.hide();
        }
        if (ae.getSource()==b3_mem_class){
            show_member_specificclass_gui t2=new show_member_specificclass_gui();
            this.hide();
        }
        if (ae.getSource()==b4_mem_membership){
            Show_type_membership_gui t2 = new Show_type_membership_gui(true);
            this.hide();
        }
        if (ae.getSource()==b5_mem_info){
            Show3_all_members t2 = new Show3_all_members();
            t2.search();
            
            
        }
    }
 
}