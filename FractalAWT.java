import javax.swing.*;

import java.awt.*;

/**
 * The Fractal class is used to demonstrate recursive algorithm design
 * @author Mr. Reid
 * @date Revised 2015 (AWT), Original May 2007
 * @course ICS4U
 */
public class FractalAWT extends JComponent
{
  //static Console c;           // The output console
 Graphics g = null;

 public FractalAWT()
 {
  JFrame frame = new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit program when you close it
  frame.setSize(1400,800);  // set the size of the window to whatever width and height you like
  frame.add(this); // put an object we can draw on in the centre of the window
  frame.setVisible(true); //show the window
 } 
    
  /**
   * Draw a box recursively within itself
   */
  public void drawBoxRecursively (int x, int y, int width, int height, Color c)
  {
 this.g.setColor (c);  
    //this.g.fillRect (x, y, width, height);
    this.g.drawRect (x, y, width, height);
    
    // Base case
    if (width < 1)
    {
     this.g.setColor (Color.RED);
    }
    else
    {
      // Recursively call
      drawBoxRecursively (x + (width / 4), y + (height / 4), width / 2, height / 2, c.darker());
    }
  }
  
  /**
   * Draw a line and cross each end recursively
   */
  public void drawCrosses(int x1, int y1, int x2, int y2) 
  {
    double div = 3;
    
    // Draw the original line
    this.g.drawLine(x1, y1, x2, y2);

    // Find next lines (either end)
    
    if (y1 == y2) // Horizontal line
    {   
      double length = Math.abs(x2 - x1);
      if (length > 1)
      {
        drawCrosses(x1, (int)(y1 - length/div), x1, (int)(y2 + length/div));
        drawCrosses(x2, (int)(y1 - length/div), x2, (int)(y2 + length/div));
      }
    } else {
      float length = Math.abs(y2 - y1);
      if (length > 10)
      {
        drawCrosses((int)(x1 - length/div), y1, (int)(x2 + length/div), y1);
        drawCrosses((int)(x1 - length/div), y2, (int)(x2 + length/div), y2);
      }
    }
    
  }
  
  /**
   * Draw a Spiraling line
   */
  public void drawSpiral (int x, int y, int length, float angle)
  {
    int x2 = x + (int) (Math.cos (Math.toRadians (angle)) * length);
    int y2 = y - (int) (Math.sin (Math.toRadians (angle)) * length);
    
    this.g.setColor (Color.BLACK);
    this.g.drawLine (x, y, x2, y2);
    
    if (length > 1)
    {
      // Recursive call for next line
      drawSpiral (x + 10, y, length * 9 / 10, angle + 3);
    }
  }

  public void paint(Graphics g)
  {
   this.g = g;
   
   //this.drawBoxRecursively (0, 0, 800, 800, Color.BLUE);
   //this.drawSpiral (100, 500, 1200, 10);
   
   this.drawCrosses(300, 400, 900, 400);
   
  }
  
  public static void main (String[] args) 
  {
   new FractalAWT();    
  } // main method
} // Fractal class