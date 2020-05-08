import java.util.Scanner;
class DeleteLastElementOfLinkedList
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
   tail=newNode;
  }
  count++;
 }
 
 void delete()
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
   Node n=head;
   Node n1=null;
   while(n.next!=null)
   {
    n1=n;
    n=n.next;
   }
   n1.next=null;
  }
  count--;
 }
 
 void display()
 {
  Node n=head;
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   System.out.println("Elements of the List");
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
  DeleteLastElementOfLinkedList r=new DeleteLastElementOfLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the no of elements in List:");
  int n=s.nextInt();
  System.out.println("Enter the elements of the list");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   r.AddNode(data);
  }
  System.out.println("original List: ");
  r.display();
  while(r.head!=null)
  {
   System.out.println("Updated List:");
   r.delete();
   r.display();
  }
 }
}