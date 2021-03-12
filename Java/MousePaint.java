import java.awt.*;
import java.awt.event.*;
class MousePaint extends Frame implements MouseMotionListener, MouseListener{
    int lastX,lastY,x,y;
    MousePaint(){
        setLayout(null);
        setTitle("Mouse Paint");
        setVisible(true);
        setBackground(Color.black);
        setForeground(Color.yellow);
        setBounds(300,300,600,600);
        //window closing 
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent E){
                System.exit(0);
            }
        });
        //mouse Listener
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mousePressed(MouseEvent E){
        lastX = E.getX();
        lastY = E.getY();
    }
    public void mouseDragged(MouseEvent E){
        x = E.getX();
        y = E.getY();
        Graphics G = this.getGraphics();
        G.drawLine(lastX,lastY,x,y);
        lastX = x;
        lastY = y;
    }
    //other methods of MOUSELISTENER and MOUSEMOTIONLISTENER
    public void mouseMoved(MouseEvent E){/*When mouse is moved, it is method of MouseMotionListener*/}
    public void mouseReleased(MouseEvent E){/*When mouse key is released, it is method of MouseListener*/}
    public void mouseClicked(MouseEvent E){/*When mouse key is pressed, it is method of MouseListener*/}
    public void mouseEntered(MouseEvent E){/*When mouse key is entered, it is method of MouseListener*/}
    public void mouseExited(MouseEvent E){/*When mouse key is exit, it is method of MouseListener*/}

    public static void main(String Args[]){
        MousePaint frame = new MousePaint();
    }
}