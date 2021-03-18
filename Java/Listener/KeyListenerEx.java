import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class KeyListenerEx extends JFrame implements KeyListener{
    JLabel L1, L2, L3;
    JTextArea Ta;
    JTextField Tf;
    int count = 0;
    KeyListenerEx(){
        Font f = new Font("Arial", Font.ITALIC, 20);
        setFont(f);
        setVisible(true);
        setLayout(null);
        setBounds(500,300,500,500);
        setTitle("KeyListener");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        L3 = new JLabel("No. of Character in Your Bio is "+count);
        L3.setBounds(50,50,350,50);
        L3.setForeground(Color.green);
        L3.setFont(f);
        add(L3);
        L1 = new JLabel("Name:");
        L1.setBounds(50,100,100,50);
        L1.setFont(f);
        add(L1);
        Tf = new JTextField(50);
        Tf.setBounds(150,100,300,50);
        Tf.setFont(f);
        add(Tf);
        L2 = new JLabel("Write some About you:");
        L2.setBounds(50,150,300,50);
        L2.setFont(f);
        add(L2);
        Ta = new JTextArea(4,150);
        Ta.setBounds(50,200,370,200);
        Ta.setFont(f);
        Ta.addKeyListener(this);
        add(Ta);
    }
    public void keyTyped(KeyEvent E){/*When key is typed*/}
    public void keyPressed(KeyEvent E){/*When key is pressed*/}
    public void keyReleased(KeyEvent E){/*When key is Relased*/
        String text = Ta.getText();
        count = text.length();
        if(count>=150){
            L3.setForeground(Color.red);
        }
        else{
            L3.setForeground(Color.green);
        }
        L3.setText("No. of Character in Your Bio is "+count);
    }
    public static void main(String args[]){
        new KeyListenerEx();
    }
}