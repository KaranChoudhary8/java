import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.*;
class Calculator extends JFrame implements ActionListener, KeyListener{
    JButton[] btn = new JButton[24];
    JTextField tf;
    JPanel p;
    String text;
    char symbol[] = {'\u221A'/*sqrt*/, '\u00B2'/*square*/, '\u00B3'/*Cube*/, '\u2190'/*back*/};
    String[] data = {"%",""+symbol[0],"x"+symbol[1],"1/x","x"+symbol[2],"C",""+symbol[3],"/","7","8","9","*","4","5","6","-","1","2","3","+","00","0",".","="};
    Font f1 = new Font("Arimo",Font.ITALIC,30);
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("js");
    Calculator(){
        addKeyListener(this);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Calculator");
        setBounds(500,300,420,570);
        setLayout(null);
        tf = new JTextField();
        tf.setBounds(0,0,400,100);
        tf.setFont(f1);
        tf.setHorizontalAlignment(JTextField.RIGHT);
        add(tf);
        p = new JPanel();
        p.setLayout(new GridLayout(6,4));
        p.setBounds(0,100,400,420);
        for(int i=0;i<24;i++){
            btn[i] = new JButton();
            btn[i].setLabel(data[i]);
            btn[i].setFont(f1);
            p.add(btn[i]);
            btn[i].addActionListener(this);
        }
        add(p);
    }
    public void actionPerformed(ActionEvent E){
        JButton b = (JButton) E.getSource();
        text = tf.getText();
        if(btn[1]==b){//square root
            try{
                text = "" + se.eval(text);
            }catch(Exception e){}
            try{
            double sqrt = Math.sqrt(Double.parseDouble(text));
            tf.setText(""+sqrt);
            }catch(Exception e){}
        }
        else if(btn[2]==b){ //square
            try{
                text = "" + se.eval(text);
            }catch(Exception e){}
            double sq = Double.parseDouble(text);
            tf.setText(""+sq*sq);
        }
        else if(btn[3]==b){//1/x
            try{
                text = "" + se.eval(text);
            }catch(Exception e){}
            try{
            double di = 1/(Double.parseDouble(text));
            tf.setText(""+di);
            }catch(Exception e){tf.setText("Infinity");}
        }
        else if(btn[4]==b){//cude
            try{
                text = "" + se.eval(text);
            }catch(Exception e){}
            double cb = Double.parseDouble(text);
            tf.setText(""+cb*cb*cb);
        }
        else if(btn[5]==b){
            tf.setText("");
        }
        else if(btn[6]==b){//back
            try{
            text = text.substring(0,(text.length()-1));
            tf.setText(text);
            }catch(Exception e){}
        }
        else if(btn[23]==b){//=
            try{
                text = "" + se.eval(text);
            }catch(Exception e){}
            tf.setText(text);
            }
        else{
            tf.setText(text + b.getLabel());
        }
    }
    public void keyPressed(KeyEvent E){
        int a = E.getKeyCode();
        System.out.println(a);
    }
    public void keyReleased(KeyEvent E){}
    public void keyTyped(KeyEvent E){}
    public static void main(String args[]){
        new Calculator();
    }
}