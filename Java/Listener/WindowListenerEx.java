import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WindowListenerEx extends JFrame implements WindowListener{
    Label l1;
    WindowListenerEx(){
        setVisible(true);
        setBounds(500,300,500,500);
        setTitle("Window Listener");
        addWindowListener(this);
        l1 = new Label("Window status is: ");
        l1.setFont(new Font("Arimo",Font.PLAIN,25));
        add(l1);
    }

    public void windowClosing(WindowEvent E){
        l1.setText("Window status is: Closing");
        System.out.println("Window is closing");
        System.exit(0);
    }
    public void windowActivated(WindowEvent E){
        l1.setText("Window status is: Activated");
        System.out.println("Window is Activated");
    }
    public void windowIconified(WindowEvent E){
        l1.setText("Window status is: Iconified");
        System.out.println("Window is iconified");
    }
    public void windowOpened(WindowEvent E){
        l1.setText("Window status is: Opened");
        System.out.println("Window is opened");
    }
    public void windowDeiconified(WindowEvent E){
        l1.setText("Window status is: Deiconified");
        System.out.println("Window is deiconified");
    }
    public void windowDeactivated(WindowEvent E){
        l1.setText("Window status is: Deactivated");
        System.out.println("Window is deactivated");
    }
    public void windowClosed(WindowEvent E){
        l1.setText("Window status is: Closed");
        System.out.println("Window is closed");
    }


    public static void main(String args[]){
        WindowListenerEx frame = new WindowListenerEx();
    }
}