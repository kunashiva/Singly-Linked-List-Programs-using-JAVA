import java.util.Scanner;
class ReverseLinkedlistWithoutRecursion
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
 
 void Display()
 {
  Node current=head;
  if(current==null)
  {
   System.out.println("List is empty:");
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
  void Reverse()
  {
   Node current=head;
   Node next=null;
   Node previous=null;
   while(current!=null)//it reverse's the LinkedList
   {
    next=current.next;
    current.next=previous;
    previous=current;
    current=next;
   }
   while(previous!=null)//after above while loop previous becomes head
   {
    System.out.print(previous.data+" ");
    previous=previous.next;
   }
   System.out.println();
  }
   
  public static void main(String ar[])
  {
   ReverseLinkedlistWithoutRecursion r=new ReverseLinkedlistWithoutRecursion();
   Scanner scan=new Scanner(System.in);
   System.out.println("enter thhe no of elements you want to enter");
   int n=scan.nextInt();
   System.out.println("enter the elements");
   for(int i=0;i<n;i++)
   {
    int data=scan.nextInt();
    r.AddNode(data);
   }
   System.out.println("Original Order");
   r.Display();
   System.out.println("reverse order");
   r.Reverse();
  }
}