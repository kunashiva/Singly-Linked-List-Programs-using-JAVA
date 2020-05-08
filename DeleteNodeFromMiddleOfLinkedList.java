import java.util.Scanner;
class DeleteNodeFromMiddleOfLinkedList
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
 int count=0;

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
   tail=tail.next;
  }
  count++;
 }

 
 void Delete()
 { 
  if(head==null)
  {
   System.out.println("List is empty");
  }
  if(count==1)
  {
   head=tail=null;
  }
  else
  {
   int size=(count%2==0)?(count/2):((count+1)/2);
   Node n=head;
   Node n1=null;
   for(int i=0;i<size-2;i++)
   {
    n=n.next;
   }
   n1=n.next;
   n.next=n1.next;
   n1=null;
  }
  count--;
 }
 
 void Display()
 {
  Node n=head;
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   System.out.println("Elements of the List are:");
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
  DeleteNodeFromMiddleOfLinkedList d=new DeleteNodeFromMiddleOfLinkedList();
  Scanner c=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter in the list");
  int n=c.nextInt();
  System.out.println("Enter the elements in the list");
  for(int i=0;i<n;i++)
  {
   int data=c.nextInt();
   d.AddNode(data);
  }
  System.out.println("Original List:");
  d.Display();
  while(d.head!=null)
  {
   System.out.println("Updated List:");
   d.Delete();
   d.Display();
  }
 }
}