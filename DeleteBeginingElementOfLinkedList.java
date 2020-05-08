import java.util.Scanner;
class DeleteBeginingElementOfLinkedList
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
  if(head==null)
  {
   System.out.println("List is Empty");
  }
  else
  {
   System.out.println("Elements of the list: ");
   while(current!=null)
   {
    System.out.print(current.data+" ");
    current=current.next;
   }
   System.out.println();
  }
 }

 void Delete()
 {
  if(head==null)
  {
   System.out.println("List is Empty: ");
  }
  else if(head!=tail)
  {
   head=head.next;
  }
  else
  {
   head=tail=null;
  }
  System.out.println("After Deleting the Begining element: ");
  Node current=head;
  while(current!=null)
  {
   System.out.print(current.data+" ");
   current=current.next;
  }
  System.out.println();
 }
 
 public static void main(String ar[])
 {
  DeleteBeginingElementOfLinkedList r=new DeleteBeginingElementOfLinkedList();
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter");
  int n=scan.nextInt();
  System.out.println("Enter the elements:");
  for(int i=0;i<n;i++)
  {
   int data=scan.nextInt();
   r.AddNode(data);
  }
  System.out.println("Original List: ");
  r.Display();
  System.out.println("Updated List:");
  r.Delete();
 }
}