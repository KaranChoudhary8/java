import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//prog. for Tic Tak Toe game using java.swing package;
class TicTakToe extends JFrame implements ActionListener{
    JButton[] btn = new JButton[9];
    int turn=0;
    boolean result = false;
    JLabel L1;
    TicTakToe(String title){
        super(title);
        //layout
        setLayout(null);
        getContentPane().setBackground(Color.black);
        setBounds(500,300,320,440);
        setVisible(true);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        //button
        int x=0,y=0,z=0;//where x,y,z are X,Y-axis and z is btn count resp. 
        Font f = new Font("BatmanForeverAlternate",Font.BOLD,30);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                btn[z] = new JButton();
                btn[z].setBounds(x,y,100,100);
                btn[z].addActionListener(this);
                add(btn[z]);
                btn[z].setFont(f);
                z++;
                x+=100;
            }
            x=0;
            y+=100;
        }
        //label
        L1 = new JLabel();
        L1.setBounds(75,330,200,40);
        L1.setFont(new Font("Calibri Light",Font.ITALIC,40));
        L1.setForeground(Color.green);
        add(L1);
    }
    public void actionPerformed(ActionEvent e){
        JButton b = (JButton) e.getSource();
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
        if(result==true){
            for(int i=0;i<9;i++){
                btn[i].removeActionListener(this);
            }
        }
    }
    private void winnerCal(){
        for(int i=0;i<=6;i=i+3){
            if(btn[i].getLabel()=="X" && btn[i+1].getLabel()=="X" && btn[i+2].getLabel()=="X"){
                showWinner('X');
                result = true;
            }
            else if(btn[i].getLabel()=="0" && btn[i+1].getLabel()=="0" && btn[i+2].getLabel()=="0"){
                showWinner('0');result = true;
            }
        }
        for(int i=0;i<3;i++){
            if(btn[i].getLabel()=="X" && btn[i+3].getLabel()=="X" && btn[i+6].getLabel()=="X"){
                showWinner('X');result = true;
            }
            else if(btn[i].getLabel()=="0" && btn[i+3].getLabel()=="0" && btn[i+6].getLabel()=="0"){
                showWinner('0');result = true;
            }
        }
        if(btn[0].getLabel()=="X" && btn[4].getLabel()=="X" && btn[8].getLabel()=="X"){
            showWinner('X');result = true;
        }
        else if(btn[0].getLabel()=="0" && btn[4].getLabel()=="0" && btn[8].getLabel()=="0"){
            showWinner('0');result = true;
        }
        if(btn[2].getLabel()=="X" && btn[4].getLabel()=="X" && btn[6].getLabel()=="X"){
            showWinner('X');result = true;
        }
        else if(btn[2].getLabel()=="0" && btn[4].getLabel()=="0" && btn[6].getLabel()=="0"){
            showWinner('0');result = true;
        }
    }
    private void showWinner(char winner){
        System.out.println("Winner is: " + winner);
        L1.setText(winner + " Wins!!!");
    }
    public static void main(String Args[]){
        TicTakToe frame = new TicTakToe("Tic Tak Toe Game");
    }
}