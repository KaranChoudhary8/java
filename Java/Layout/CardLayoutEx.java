import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CardLayoutEx extends JFrame implements ActionListener{
    Container c;
    JPanel p1,p2,p3;
    JLabel info, Pl_1, Pl_2, winner, logo;
    JTextField N1, N2;
    JButton btn[] = new JButton[9];
    JButton start, restart;
    String name1,name2;
    Font f = new Font("Arimo", Font.PLAIN, 25);
    CardLayout layout = new CardLayout();
    int turn=0; boolean result = false;
    CardLayoutEx(){
        setTitle("Card");
        setBounds(500,300,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(layout);
        //card one p1(Player Info)
            p1 = new JPanel();
            p1.setLayout(null);
            info = new JLabel("Enter Players Name Below");
            info.setBounds(80,50,340,50); info.setFont(f);
            info.setHorizontalAlignment(JLabel.CENTER);
            Pl_1 = new JLabel("Player 1: ");
            Pl_1.setBounds(50,150,120,50);Pl_1.setFont(f);
            N1 = new JTextField(30);
            N1.setBounds(170,150,250,50);N1.setFont(f);
            Pl_2 = new JLabel("Player 2: ");
            Pl_2.setBounds(50,230,120,50);Pl_2.setFont(f);
            N2 = new JTextField(30);
            N2.setBounds(170,230,250,50);N2.setFont(f);
            start = new JButton("Start");
            start.setBounds(190,350,100,50);start.setFont(f);
            start.addActionListener(this);
            p1.add(info);
            p1.add(Pl_1); p1.add(N1);
            p1.add(Pl_2); p1.add(N2);
            p1.add(start);
        //end of start card
        //p2 card (Game section)
            p2 = new JPanel();
            p2.setLayout(new GridLayout(3,3));
            for(int i=0;i<9;i++){
                btn[i] = new JButton();
                btn[i].addActionListener(this);
                btn[i].setFont(f);
                btn[i].setFont(new Font("Arimo", Font.PLAIN, 50));
                p2.add(btn[i]);
            }
        //end of gamesection
        //p3 card (end or winner Section)
            p3 = new JPanel();
            p3.setLayout(null);
            p3.setBackground(Color.black);
            logo = new JLabel(new ImageIcon("image/cup.png"));
            logo.setBounds(140,50,200,200);
            winner = new JLabel();
            winner.setHorizontalAlignment(JLabel.CENTER);
            winner.setBounds(70,270,340,50);
            winner.setFont(f);
            winner.setForeground(Color.green);
            restart = new JButton("Restart");
            restart.setBounds(180,350,120,50);restart.setFont(f);
            restart.addActionListener(this);
            p3.add(logo); p3.add(winner); p3.add(restart);
        //end of winner section

        c.add(p1,"Start");
        c.add(p2,"Game");
        c.add(p3,"Last");
        setVisible(true);
    }
    public void actionPerformed(ActionEvent E){
        JButton b = (JButton)E.getSource();
        //start btn
            if(b==start){
                if((N1.getText().equals(""))||(N2.getText().equals(""))){
                    info.setForeground(Color.red);
                    System.out.println("name not found");
                }
                else{
                    info.setForeground(Color.black);
                    name1 = N1.getText();
                    name2 = N2.getText();
                    layout.show(c,"Game");
                    System.out.println("next card");
                }
            }
        //end of start button
        //last section
            else if(b==restart){
                N1.setText("");
                N2.setText("");
                layout.show(c,"Start");
            }
        //end of last section
        //game Section
            else{
                if(turn%2==0){
                    b.setLabel("X");
                    b.removeActionListener(this);
                }
                else{
                    b.setLabel("0");
                    b.removeActionListener(this);
                }
                turn++;
                winnerCal();
                if(turn==9 && result==false){
                    turn=0;
                    for(int i=0;i<9;i++){
                        btn[i].setLabel("");
                        btn[i].addActionListener(this);
                    }
                }
                if(result==true){
                    layout.show(c,"Last");
                    turn=0;
                    result = false;
                    for(int i=0;i<9;i++){
                        btn[i].setLabel("");
                        btn[i].addActionListener(this);
                    }
                }
            }
        //end of Game Section
    }
    private void winnerCal(){
        
        for(int i=0;i<=6;i=i+3){
            if(btn[i].getLabel()=="X" && btn[i+1].getLabel()=="X" && btn[i+2].getLabel()=="X"){
                result = true; winnerLabel(name1);
            }
            else if(btn[i].getLabel()=="0" && btn[i+1].getLabel()=="0" && btn[i+2].getLabel()=="0"){
                result = true; winnerLabel(name2);
            }
        }
        for(int i=0;i<3;i++){
            if(btn[i].getLabel()=="X" && btn[i+3].getLabel()=="X" && btn[i+6].getLabel()=="X"){
                result = true; winnerLabel(name1);
            }
            else if(btn[i].getLabel()=="0" && btn[i+3].getLabel()=="0" && btn[i+6].getLabel()=="0"){
                result = true; winnerLabel(name2);
            }
        }
        if(btn[0].getLabel()=="X" && btn[4].getLabel()=="X" && btn[8].getLabel()=="X"){
            result = true; winnerLabel(name1);
        }
        else if(btn[0].getLabel()=="0" && btn[4].getLabel()=="0" && btn[8].getLabel()=="0"){
            result = true; winnerLabel(name2);
        }
        if(btn[2].getLabel()=="X" && btn[4].getLabel()=="X" && btn[6].getLabel()=="X"){
            result = true; winnerLabel(name1);
        }
        else if(btn[2].getLabel()=="0" && btn[4].getLabel()=="0" && btn[6].getLabel()=="0"){
            result = true; winnerLabel(name2);
        }
    }
    private void winnerLabel(String Winner){
        winner.setText("Winner is "+ Winner + ".");
    }
    public static void main(String args[]){
        new CardLayoutEx();
    }
}