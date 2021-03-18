import java.awt.*;
import java.awt.event.*;
class AdjustmentListenerEx extends Frame implements AdjustmentListener{
    Label L1, L2, heading;
    Scrollbar s1, s2;
    Panel p;
    //prog. for adjustment listener and scroll bar using (java.awt).
    //scroll bar use adjustment listener for any event perform on it
    Font f = new Font("Arimo",Font.PLAIN,20);
    AdjustmentListenerEx(){
        setTitle("Adjustment Listener");
        setVisible(true);
        setBounds(500,300,500,500);
        addWindowListener(new WindowAdapter(){//window closing 
            public void windowClosing(WindowEvent E){
                System.exit(0);
            }
        });
        heading = new Label("Scroll Bar",Label.CENTER);
        heading.setFont(f);
        s1 = new Scrollbar(Scrollbar.HORIZONTAL, 100,20,1,100);
        s2 = new Scrollbar(Scrollbar.VERTICAL, 100,20,1,100);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        p = new Panel();
        L1 = new Label("Vertical scrollbar value: " + s2.getValue());
        L2 = new Label("Horizontal scrollbar value: " + s1.getValue(),Label.CENTER);
        add(s1, BorderLayout.SOUTH);
        add(s2, BorderLayout.EAST);
        add(heading, BorderLayout.NORTH);
        p.add(L1);
        p.add(L2);
        add(p, BorderLayout.CENTER);
    }
    public void adjustmentValueChanged(AdjustmentEvent E){
        L1.setText("Vertical scrollbar value: " + s2.getValue());
        L2.setText("Horizontal scrollbar value: " + s1.getValue());
    }
    public static void main(String args[]){
        new AdjustmentListenerEx();
    }
}