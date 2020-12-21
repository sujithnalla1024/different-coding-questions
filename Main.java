class Node{
    int data;
    Node next;
    Node(int l)
    {
        data=l;
        next=null;
    }
}
class Linkedlist{
    Node head;
    Linkedlist()
    {
        head=null;
    }
     void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            temp=temp.next;
            temp.next=newnode;
        }
    }
	 void insertnode(int x,int pos)
	{      Node newnode=new Node(x);
           Node temp=head; 	        
			for(int i=0;i<pos;i++)
				 temp=temp.next;
			newnode.next=temp.next;
			temp.next=newnode;
	}
     void print()
    {
		System.out.println("Elemnts in linked list are");
        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+" ");
		temp=temp.next;}
        System.out.println();
		if(head==null)
			System.out.println("Empty");
    }
	void printrecreverse(Node temp)
	{
		if(temp==null)
		{
			//System.out.print(temp.data+" ");
			System.out.println("Reverse Linked List is");
			return;
		}
		printrecreverse(temp.next);
		System.out.print(temp.data+" ");
		
	}
	int printnthnode(Node temp,int n)
	{
		Node temp1=temp,temp2=temp;
		for(int i=0;i<n-1;i++)
			temp1=temp1.next;
		while(temp1.next!=null)
		{
			temp1=temp1.next;
			temp2=temp2.next;
		}
		return temp2.data;
		
		
		
	}
}

public class Main{
    public static void main(String args[])
    {
        Linkedlist ob=new Linkedlist();
        ob.insert(20);
        ob.insert(30);
        ob.print();
        ob.insert(50);
        ob.insert(60);
        ob.print();
		ob.insertnode(5,2);
		ob.printrecreverse(ob.head);
		ob.print();
		System.out.println(ob.printnthnode(ob.head,2));
		
		//ob.print();
    }
	
}