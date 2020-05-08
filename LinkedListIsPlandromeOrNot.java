import java.util.Scanner;
class LinkedListIsPlandromeOrNot
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
 
 Node Reverse(Node temp)
 {
  Node present=temp;
  Node next=null;
  Node previous=null;
  
  while(present!=null)
  {
   next=present.next;
   present.next=previous;
   previous=present;
   present=next;
  } 
  return previous;
 }

 void Palindrome()
 {
  Node current=head;
  boolean flag=true;
  
  int size=(count%2==0)?(count/2):((count+1)/2);
  for(int i=1;i<size;i++)
  {
   current=current.next;
  }
  
  Node revHead=Reverse(current.next);
 
  while(head!=null && revHead!=null)
  {
   if(head.data!=revHead.data)
   {
    flag=false;
    break;
   }
   head=head.next;
   revHead=revHead.next;
  }
  
  if(flag==true)
  {
   System.out.println("Given Linked List is Palindrome");
  }
  else
  {
   System.out.println("Given Linked list is not a Palindrome");
  }
 }
 
 void display()
 {
  Node current=head;
  if(head==null)
  {
   System.out.println("List is Empty");
  }
  else
  {
   System.out.println("Elements of the list");
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
  LinkedListIsPlandromeOrNot d=new LinkedListIsPlandromeOrNot();
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter No of elements in the List");
  int n=scan.nextInt();
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=scan.nextInt();
   d.AddNode(data);
  }
  System.out.println("Original List:");
  d.display();
  d.Palindrome();
 }
}