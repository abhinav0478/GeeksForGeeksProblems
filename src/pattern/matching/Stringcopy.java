package pattern.matching;

public class Stringcopy {
	public static void main(String...s)
	{
		Stringcopy c = new Stringcopy();
		String t = "GEEKSFORGEEKS";
		char c1[] = t.toCharArray();
		char c2[] = new char[c1.length];
		c.pattern(c1,c2);
		System.out.println(String.valueOf(c2));
	}
	void pattern(char x[],char y[])
	{
		for(int i =0;i<x.length;i++)
		{
			y[i] = x[i];
		}
	}

}
