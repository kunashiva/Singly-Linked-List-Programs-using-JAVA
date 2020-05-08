import java.util.Scanner;
class InsertNodeAtBeginningInLinkedList
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
  count++;
 }
 
 void InsertAtBeginning(int temp)
 {
  Node temp1=new Node(temp);
  if(head==null)
  {
   head=temp1;
   tail=temp1;
  }
  else
  {
   temp1.next=head;
   head=temp1;
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
   System.out.println("Elements of the List");
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
  InsertNodeAtBeginningInLinkedList l=new InsertNodeAtBeginningInLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements");
  int n=s.nextInt();
  System.out.println("Enter elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.addNode(data);
  }
  System.out.println("Original List");
  l.Display();
  System.out.println("Enter the new element that you want to enter at beginning");
  int e=s.nextInt();
  l.InsertAtBeginning(e);
  System.out.println("Updated List");
  l.Display();
  
 }
}