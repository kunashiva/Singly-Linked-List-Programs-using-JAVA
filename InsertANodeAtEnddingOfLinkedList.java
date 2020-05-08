import java.util.Scanner;
class InsertANodeAtEnddingOfLinkedList
{
 class Node
 {
  int data;
  Node next;
  Node(int data)
  {
   this.data=data;
   this.next=null;
  }
 }
 
 Node head=null;
 Node tail=null;
 void AddNode(int data)
 {
  Node newNode=new Node(data);
  if(head==null)
  {
   head=newNode;
   tail=newNode;
  }
  else
  {
   tail.next=newNode;
   tail=newNode;
  }
 }
 
 void InsertAtEnd(int data)
 {
  Node newNode=new Node(data);
  if(head==null)
  {
   head=newNode;
   tail=newNode;
  }
  else
  {
   Node current=head;
   while(current.next!=null)
   {
        current=current.next;
   }
   current.next=newNode;
  }
 }
 
 void Display()
 {
  Node current=head;
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   System.out.println("Elements  of the list");
   while(current!=null)
   {
    System.out.print(current.data+" ");
    current=current.next;
   }
   System.out.println();
  }
 }
 
 public static void main(String ar[])
 {
  InsertANodeAtEnddingOfLinkedList l=new InsertANodeAtEnddingOfLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements in the list");
  int n=s.nextInt();
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.AddNode(data);
  }
  System.out.println("OriginalList:");
  l.Display();
  System.out.println("Enter the element that you want to Insert at end");
  int q=s.nextInt();
  l.InsertAtEnd(q);
  System.out.println("Updated List");
  l.Display();
 }
}