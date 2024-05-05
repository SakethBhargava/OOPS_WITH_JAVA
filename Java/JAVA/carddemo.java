import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
    Button b1,b2,b3;
    Panel pannel = new Panel();
    CardLayout layout = new CardLayout();
    public void init()
    {
        add(pannel);
        pannel.setLayout(layout);

        b1=new Button("first Button");
        b1.addActionListener(this);
        pannel.add(b1,"first Button");

        b2=new Button("second Button");
        b2.addActionListener(this);
        pannel.add(b2,"second Button");

        b3=new Button("third button");
        b3.addActionListener(this);
        pannel.add(b3,"third Button");
    }
    public void actionPerformed(ActionEvent e)
    {
        layout.next(pannel);
    }
}