import java.awt.*;
import java.awt.event.*;
class JavaImg extends Frame{
    JavaImg(){
        setVisible(true);
        setBounds(300,200,640,525);
        setTitle("Image");
        //termination
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent WE){
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g){
        Image I = Toolkit.getDefaultToolkit().getImage("image/tree.jpg");
        g.drawImage(I,0,0,this);
    }
    public static void main(String args[]){
        JavaImg J = new JavaImg();
    }
}