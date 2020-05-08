import java.util.Scanner;
class SearchAnElementInLinkedList
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
 
 void Search(int index)
 {
  int count=1; 
  boolean flag=false;
  if(head==null)
  {
   System.out.println("List is Empty");
  }
  else
  {
   Node current=head;
   while(current!=null)
   {
    if(index==current.data)
    {
     flag=true;
     break;
    }
    count++;
    current=current.next;
   }
   if(flag)
   { 
    System.out.println("Elements is found at: "+count);
   }
   else
   {
    System.out.println("Element not found");
   }
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
  SearchAnElementInLinkedList l=new SearchAnElementInLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want enter");
  int n=s.nextInt();
  System.out.println("Enter elements now");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.AddNode(data);
  }
  System.out.println("Original list");
  l.Display();
  System.out.println("Enter the element you want to Search");
  int data=s.nextInt();
  l.Search(data);
 }
}