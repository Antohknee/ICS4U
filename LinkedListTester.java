/**
 * Test class for recursive linkedlist
 * @author Mr. Reid
 * @course ICS4
 * @date 2018/12/05
 */
public class LinkedListTester 
{

 public static void main(String[] args) 
 {

  LinkedList ll = new LinkedList(10);
  ll.add(6);
  ll.add(2);
  ll.add(8);
  ll.add(9);
  ll.add(10);
  ll.add(11);
  ll.add(12);
  ll.add(13);
  
  
  System.out.println(ll);  
  System.out.println(ll.reverse());

  ll = ll.remove(6);
  System.out.println(ll);  
 }
}