import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TextListenerEx extends JFrame implements TextListener{
    JLabel L1,L2,L3;
    TextField tf;
    JPanel p;
    Font f =new Font("Arimo", Font.PLAIN, 20);
    TextListenerEx(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(500,300,500,140);
        setLayout(new BorderLayout());
        setTitle("Text Listener");
        L1 = new JLabel("Enter text here: ",JLabel.CENTER);
        L1.setFont(f);
        L2 = new JLabel("", JLabel.CENTER);
        L3 = new JLabel("", JLabel.CENTER);
        L2.setFont(f);L3.setFont(f);
        tf = new TextField(20);
        tf.setFont(f);
        tf.addTextListener(this);
        p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(L1);
        p.add(tf);
        add(p, BorderLayout.CENTER);
        add(L2,BorderLayout.NORTH);
        add(L3,BorderLayout.SOUTH);
    }
    public void textValueChanged(TextEvent E){
        String a = tf.getText();
        L2.setText("No. of Letters in text is: " + a.length());
        L3.setText("You entered: " + a);
    }
    public static void main(String args[]){
        new TextListenerEx();
    }
}