
/**
 * Write a description of class MENU here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MENU extends JFrame
{
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    public MENU()
    {
        setTitle("callum");
        this.getContentPane().setPreferredSize(new Dimension(600,100));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.toFront();
        this.setVisible(true);
        
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        
        menu = new JMenu("A Menu");
        menuBar.add(menu);
        
        menuItem=new JMenuItem("First menu item");
        menu.add(menuItem);
        

    }
}