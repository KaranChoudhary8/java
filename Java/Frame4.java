import java.awt.*;
import java.awt.event.*;
/*program for creating emoji*/ 
class Frame4 extends Frame{
    Frame4(){
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
        //face
        g.setColor(Color.yellow);
        g.fillOval(100,100,300,300);
        //eyes
        g.setColor(Color.white);
        g.fillOval(175,150,50,70);
        g.fillOval(275,150,50,70);
        //eye ball
        g.setColor(Color.black);
        g.fillOval(185,170,30,30);
        g.fillOval(285,170,30,30);
        //smile
        g.drawArc(150,250,200,100,180,180);
    }
    public static void main(String arg[]){
        Frame4 F1 = new Frame4();
        F1.setTitle("Emoji");
    }
}