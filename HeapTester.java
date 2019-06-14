/**
 * Test class for recursive linkedlist
 * @author Mr. Reid
 * @course ICS4
 * @date 2018/12/05
 */
public class HeapTester {

 public static void main(String[] args) {

  Heap max = new Heap(1);
  for (int i=2; i<16; i++)
  {
    max.insert(i);
  }
  
  System.out.println(max);  
  
  
 }

}