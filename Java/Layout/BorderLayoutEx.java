import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class BorderLayoutEx extends JFrame implements ActionListener{
    JButton B1,B2;
    String[] name = {"image/book.jpg","image/City.jpg","image/field.jpg","image/tree.jpg"};
    JLabel L1,L2,image;
    int count = 0;
    Font f = new Font("Arimo",Font.PLAIN, 20);
    BorderLayoutEx(){
        setLayout(new BorderLayout());
        setVisible(true);
        setTitle("Image Slider...");
        setBounds(500,300,780,620);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        B1 = new JButton("Next");
        B1.addActionListener(this);
        B2 = new JButton("Prev.");
        B2.addActionListener(this);
        image = new JLabel(new ImageIcon(name[count]));
        L1 = new JLabel(name[count], JLabel.CENTER);
        L1.setFont(f);
        L2 = new JLabel((count+1) + "/" + name.length, JLabel.CENTER);
        L2.setFont(f);
        add(L1,BorderLayout.NORTH);
        add(B2,BorderLayout.WEST);
        add(image,BorderLayout.CENTER);
        add(B1,BorderLayout.EAST);
        add(L2,BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==B1){
            if(count==3){count=0;}
            else{count++;}
            System.out.println(count);
            image.setIcon(new ImageIcon(name[count]));
            L1.setText(name[count]);
            L2.setText((count+1) + "/" + name.length);
        }
        else if(e.getSource()==B2){
            if(count==0){count=3;}
            else{count--;}
            System.out.println(count);
            image.setIcon(new ImageIcon(name[count]));
            L1.setText(name[count]);
            L2.setText((count+1) + "/" + name.length);
        }
    }
    public static void main(String argss[]){
        new BorderLayoutEx();
    }
}