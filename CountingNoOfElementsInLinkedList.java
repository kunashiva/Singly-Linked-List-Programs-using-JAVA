import java.util.Scanner;
class CountingNoOfElementsInLinkedList
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


 int Count()
 {
  Node n=head;
  int count=0;
  if(head==null)
  {
   return count;
  }
  else
  {
   while(n!=null)
   {
    count++;
    n=n.next;
   }
   return count;
  }
 }


 void Display()
 {
  Node n=head;
  if(head==null)
  {
   System.out.println("List is Empty");
  }
  else
  {
   System.out.println("Elements in Linked List are: ");
   while(n!=null)
   {
    System.out.print(n.data+" ");
    n=n.next;
   }
   System.out.println();
  }
 }
 

 public static void main(String ar[])
 {
  CountingNoOfElementsInLinkedList list=new CountingNoOfElementsInLinkedList();
  System.out.println("Enter how many elements you want to enter");
  Scanner scan=new Scanner(System.in);
  int n=scan.nextInt();
  System.out.println("Enter the elemnts: ");
  for(int i=0;i<n;i++)
  {
   int data=scan.nextInt();
   list.addNode(data);
  }
  
  list.Display();
  System.out.println("No of elements in Linked List are: "+list.Count());
 }
}