import java.awt.*;
import java.awt.event.*;
/*program for login form.*/ 

class Frame7 extends Frame{
    Button B1;
    Label L1,L2;
    TextField T1,T2;
    Frame7(){
        //layout
        setLayout(null);

        //button
        B1 = new Button("Login");

        B1.setLocation(220,350);
        B1.setSize(60,30);
        B1.setBackground(Color.pink);

        //label and text field
        L1 = new Label("UserName:", Label.LEFT);
        L1.setLocation(100,150);
        L1.setSize(80,30);
        add(L1);
        T1 = new TextField("Name", 100);
        add(T1);
        T1.setLocation(200,150);
        T1.setSize(150,30);
        L2 = new Label("Password:", Label.CENTER);
        add(L2);
        L2.setLocation(100,250);
        L2.setSize(80,30);
        T2 = new TextField("Password", 100);
        add(T2);
        T2.setLocation(200,250);
        T2.setSize(150,30);
        //frame
        setSize(500,500);
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
        //adding button
        add(B1);
    }
    
    public void paint(Graphics g){

        g.drawString("Login Here...",215,100);
    }
    public static void main(String arg[]){
        Frame7 F1 = new Frame7();
        F1.setTitle("Login");
    }
}