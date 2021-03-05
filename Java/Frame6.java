import java.awt.*;
import java.awt.event.*;
/*program for set display student info.*/ 

class Frame6 extends Frame{
    Button B1;
    Frame6(){
        //button
        B1 = new Button("Result");
        add(B1);
        B1.setLocation(100,300);
        B1.setSize(70,30);
        B1.setBackground(Color.cyan);
        setLayout(null);

        //frame
        setSize(500,500);
        setVisible(true);
        setLocation(200,200);
        setBackground(Color.black);
        
        
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
    
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.drawString("Student Information...",100,100);
        g.setColor(Color.green);
        g.drawString("Name: Ram",100,150);
        g.drawString("Class: IT",100,200);
        g.drawString("Roll No.: 450",100,250);
    }
    public static void main(String arg[]){
        Frame6 F1 = new Frame6();
        F1.setTitle("Student Info...");
    }
}