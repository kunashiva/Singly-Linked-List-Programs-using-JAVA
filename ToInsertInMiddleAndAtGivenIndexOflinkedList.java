import java.util.Scanner;
class ToInsertInMiddleAndAtGivenIndexOflinkedList
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
 
 void InsertAtMid(int data)
 {
  Node newNode=new Node(data);
  Node current=head;
  if(head==null)
  {
   head=newNode;
   tail=newNode;
  }
  else
  {
   int mid=(count%2==0)?(count/2):((count+1)/2);
   for(int i=1;i<mid;i++)
   {
    current=current.next;
   }
   newNode.next=current.next;
   current.next=newNode;
  }
 }
 
 void InsertAtGivenPostion(int index, int temp)
 {
  Node newNode=new Node(temp);
  Node current=head;
  for(int i=1;i<index-1;i++)
  {
   current=current.next;
  }
  newNode.next=current.next;
  current.next=newNode;
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
   System.out.println("Elements of List are:");
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
  ToInsertInMiddleAndAtGivenIndexOflinkedList l=new ToInsertInMiddleAndAtGivenIndexOflinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements");
  int n=s.nextInt();
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.addNode(data);
  }
  System.out.println("Original List");
  l.Display();
  System.out.println("Enter the element that you want to insert at the middle");
  int k=s.nextInt();
  l.InsertAtMid(k);
  System.out.println("Updated list");
  l.Display();
  System.out.println("enter the index and element that you want to insert in the list");
  int index=s.nextInt();
  int temp=s.nextInt();
  l.InsertAtGivenPostion(index,temp);
  System.out.println("updated list");
  l.Display();
 }
}