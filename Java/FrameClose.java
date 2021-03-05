import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
    MyFrame(String title){
        super(title);
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener(adapter);
    }
    public void paint(Graphics g){
        g.drawString("Hello guys...",100,200);
    }
}
class MyWindowAdapter extends WindowAdapter{
    MyFrame myframe;
    public MyWindowAdapter(MyFrame myframe){
        this.myframe = myframe;
    }
    public void windowClosing(WindowEvent e){
        myframe.setVisible(false);
    }
}
public class FrameClose{
    public static void main(String Args[]){
        MyFrame F1 = new MyFrame("My Frame");
        F1.setSize(500,500);
        F1.setVisible(true);
    }
}