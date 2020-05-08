import java.util.Scanner;
class ReverseLinkedList
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
   Node n=head;
   if(head==null)
   {
    System.out.println("List is Empty");
   }
   else
   {
    System.out.println("Elements of the List are: ");
    while(n!=null)
    {
     System.out.print(n.data+"--> ");
     n=n.next;
    }
    System.out.println();
   }
  }
  
  void Reverse(Node current)
  {
   if(head==null)
   {
    System.out.println("List is Empty");
   }
   else
   {
    if(current.next==null)
    {
     System.out.print(current.data+"--> ");
    
     return;
     
    }
    //recursively calls the reverse function
    
    Reverse(current.next);
    System.out.print(current.data+"--> ");
   }
  }
  

  public static void main(String ar[])
  {
   ReverseLinkedList r=new ReverseLinkedList();
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter no of elements you want to enter: ");
   int n=scan.nextInt();
   System.out.println("Enter the elemnts: ");
   for(int i=0;i<n;i++)
   {
    int data=scan.nextInt();
    r.AddNode(data);
   }
   System.out.println("Original List: ");
   r.Display();
   System.out.println("Reversed list: ");
   r.Reverse(r.head);
  }
}