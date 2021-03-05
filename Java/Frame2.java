import java.awt.*;
import java.awt.event.*;
class Frame2 extends Frame{
    Frame2(){
        setSize(500,500);
        setVisible(true);
        setLocation(200,200);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public static void main(String arg[]){
        Frame2 F1 = new Frame2();
        F1.setTitle("Frame2");
    }
}