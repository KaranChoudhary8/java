import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ComponentListener_Ex extends JFrame implements ComponentListener{
    JLabel L1, L2;
    ComponentListener_Ex(){
        setLayout(new FlowLayout());
        addComponentListener(this);
        setVisible(true);
        setTitle("ComponentListener");
        setBounds(500,300,500,500);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        L1 = new JLabel();
        L1.setText("Size of the Frame is " + this.getSize());
        //L1.setBounds(50,180,400,50);
        add(L1);
        L2 = new JLabel();
        //L2.setBounds(50,250,400,50);
        L2.setText("Location of the Frame is " + this.getLocation());
        add(L2);
    }
    public void componentResized(ComponentEvent E){//when size of component is chenged
        L1.setText("Size of the Frame is " + this.getSize());
    }
    public void componentMoved(ComponentEvent E){//when component location is changed
        L2.setText("Location of the Frame is " + this.getLocation());
    }
    public void componentHidden(ComponentEvent E){/*When component has been made invisible*/}
    public void componentShown(ComponentEvent E){/*When component has been made visible*/}
    public static void main(String args[]){
        ComponentListener_Ex frame = new ComponentListener_Ex();
    }
}