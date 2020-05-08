import java.util.Scanner;
class RemoveDuplicatesInLinkedList
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
 
 void RemoveDuplicates()
 {
  Node current=head;
  Node index=null; 
  Node temp=null;
  
  while(current!=null)
  {
   temp=current;
   index=temp.next;
   while(index!=null)
   {
    if(current.data==index.data)
    {
     temp.next=index.next;
    }
    else
    {
     temp=current.next;
    }
    index=index.next;
   }
   current=current.next;
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
   System.out.println("Elements of the list are:");
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
  RemoveDuplicatesInLinkedList r=new RemoveDuplicatesInLinkedList();
  Scanner scan=new Scanner(System.in);
  System.out.println("No of Elements you want to insert");
  int n=scan.nextInt();
  System.out.println("Enter Elements of the list");
  for(int i=0;i<n;i++)
  {
   int data=scan.nextInt();
   r.AddNode(data);
  }
  System.out.println("Original List");
  r.Display();
  System.out.println("After Removing Duplicates in the list");
  r.RemoveDuplicates();
  r.Display();
 }
}