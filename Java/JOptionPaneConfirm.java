import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JOptionPaneConfirm extends JFrame implements ActionListener, ItemListener{
    JLabel L1, name, password;
    JTextField nametxt;
    JPasswordField pass;
    JButton Login;
    //Container c;
    JCheckBox C1;
    Font f = new Font("Gotham", Font.PLAIN, 20);
    String passString[] = {"123456","ABCDEF","XYZABC","111111"};
    JOptionPaneConfirm(){
        setTitle("Message");
        setBounds(300,300,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        //c = getContentPane();

        L1 = new JLabel("Login...");
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
        pass.setBounds(190,210,210,40);
        pass.setFont(f); add(pass);
        C1 = new JCheckBox("Remember me.");
        C1.setBounds(80,260,200,40);
        C1.setFont(f); add(C1);
        C1.addItemListener(this);

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
        if(nametxt.getText().isEmpty() || pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Fill the fields properly.", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(pass.getText().equals(passString[0]) || pass.getText().equals(passString[1]) || pass.getText().equals(passString[2]) || pass.getText().equals(passString[3])){
                JOptionPane.showMessageDialog(this,"Login Complete", "Welcome",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this,"Login Failed, Incorrect Password!!!", "Incorrect Password",JOptionPane.ERROR_MESSAGE);
            }
        }
       /* String otp = JOptionPane.showInputDialog(this, "Enter OTP here...");
        if(!otp.isEmpty()){
            System.out.println("OTP is: "+ otp);
        }*/
    }
    public void itemStateChanged(ItemEvent e){
        if(C1.isSelected()==true){
            int i=JOptionPane.showConfirmDialog(this, "Are You Sure, You went to save your Username and Password.","Confirm",JOptionPane.YES_NO_OPTION);
            if(i==JOptionPane.NO_OPTION){
                System.out.println("Username and Password is not saved...");
                C1.setSelected(false);
            }
            else if(i==JOptionPane.YES_OPTION){
                System.out.println("Username and Password is saved...");

                C1.setSelected(true);
            }
        }
    }
    public static void main(String args[]){
        new JOptionPaneConfirm();
    }
}