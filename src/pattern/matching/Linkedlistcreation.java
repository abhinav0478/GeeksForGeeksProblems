package pattern.matching;

public class Linkedlistcreation {
	Node head;
	Node end;
void listinsertion(Linkedlistcreation list)
{
	Node n = new Node(1,"lalu");
	if(list.head == null)
	{
		list.head = n;
		list.end = n;
	}
	else
	{
		end.next = n;
		n.next = null;
		end = n;
	}
}
public static void main(String...s)
{
	Linkedlistcreation list = new Linkedlistcreation();
	list.listinsertion(list);
	list.listinsertion(list);
	list.copy(list);
}
void copy(	Linkedlistcreation list)
{
	Node n1 = list.head;
	while(n1!=null)
	{
		System.out.println("the data and names are:"+ n1.data + n1.name);
		n1 = n1.next;
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