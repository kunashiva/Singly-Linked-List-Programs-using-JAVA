import java.util.Scanner;
class DeleteANodeFromLinkedList
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

 void DeleteAt(int index)
 {
  if(index==0)
  {
   head=head.next;
  }
  else
  {
   Node n=head;
   Node n1=null;
   for(int i=0;i<index-2;i++)
   {
    n=n.next;
   }
   n1=n.next;
   n.next=n1.next;
   n1=null;
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
    while(current!=null)
    {
     System.out.print(current.data+" ");
     current=current.next;
    }
   }
  }

 public static void main(String ar[])
 {
  DeleteANodeFromLinkedList d=new DeleteANodeFromLinkedList();
  System.out.println("enter no of elements in the list:");
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  System.out.println("enter the elements in the list:");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   d.AddNode(data);
  }
  d.DeleteAt(2);
  d.Display();
 }
}