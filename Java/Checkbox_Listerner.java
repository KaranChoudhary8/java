import java.awt.*;
import java.awt.event.*;
class Checkbox_Listerner extends Frame implements ItemListener{
    Checkbox C1, C2;
    Checkbox_Listerner(){
        setTitle("Checkbox Event...");
        setLayout(null);
        setLocation(200,200);
        setSize(500,500);
        setVisible(true);
        Font font = new Font("ACID LABEL___",Font.BOLD,15);
        setFont(font);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        C1 = new Checkbox("M. Tech.");
        C1.setBounds(150,100,80,30);
        add(C1);
        C1.addItemListener(this);
        C2 = new Checkbox("B. Tech.");
        C2.setBounds(250,100,80,30);
        add(C2);
        C2.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent E){
        repaint();
    }
    public void paint(Graphics G){
        G.drawString("Select Your degree/degrees...",150,80);
        G.drawString("Degree status:",200,200);
        G.drawString("M. Tech.: "+(C1.getState()==true? "Select." : "Not Selected."),180,240);
        G.drawString("B. Tech.: "+(C2.getState()==true? "Select." : "Not Selected."),180,280);
    }
    public static void main(String Args[]){
        Checkbox_Listerner frame = new Checkbox_Listerner();
    }
}