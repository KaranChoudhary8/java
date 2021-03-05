import java.awt.*;
import java.awt.event.*;
class SelectEx extends Frame implements ItemListener{
    Choice C1,C2,C3;
    Label L1,L2,L3,L4,L5;
    String DoB;
    Button B1;
    SelectEx(){
        setLayout(null);
        setTitle("Select Example");
        setVisible(true);
        setBounds(500,300,500,250);
        
        L1 = new Label();
        L1.setText("Select Your Date of Birth...");
        L1.setBounds(100,50,300,50);
        L1.setFont(new Font("Latin",Font.ITALIC,25));
        add(L1);
        setFont(new Font("Latin",Font.BOLD,15));
        L2 = new Label("Date:");
        L2.setBounds(80,120,40,30);
        add(L2);
        C1 = new Choice();
        C1.setBounds(130,120,40,30);
        for(int i=1;i<=31;i++){
            C1.add(""+i);
        }
        add(C1);
        C1.addItemListener(this);
        L3 = new Label("Month:");
        L3.setBounds(180,120,50,30);
        add(L3);
        C2 = new Choice();
        C2.setBounds(240,120,60,30);
        C2.add("Jan.");
        C2.add("Feb.");
        C2.add("Mar.");
        C2.add("Apr.");
        C2.add("May.");
        C2.add("Jun.");
        C2.add("Jul.");
        C2.add("Aug.");
        C2.add("Sep.");
        C2.add("Oct.");
        C2.add("Nov.");
        C2.add("Dec.");
        add(C2);
        C2.addItemListener(this);
        L4 = new Label("Year:");
        L4.setBounds(310,120,40,30);
        add(L4);
        C3 = new Choice();
        C3.setBounds(360,120,60,30);
        for(int i=1947;i<=2021;i++){
            C3.add(""+i);
        }
        add(C3);
        C3.addItemListener(this);
        
        L5 = new Label();
        L5.setBounds(70,180,400,50);
        DoB = C1.getSelectedItem()+" "+C2.getSelectedItem()+" "+C3.getSelectedItem()+".";
        L5.setText("Your Date of Birth is " + DoB);
        L5.setFont(new Font("Latin",Font.ITALIC,25));
        add(L5);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent WE){
                System.exit(0);
            }
        });
    }
    public void itemStateChanged(ItemEvent E){
        DoB = C1.getSelectedItem()+" "+C2.getSelectedItem()+" "+C3.getSelectedItem()+".";
        L5.setText("Your Date of Birth is " + DoB);
    }
    public static void main(String Args[]){
        SelectEx frame = new SelectEx();
    }
}