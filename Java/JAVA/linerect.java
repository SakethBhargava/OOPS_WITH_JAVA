import java.awt.*;
import java.io.*;
import java.applet.*;
/*<applet code="linerect.class" height=300 width=300>
</applet>*/
public class linerect extends Applet
{
public void paint(Graphics g)
{
g.drawLine(10,10,50,50);
g.drawRect(10,60,40,30);
g.fillRect(60,10,30,80);
g.drawRoundRect(10,100,80,50,10,10);
g.fillRoundRect(20,110,60,30,5,5);
g.drawLine(100,10,230,140);
g.drawLine(100,140,230,10);
}
}