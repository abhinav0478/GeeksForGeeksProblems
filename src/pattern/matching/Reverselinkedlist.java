package pattern.matching;
import java.util.*;
public class Reverselinkedlist
{
	Node head;
public static void main(String...s)
{
	Reverselinkedlist list = new Reverselinkedlist();
	list.insertionlist(list);
	list.insertionlist(list);
	list.insertionlist(list);
	list.insertionlist(list);
	list.copy(list);
	list.reverse(list);
	list.copy(list);
}
void reverse(Reverselinkedlist list)
{
	Node previous = null;
	Node present = list.head;
	Node future ;
	while(present!=null)
	{
		future = present.next;
		present.next = previous;
		previous = present;
		present = future;
	}
	list.head = previous;
}
void copy(Reverselinkedlist list)
{
	Node na = list.head;
	while(na!=null)
	{
	System.out.println("the data and names are:" + na.data + na.name);	
	na = na.next;
	}
}
void insertionlist(Reverselinkedlist list)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the data:");
	int data = sc.nextInt();
	Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter the name:");
    String name  = sc1.nextLine();
    Node n = new Node(data,name);
    if(list.head == null)
    {
    list.head = n;
    n.next = null;
    }
    else
    {
    	Node pointer = list.head;
    	while(pointer.next!=null)
    	{
    		pointer = pointer.next;
    	}
    	pointer.next = n;
    	n.next = null;
    }
}
}
class Node
{
	int data;
	String name;
	Node next;
	Node(int data, String name)
	{
		this.data = data;
		this.name = name;
	}
}

