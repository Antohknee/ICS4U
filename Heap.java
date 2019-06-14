/**
 * Simplified Heap class
 * @author Mr. Reid
 * @course ICS4
 * @date 2019/05/21
 */
public class Heap {
 // Attributes (just int for now)
 Heap left;
 Heap right;
 int value;
 int size = 0;

 /**
  * Constructor - must include first item
  * @param v
  */
 public Heap(int v)
 {
  this.value = v;  
  this.right = null;
  this.left = null;
  this.size = 1;
 }

 /**
  * Add item recursively
  * @param v
  */
 public void insert(int v)
 {
   // Base cases - missing a child
   if (this.left == null)
   {
     this.left = new Heap(v);
     this.size ++;
   }
   else if (this.right == null)
   {
     this.right = new Heap(v);
     this.size++;
   }
   else
   {
     // Determine if left or right by the size of the tree
     double height = Math.log(size+1)/Math.log(2);
     double direction = height - Math.floor(height);
     //System.out.println(height+" "+direction);
     if (direction < 0.5)
     {
       this.left.insert(v);
     }
     else
     {
       this.right.insert(v);
     }
     this.size++;
   }
 }

 public void heapify()
 {
	 
 }
 
 /**
  * Remove item recursively ** Not done **
  * @param v
  * @return new list - required in case first one is deleted and/or list is empty
  */
 public Heap remove(int v)
 {
  Heap result = this;

  return result;
 }

 
 /**
  * Override default toString to output - preorder traversal
  */
 public String toString()
 {
  String result = this.value+" ";
  if (this.left != null)
  {
   result += this.left.toString();
  }
  if (this.right != null)
  {
   result += this.right.toString();
  }

  return result;
 }

}