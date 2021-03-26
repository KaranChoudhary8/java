import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MenusEx extends JFrame implements ActionListener, ItemListener{
    JMenuBar menubar;
    JMenu file, edit, format;
    JMenuItem newf, open, save, saveas, exit;
    JMenuItem cut, copy, paste, selectAll;
    JCheckBoxMenuItem wrap;
    JTextArea content;
    Font f = new Font("Gotham", Font.PLAIN, 18);
    MenusEx(){
        setFont(f);
        setBounds(200,100,1500,800);
        setTitle("Text Editor");
        menubar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        menubar.add(file);menubar.add(edit);menubar.add(format);
        newf = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        saveas = new JMenuItem("Save As");
        file.add(newf);file.add(open);file.add(save);file.add(saveas);
        file.add(new JSeparator());
        exit = new JMenuItem("Exit");
        file.add(exit);
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
        wrap = new JCheckBoxMenuItem("Word wrap");
        format.add(wrap);
        setJMenuBar(menubar); 
        content = new JTextArea();
        content.setFont(f);
        JScrollPane sp = new JScrollPane(content, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(sp);

        newf.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        saveas.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        exit.addActionListener(this);
        selectAll.addActionListener(this);
        wrap.addItemListener(this);
        setVisible(true);
        validate();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == newf){
            MenusEx f2 = new MenusEx();
            f2.setDefaultCloseOperation(f2.EXIT_ON_CLOSE);
        }
        else if(e.getSource() == open){
            JOptionPane.showMessageDialog(this,"This Feature added Soon Completely","Update",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Open Command");
        }
        else if(e.getSource() == save){
            JOptionPane.showMessageDialog(this,"This Feature added Soon Completely","Update",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Save Command");
        }
        else if(e.getSource() == saveas){
            JOptionPane.showMessageDialog(this,"This Feature added Soon Completely","Update",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Save_As Command");
        }
        else if(e.getSource() == exit){
            System.exit(0);
        }
        else if(e.getSource() == cut){
            content.cut();
        }
        else if(e.getSource() == copy){
            content.copy();
        }
        else if(e.getSource() == paste){
            content.paste();
        }
        else if(e.getSource() == selectAll){
            content.selectAll();
        }
    }
    public void itemStateChanged(ItemEvent e){
        if(wrap.isSelected()==true){
            content.setLineWrap(true);
            content.setWrapStyleWord(true);
        }
        else{
            content.setLineWrap(false);
            content.setWrapStyleWord(false);
        }
    }
    public static void main(String args[]){
        MenusEx f1 = new MenusEx();
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
    }
}