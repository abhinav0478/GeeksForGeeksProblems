package pattern.matching;
import java.util.*;
public class Stringrange {
public static void main(String...s)
{
	String s1 = "1-5,8,11-14,18,20,26-29";
	Stringrange sr = new Stringrange();
	String s2[] = s1.split(",");
	ArrayList<String> l  = new ArrayList<String>();
	sr.pattern(s2,l,sr);
	sr.addstring(l);
	System.out.println(l);
}
void pattern(String s2[],ArrayList<String> l,Stringrange sr)
{
	int i1 = 0;
	int i2 = 0;
	for(int i =0;i<s2.length;i++)
	{
		if(s2[i].contains("-"))
				{
			String s3[] = s2[i].split("-");
			i1 = Integer.parseInt(s3[0]);
			i2 = Integer.parseInt(s3[s3.length-1]);
			sr.add(i1,i2,l);
				}
		else
		{
			l.add(s2[i]+",");
		}
	}
}
void add(int first,int last,ArrayList<String> l)
{
	for(int i=first;i<=last;i++)
	{
		l.add(i+"");
		l.add(",");
	}
}
void addstring(ArrayList<String> l)
{
	String s4 = "";
	l.remove(l.size()-1);
	for(int i = 0;i<l.size();i++)
	{
		s4+= l.get(i);
	}
	System.out.println(s4);
}
}
