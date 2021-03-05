import java.awt.*;
import java.awt.event.*;
/*program for set background by button*/ 
class MyCheckBox extends Frame{
    Checkbox c1,c2;
    Checkbox C3,C4;
    CheckboxGroup cbg;
    MyCheckBox(){
        
        setLayout(new FlowLayout());
        //checkboxes
        c1 = new Checkbox("Italic");
        add(c1);
        c2 = new Checkbox("Bold");
        add(c2);

        //radio
        cbg = new CheckboxGroup();
        C3 = new Checkbox("male", true, cbg);
        add(C3);
        C4 = new Checkbox("female", false, cbg);
        add(C4);
        //frame
        setSize(450,500);
        setVisible(true);
        setLocation(200,200);
        
        //font
        Font font = new Font("ACID LABEL___",Font.ITALIC,15);
        setFont(font);

        //frame termination
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public void itemStateChanged(ItemEvent e){
        
    }
    public void paint(Graphics g){
        
    }
    public static void main(String arg[]){
        MyCheckBox F1 = new MyCheckBox();
        F1.setTitle("Change Background");
    }
}