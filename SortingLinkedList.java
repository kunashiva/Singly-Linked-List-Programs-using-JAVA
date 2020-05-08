import java.util.Scanner;
class SortingLinkedList
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
 
 void Sort()
 {
  Node current=head;
  Node net=null;
  Node temp=null;
  if(head==null)
  {
   System.out.println("list is empty");
  }
  else
  {
   while(current!=null)
   {
    net=current.next;
    while(net!=null)
    {
     if(current.data>net.data)
     {
      int swap=current.data;
      current.data=net.data;
      net.data=swap;
     }
     net=net.next;
    }
    current=current.next;
   }
  }
 }

 void Display()
 {
  Node current=head;
  if(head==null)
  {
   System.out.println("list is  empty");
  }
  else
  {
   System.out.println("Elements of the  list");
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
  SortingLinkedList l=new SortingLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want enter");
  int n=s.nextInt();
  System.out.println("Enter elements now");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.AddNode(data);
  }
  System.out.println("original List is");
  l.Display();
  System.out.println("After Sorting the Linked List");
  l.Sort();
  l.Display();
 }
}