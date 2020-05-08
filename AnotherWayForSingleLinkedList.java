class AnotherWayForSingleLinkedList
{
 Node head;
 static class Node
 {
  int data;
  Node next;
  public Node(int data) 
  {
   this.data=data;
   this.next=null;
  }
 }
 public void Display()
 {
  Node current=head;
  if(head==null)
  {
   System.out.println("List is Empty");
  }
  else
  {
   System.out.println("Elements in the list are: ");
   while(current.next!=null)//printing upto 2nd last elements of the linkedlist.
   { 
    System.out.print(current.data+" ");
    current=current.next;
   }
   System.out.print(current.data);//printing last element of the linkedList.
  }
 }
 public static void main(String ar[])
 {
  AnotherWayForSingleLinkedList l=new AnotherWayForSingleLinkedList();
  l.head=new Node(100);
  Node second=new Node(200);
  Node third=new Node(300);
  l.head.next=second;
  second.next=third;
  l.Display();
 }
}