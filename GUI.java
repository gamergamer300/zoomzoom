
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
public class GUI extends JFrame
{
    public GUI()
    {
    setTitle("callum");
    this.getContentPane().setPreferredSize(new Dimension(600,600));
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.pack();
    this.toFront();
    this.setVisible(true);
}
}

