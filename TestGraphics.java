// import java.util.*;
// import java.io.*;
import javax.swing.*;
import java.awt.*;

/**
 * Testing Graphics on Swing
 * @course ICS4U1
 * @date 2019/06/02
 * @author Abhishek Roy
 **/
public class TestGraphics
{
  public static void main(String args[])
  {
    second2player s = new second2player();
    JFrame f = new JFrame();
    f.add(s);
    f.setVisible(true);
    f.setSize(800, 800);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setTitle("Red & Blue");
    // f.setResizable(false);
  }
}