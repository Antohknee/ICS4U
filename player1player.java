import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.color.*;
import java.lang.*;
/**
 * Testing Graphics on Swing
 * @course ICS4U1
 * @date 2019/06/02
 * @author Abhishek Roy
 **/
public class player1player extends JPanel implements ActionListener, KeyListener
{
  Timer t = new Timer(5, this); 
  double x1 = 0, y1 = 0, velx1 = 0, vely1 = 0;
  double x2 = 300, y2 = 300, velx2 = 0, vely2 = 0;

  
  public player1player()
  {
    t.start();
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
  }
   
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    Rectangle2D circle = new Rectangle2D.Double(x1,  y1,  40, 40);
    Rectangle2D circle2 = new Rectangle2D.Double(x2,  y2,  40, 40);
    g2.setColor(Color.RED);
    g2.fill(circle);
    g2.setColor(Color.BLUE);
    g2.fill(circle2);
    //g2.setColor(Color.BLUE);
  }
  
  
  public void actionPerformed(ActionEvent e)   // based on the timer, every five milliseconds, the frame will be redrawn
  {
    if (x1 < 0 || x1 > 760)
    {
      velx1 = 0;
      if (x1 < 0)
      {
        x1 = 1;
      }
      else if (x1 > 750)
      {
        x1 = 749;
      }
    }
    if (y1 < 0 || y1 > 520)
    {
      vely1 = 0;
      if (y1 < 0)
      {
        y1 = 1;
      }
      else if (y1 > 520)
      {
        y1 = 519;
      }
    }
    if (x2 < 0 || x2 > 760)
    {
      velx2 = 0;
      if (x2 < 0)
      {
        x2 = 1;
      }
      else if (x2 > 750)
      {
        x2 = 749;
      }
    }
    if (y2 < 0 || y2 > 520)
    {
      vely2 = 0;
      if (y2 < 0)
      {
        y2 = 1;
      }
      else if (y2 > 520)
      {
        y2 = 519;
      }
    }
    
    if ((Math.abs(x1 - x2) < 40) && (Math.abs(y1 - y2) < 40)) // Collision code
    {
     
      x1 = 0;
      y1 = 0;
      x2 = 300;
      y2 = 400;
      
      /*
      velx1 = 0;
      vely1 = 0;
      velx2 = 0;
      vely2 = 0;
      */
    }
    
    repaint(); // Repaints the screen so that movement can be seen
    x1 += velx1;
    y1 += vely1;
    x2 += velx2;
    y2 += vely2;
   
  }
  
  public void up()
  {
    vely1 = -2.5;
    velx1 = 0;
  }
  
  public void down()
  {
    vely1 = 2.5;
    velx1 = 0;
  }
  
  public void left()
  {
    vely1 = 0;
    velx1 = -2.5;
  }
  
  public void right()
  {
    vely1 = 0;
    velx1 = 2.5;
  }
  
    public void w()
  {
    vely2 = -2.5;
    velx2 = 0;
  }
  
  public void s()
  {
    vely2 = 2.5;
    velx2 = 0;
  }
  
  public void a()
  {
    vely2 = 0;
    velx2 = -2.5;
  }
  
  public void d()
  {
    vely2 = 0;
    velx2 = 2.5;
  }
  
  
  public void keyPressed(KeyEvent e)
  {
    int code = e.getKeyCode();
    if (code == KeyEvent.VK_UP)
    {
      up();
    }
    if (code == KeyEvent.VK_DOWN)
    {
      down();
    }
    if (code == KeyEvent.VK_LEFT)
    {
      left();
    }
    if (code == KeyEvent.VK_RIGHT)
    {
      right();
    }
    if (code == KeyEvent.VK_W)
    {
      w();
    }
    if (code == KeyEvent.VK_S)
    {
      s();
    }
    if (code == KeyEvent.VK_A)
    {
      a();
    }
    if (code == KeyEvent.VK_D)
    {
      d();
    }
  }
  
  
  public void keyTyped(KeyEvent e) {}
  public void keyReleased(KeyEvent e) {}
  
  public double getXcoords()
  {
    return x1;
  }
  
  public double getYcoords()
  {
    return y1;
  }
  public void setXcoords(double xCoords)
  {
    x2 = xCoords;
  }
  public void setYcoords(double yCoords)
  {
    y2 = yCoords;
  }
}