import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class KeyListenerEx2 extends JFrame implements KeyListener{
    JLabel l1,l2;
    KeyListenerEx2(){
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500,300,500,150);
        setTitle("Key Listener");
        setVisible(true);
        Font f = new Font("Arima", Font.PLAIN, 25);
        l1 = new JLabel("Press any Key in KeyBoard.");
        l1.setFont(f);
        l2 = new JLabel();
        l2.setFont(f); 
        add(l1);
        add(l2);
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent E){
        int a = E.getKeyCode();
        l2.setText("You Entered key: "+ KeyEvent.getKeyText(a));
    }
    public void keyReleased(KeyEvent E){}
    public void keyTyped(KeyEvent E){}
    public static void main(String args[]){
        new KeyListenerEx2();
    }
}