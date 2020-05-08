class SingleLinkedList
{
 public class Node
 {
  int data;
  Node next;
  
  public Node(int data)
  {
   this.data=data;
   this.next=null;
  }
 } 
 
 public Node head=null;
 public Node tail=null;
 
 public void insert(int data)
 {
  Node newnode=new Node(data);
  
  if(head==null)
  {
   head=newnode;
   tail=newnode;
  }
  else
  {
   tail.next=newnode;
   tail=newnode;
  }
 }
 public void show()
 {
  Node current=head;
  if(head==null)
  {
   System.out.println("List is Empty");
  }
  System.out.println("Nodes of Single Linked List");
  while(current!=null)
  {
   System.out.print(current.data+" ");
   current=current.next;
  }
  /*while(current.next!=null)//another way to  show elements in linked list.
  {
   System.out.print(current.data+" ");//it will only  print upto last 2nd element bcoz last element's "next" value is "null" is it not eneter into while loop so we print it outside the while loop
   current=current.next;
  }
  System.out.print(current.data)//it will print the last elememnt.
 }
 public static void main(String ar[])
 {
  SingleLinkedList l=new SingleLinkedList();
  l.insert(2);
  l.insert(45);
  l.insert(7);
  l.show();
 }
}