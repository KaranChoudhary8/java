import java.awt.*;
import java.awt.event.*;
/*program for set background by button*/ 
class Frame5 extends Frame implements ActionListener{
    Button B1,B2,B3;
    Frame5(){
        //button
        setLayout(null);
        B1 = new Button("Yellow");
        B1.setSize(50,30);
        B1.setLocation(100,235);
        B1.setBackground(Color.yellow);
        this.add(B1);//add button to frame
        B2 = new Button("Green");
        B2.setSize(50,30);
        B2.setLocation(200,235);
        B2.setBackground(Color.green);
        this.add(B2);
        B3 = new Button("Pink");
        B3.setSize(50,30);
        B3.setLocation(300,235);
        B3.setBackground(Color.pink);
        this.add(B3);
        //adding listener
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);

        //frame
        setSize(450,500);
        setVisible(true);
        setLocation(200,200);
        
        //font
        Font font = new Font("ACID LABEL___",Font.ITALIC,15);
        setFont(font);

        //frame termination
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == B1){
            setBackground(Color.yellow);
        }
        else if(e.getSource() == B2){
            setBackground(Color.green);
        }
        else if(e.getSource() == B3){
            setBackground(Color.pink);
        }
    }
    public void paint(Graphics g){
        g.drawString("Click on Any Button to change Background",100,100);
    }
    public static void main(String arg[]){
        Frame5 F1 = new Frame5();
        F1.setTitle("Change Background");
    }
}