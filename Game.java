import java.awt.EventQueue;
import javax.swing.JFrame;

/*
 * Game Class (main)
 * @Course: ICS4U
 * @Date: June 2019
 * @Authors: Abhishek R, Anthony T, Jenny N, Kelvin H
 * NOTES: The game class was referenced from user tanu1215 from stack exchange
 */

public class Game extends JFrame 
{
  private Map map1;
  private Snek snake;
  private Snek snake2;
  
  public Snek getSnake()
  {
    return map1.getSnake();
  }
  
  public Snek getSnake2()
  {
    return map1.getSnake2();
  }
    
  Game() 
  {
    map1 = new Map();
    add(map1);
    pack();
    
    //Setting the interface
    setTitle("SNEK");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }
  
  public static void main(String[] args) 
  {
    // Creates a new thread so our GUI can process itself
    EventQueue.invokeLater(new Runnable() {
      public void run() 
      {
        JFrame frame = new Game();
        frame.setVisible(true);
      }
    });
  }
}