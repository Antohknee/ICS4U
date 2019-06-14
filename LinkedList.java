/**
 * Simplified LinkedList class
 * @author Mr. Reid
 * @course ICS4
 * @date 2018/12/05
 */
public class LinkedList {
 // Attributes (just ints for now)
 LinkedList next;
 int value;

 /**
  * Constructor - must include first item
  * @param v
  */
 public LinkedList(int v)
 {
  this.value = v;  
  this.next = null;
 }

 /**
  * Add item recursively
  * @param v
  */
 public void add(int v)
 {
  if (this.next == null)
  {
   this.next = new LinkedList(v);
  } else {
   this.next.add(v);
  }
 }

 /**
  * Remove item recursively
  * @param v
  * @return new list - required in case first one is deleted and/or list is empty
  */
 public LinkedList remove(int v)
 {
  LinkedList result = this;
  // Check if head
  if (this.value == v)
  { 
   result = this.next;
  }
  else if (this.next != null)
  {
   this.next = this.next.remove(v);
  }
  return result;
 }

 
 /**
  * Override default toString to output 
  */
 public String toString()
 {
  String result = this.value+" ";
  if (this.next != null)
  {
   result += this.next.toString();
  }
  return result;
 }

 /**
  * Override default toString to output 
  */
 public String reverse()
 {
  String result = "";
  if (this.next != null)
  {
   result += this.next.reverse();
  }
  result += this.value+" ";

  return result;
 }

}