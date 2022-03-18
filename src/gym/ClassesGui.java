package gym;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ClassesGui extends JFrame implements ActionListener {
    JFrame f = new JFrame();
    ImageIcon gymImage = new ImageIcon("gymImage.jpg");
    JLabel image = new JLabel();
    JPanel p = new JPanel();
    JLabel l1 = new JLabel("Class Name");
    JTextField t1 = new JTextField();
    JLabel l2 = new JLabel("Member ID ");
    JTextField t2 = new JTextField();
    JButton b1 = new JButton("Add");
    JButton b2 = new JButton("Delete");
    JButton b3 = new JButton("back");
    Color lightbutton = new Color(71, 92, 150);

    public ClassesGui() {
        f.setTitle("Classes");
        f.setSize(600, 650);
        f.setLocation(350, 40);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(null);
        p.setBackground(Color.white);
        image.setIcon(gymImage);
        image.setBounds(200, 10, 200, 200);
        p.add(image);
        l1.setBounds(50, 250, 250, 25);
        p.add(l1);
        t1.setBounds(150, 250, 100, 25);
        p.add(t1);
        l2.setBounds(300, 250, 250, 25);
        p.add(l2);
        t2.setBounds(400, 250, 100, 25);
        p.add(t2);
        b1.setBounds(150, 350, 100, 25);
        b1.setBackground(lightbutton);
        b1.setForeground(Color.black);
        p.add(b1);
        b2.setBounds(350, 350, 100, 25);
        b2.setBackground(lightbutton);
        b2.setForeground(Color.black);
        p.add(b2);
        b3.setBounds(50, 50, 80, 30);
        b3.setBackground(lightbutton);
        b3.setForeground(Color.BLACK);
        p.add(b3);
        f.add(p);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


    }
    @Override
    public void actionPerformed (ActionEvent ae){
        if (ae.getSource() == b1) {
            Classes clas = new Classes();
            clas.add(t1,t2);
            this.hide();
        }
        if (ae.getSource() == b2) {
            Classes clas = new Classes();
            clas.delete(t1,t2);
            this.hide();
        }
        if (ae.getSource() == b3) {
            Employee a = new Employee();
            this.hide();
        }
    }
}