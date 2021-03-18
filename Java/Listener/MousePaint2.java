import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//prog. for action, mouse, item and mouse motion listener
class MousePaint2 extends JFrame implements MouseMotionListener, MouseListener, ActionListener{
    int lastX,lastY,x,y;
    JButton b1,b2;
    JComboBox c1, c2;
    int drawtype = 1;
    Color bgcolor, drawcolor;
    MousePaint2(){
        //frame
        setLayout(null);
        setTitle("Mouse Paint");
        setVisible(true);
        setBounds(300,300,600,600);
        //button
        b1 = new JButton("Background Color");
        b1.setBounds(50,0,150,30);
        b1.addActionListener(this);
        add(b1);
        b2 = new JButton("Color");
        b2.setBounds(220,0,80,30);
        b2.addActionListener(this);
        add(b2);

        //combobox
        c1 = new JComboBox();
        c1.setBounds(320,0,100,30);
        c1.addItem("Draw Normal");
        c1.addItem("Draw Stright");
        c1.addItem("Select Size");
        add(c1);
        c1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent E){
                if(c1.getSelectedItem()=="Select Size"){
                    c2.setEnabled(true);
                }
                else{
                    c2.setEnabled(false);
                }
            }
        });

        c2 = new JComboBox();
        c2.setBounds(430,0,100,30);
        for(int i=1;i<=30;i++){
            c2.addItem(""+i);
        }
        c2.setEnabled(false);
        add(c2);
        //radio Button
       /* R1 = new JRadioButton("Draw Normal",true);
        R1.setBounds(320,0,100,30);
        add(R1);
        R2 = new JRadioButton("Draw Stright",false);
        R2.setBounds(430,0,100,30);
        add(R2);
        ButtonGroup BG = new ButtonGroup();
        BG.add(R1);BG.add(R2);*/
        //window closing 
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        //resize
        setResizable(false);

        //mouse Listener
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void actionPerformed(ActionEvent E){
        if(E.getSource()==b1){
            bgcolor = JColorChooser.showDialog(this,"Select Background Color",Color.white);
            getContentPane().setBackground(bgcolor);
        }
        if(E.getSource()==b2){
            drawcolor = JColorChooser.showDialog(this,"Select Drawing Color",Color.black);
            setForeground(drawcolor);
        }
    }
    public void mousePressed(MouseEvent E){
            lastX = E.getX();
            lastY = E.getY();
    }
    public void mouseDragged(MouseEvent E){
        x = E.getX();
        y = E.getY();
        if(c1.getSelectedItem()=="Draw Normal"){
            Graphics G =getGraphics();
            G.drawLine(lastX,lastY,x,y);
            lastX = x;
            lastY = y;
        }
        else if(c1.getSelectedItem()=="Select Size"){
            Graphics G = getGraphics();
            String Ssize = (String) c2.getSelectedItem();
            int size = Integer.parseInt(Ssize);
            G.fillOval(x,y,size,size);
        }
    }
    public void mouseReleased(MouseEvent E){/*When mouse key is released, it is method of MouseListener*/
        if(c1.getSelectedItem()=="Draw Stright"){
            x = E.getX();
            y = E.getY();
            Graphics G = this.getGraphics();
            G.drawLine(lastX,lastY,x,y);
            lastX = x;
            lastY = y;
        }
    }
    //other methods of MOUSELISTENER and MOUSEMOTIONLISTENER
    public void mouseMoved(MouseEvent E){/*When mouse is moved, it is method of MouseMotionListener*/}
    public void mouseClicked(MouseEvent E){/*When mouse key is pressed, it is method of MouseListener*/}
    public void mouseEntered(MouseEvent E){/*When mouse key is entered, it is method of MouseListener*/}
    public void mouseExited(MouseEvent E){/*When mouse key is exit, it is method of MouseListener*/}

    public static void main(String Args[]){
        MousePaint2 frame = new MousePaint2();
    }
}