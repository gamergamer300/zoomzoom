
/**
 * Write a description of class menuWIthActions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class ACTIONS extends JFrame implements ActionListener
{
    JMenuBar menuBar;
    JMenu menu;
    JMenu File;
    JMenuItem menuItem;
    Canvas myGraphic;
    JPanel panel;
    
    final String fileName="images.jfif";
    ImageIcon image=new ImageIcon(fileName);

    public ACTIONS()
    {  
        setTitle("callum");
        this.getContentPane().setPreferredSize(new Dimension(600,600));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.toFront();
        this.setVisible(true);

        JDialog box = new JDialog(this);
        box.setBounds(400,400,150,70);
        box.toFront();
        box.setVisible(true);
        box.setTitle("Hello");
        
        //dialog box, get in

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(600,600));
        Canvas myGraphic = new Canvas();
        panel.add(myGraphic);

        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);

        menu = new JMenu("File");
        menuBar.add(menu);

        menuItem=new JMenuItem("First menu item");
        menu.add(menuItem);

        menuItem=new JMenuItem("Quit");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        menuItem=new JMenuItem("Right");
        menuItem.setAccelerator(KeyStroke.getKeyStroke("RIGHT"));
        menuItem.addActionListener(this);
        menu.add(menuItem);

        menu = new JMenu("Menu2");
        menuBar.add(menu);

        menuItem=new JMenuItem("callum");
        menu.add(menuItem);

        menuItem=new JMenuItem("josh");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('a'));
        menuItem.addActionListener(this);
        menu.add(menuItem);

        menuItem=new JMenuItem("H");
        menuItem.setAccelerator(KeyStroke.getKeyStroke('h'));
        menuItem.addActionListener(this);
        menu.add(menuItem);

        menu = new JMenu("Menu3");
        menuBar.add(menu);

        menuItem=new JMenuItem("josh");
        menu.add(menuItem);

        menuItem=new JMenuItem("crab");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        menuItem=new JMenuItem("Down");
        menuItem.setAccelerator(KeyStroke.getKeyStroke("DOWN"));
        menuItem.addActionListener(this);
        menu.add(menuItem);
    }

    public void actionPerformed(ActionEvent e){
        String cmd=e.getActionCommand();
        switch (cmd) {
            case  "Quit" : System.exit(0);
            break;

            case "crab" : System.out.println("crab crab crab");
            break;

            case "josh" : System.out.println("josh bryant");
            break;
        }
    }

    public void paint (Graphics g) {
        super.paint(g);
        image.paintIcon(this,g,1,2);
    }
}