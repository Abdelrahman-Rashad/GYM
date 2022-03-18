package gym;
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

   public class Login_page extends JFrame implements ActionListener,ItemListener {
    // variables
    JTextField username;
    JButton button_login,button_back;
    JPasswordField pass;
    JPanel p;
    JLabel namelabel,passlabel;
    JCheckBox dPassword;
    JButton resetButton;
    Color lightbutton = new Color(71,92,150);
    
      // constructor
      public Login_page (){
        
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
      namelabel= new JLabel("Enter username   :");
      namelabel.setBounds(150,200,125,30);
      namelabel.setFont(new Font("Arial",Font.PLAIN,15));
      namelabel.setForeground(Color.black);
      //add_label......
      p.add(namelabel);

      //initialise text field
      username=new JTextField();
      username.setBounds(280,200,135,25);
      //add_text field......
      p.add(username);
       
      //initialise label
      passlabel= new JLabel("Enter password   :");
      passlabel.setBounds(150,240,125,25);
      passlabel.setFont(new Font("Arial",Font.PLAIN,15));
      passlabel.setForeground(Color.black);
      //add_label......
      p.add(passlabel);//pass
      
      //initialise text field
      pass=new JPasswordField();
      pass.setBounds(280,240,135,25);
      //add_text field......
      p.add(pass);

      //initialise check box
      dPassword = new JCheckBox("Show Password");
      dPassword.setBackground(Color.WHITE);
      dPassword.setBounds(280,270,135,25);
         
      //add event
      dPassword.addItemListener(this); 
         
      //add check box 
      p.add(dPassword);
         
      //initialise button
      button_login= new JButton("Login");
     button_login.setBounds(150,340,120,30);
     
     // style of button
     button_login.setFont(new Font("Arial",Font.PLAIN,15));
     button_login.setBackground(lightbutton);
     button_login.setForeground(Color.black);
     
     //add event 
     button_login.addActionListener(this);
     
     //add button 
     p.add(button_login);
          
     //initialise button
     resetButton = new JButton("RESET");
     resetButton.setBounds(295,340,120,30);
      
      // style of button
     resetButton.setFont(new Font("Arial",Font.PLAIN,15));
     resetButton.setBackground(lightbutton);
     resetButton.setForeground(Color.black);
     
     //add event 
     resetButton.addActionListener(this);
     
     //add button 
     p.add(resetButton);
     
     //initialise button
      button_back= new JButton("Back"); 
     button_back.setBounds(225,400,120,30);
     
      // style of button
     button_back.setFont(new Font("Arial",Font.PLAIN,15));
     button_back.setBackground(lightbutton);
     button_back.setForeground(Color.black);
     
     //add event 
     button_back.addActionListener(this);
     
     //add button 
     p.add(button_back);
     
      setTitle("login page"); //Title
      setSize(600,650); //size_frame
      setVisible(true);
    }
    // methods events
    @Override
     public void actionPerformed(ActionEvent ae) {
      if (ae.getSource() == button_login) {
            String userText;
            String pwdText;
            userText = username.getText();
            pwdText = pass.getText();
            // check if he admin or employee
            if ((userText.equalsIgnoreCase("admin") && pwdText.equalsIgnoreCase("12345"))||(userText.equalsIgnoreCase("admin2") && pwdText.equalsIgnoreCase("246810"))) {
                JOptionPane.showMessageDialog(null, "Login Successful");
                 username.setText("");
            pass.setText("");
                admin ad1 =new admin();
                this.hide();
            } 
            else if ((userText.equalsIgnoreCase("employee") && pwdText.equalsIgnoreCase("987654"))||(userText.equalsIgnoreCase("employee2") && pwdText.equalsIgnoreCase("1020304050"))) {
                JOptionPane.showMessageDialog(null, "Login Successful");
                 username.setText("");
                 pass.setText("");
                 Employee ad1 =new Employee();
                 this.hide();
            } 
            
            // if not admin or employee
            else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
                 username.setText("");
            pass.setText("");
            }
 
        }
        //Coding Part of RESET button
        if (ae.getSource() == resetButton) {
            username.setText("");
            pass.setText("");
        }
       //Coding Part of showPassword JCheckBox
        
        if(ae.getSource() == button_back){
            startpage st2 = new startpage();
                        this.hide();

        }
   }
    // event of check box
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == dPassword) {
            if (dPassword.isSelected()) {
                pass.setEchoChar((char) 0);
            } else {
                pass.setEchoChar('*');
            }
        }
    }
    

}