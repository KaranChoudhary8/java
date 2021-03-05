import java.awt.*;
import java.awt.event.*;
//prog. for radio box event listener...
class RadioBox extends Frame implements ItemListener{
    Checkbox R1,R2,R3;
    CheckboxGroup cbg;
    RadioBox(){
        setTitle("RadioBox Lsitener...");
        setLocation(200,200);
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        //font
        Font font = new Font("ACID LABEL___",Font.ITALIC,15);
        setFont(font);
        //window closing
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        //radio
        cbg = new CheckboxGroup();
        R1 = new Checkbox("Graduated",true,cbg);
        R1.setBounds(50,100,100,30);
        add(R1);
        R1.addItemListener(this);
        R2 = new Checkbox("Post Graduated",false,cbg);
        R2.setBounds(170,100,140,30);
        add(R2);
        R2.addItemListener(this);
        R3 = new Checkbox("Under Graduated",false,cbg);
        R3.setBounds(320,100,140,30);
        add(R3);
        R3.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent E){
        repaint();
    }
    public void paint(Graphics g){
        g.setFont(new Font("ACID LABEL___",Font.BOLD,15));
        g.drawString("Select Your Qualification.",150,80);
        g.drawString("You Selected: "+cbg.getSelectedCheckbox().getLabel(),150,250);
    }

    public static void main(String args[]){
        RadioBox frame = new RadioBox();
    }
}
