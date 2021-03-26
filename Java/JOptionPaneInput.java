import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JOptionPaneInput extends JFrame implements ActionListener{
    JLabel L1, name, password;
    JTextField nametxt;
    JPasswordField pass;
    JButton Login;
    //Container c;
    Font f = new Font("Gotham", Font.PLAIN, 20);
    JOptionPaneInput(){
        setTitle("Input POP-Up");
        setBounds(300,300,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        //c = getContentPane();

        L1 = new JLabel("Two-step verification...");
        L1.setHorizontalAlignment(JLabel.CENTER);
        L1.setBounds(100,50,300,50);
        L1.setFont(f);add(L1);
        name = new JLabel("Username:");
        name.setBounds(80,150,100,40);
        name.setFont(f);add(name);
        password = new JLabel("Password:");
        password.setBounds(80,210,100,40);
        password.setFont(f);add(password);
        nametxt = new JTextField(30);
        nametxt.setBounds(190,150,210,40);
        nametxt.setFont(f);add(nametxt);
        pass = new JPasswordField(30);
        pass.setBounds(190,210,210,40);add(pass);
        pass.setFont(f);
        
        Login = new JButton("Login");
        Login.setBounds(190,350,100,40);
        Login.setFont(f);add(Login);
        Login.addActionListener(this);
        /*c.add(Login);c.add(L1);c.add(name);c.add(nametxt);
        c.add(password);
        c.add(pass);*/

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String otp = JOptionPane.showInputDialog(this, "Enter OTP here...");
        if(!otp.isEmpty()){
            System.out.println("OTP is: "+ otp);
        }
    }
    public static void main(String args[]){
        new JOptionPaneInput();
    }
}