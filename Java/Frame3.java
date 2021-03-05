import java.awt.*;
import java.awt.event.*;
/*program for set background, font and color and drawString*/ 
class Frame3 extends Frame{
    Frame3(){
        setSize(500,500);
        setVisible(true);
        setLocation(200,200);
        
        setBackground(Color.black);
        Font font = new Font("ACID LABEL___",Font.BOLD,30);
        setFont(font);

        //frame termination
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g){
        g.setColor(new Color(255,127,39));
        g.drawString("Hello",220,240);
    }
    public static void main(String arg[]){
        Frame3 F1 = new Frame3();
        F1.setTitle("Frame3");
    }
}