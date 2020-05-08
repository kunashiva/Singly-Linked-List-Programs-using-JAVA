import java.util.Scanner;
class FindingMinMaxOfLinkedList
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
 
 void addNode(int data)
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
 
 void MinNode()
 {
  int min;
  Node current=head;
  min=head.data;
  if(head==null)
  {
   System.out.println("List is Empty");
  }
  else
  {
   while(current!=null)
   {
    if(min>current.data)
    {
     min=current.data;
    }
    current=current.next;
   }
  }
  System.out.println("Min Node Of linked list is: "+min);
 }
 
 void MaxNode()
 {
  int max;
  Node current=head;
  max=head.data;
  if(head==null)
  {
   System.out.println("list is Empty");
  }
  else
  {
   while(current!=null)
   {
    if(max < current.data)
    {
     max=current.data;
    }
    current=current.next;
   }
   System.out.println("Max Node of linked list is: "+max);
  }
 }
 
 void Display()
 {
  Node current=head;
  if(head==null)
  {
   System.out.println("List is Empty");
  }
  else
  {
   System.out.println("Elements of the List are:");
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
  FindingMinMaxOfLinkedList l=new FindingMinMaxOfLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements in the list:");
  int n=s.nextInt();
  System.out.println("Enter the Elements of the list");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.addNode(data);
  }
  System.out.println("Linked List:");
  l.Display();
  l.MinNode();
  l.MaxNode();

 }
}