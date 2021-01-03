package pattern.matching;

public class Ducknumber {
public static void main(String...s)
{
	String str = "045077699";
	Ducknumber d = new Ducknumber();
	d.pattern(str);
}
void pattern(String str)
{
	for(int i=0;i<str.length()-1;i++)
	{
		if(str.charAt(i)!='0')
		{
			if(str.charAt(i+1)=='0')
			{
				System.out.println("it is a duck number");
				return;
			}
		}
	}
	System.out.println("not a duck number");
}
}
