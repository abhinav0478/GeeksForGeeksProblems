package pattern.matching;

public class Pyramidpattern1 {
	void pattern(int m)
	{
		String str2 = "*";
		for(int i = 1;i<=m; i++)
		{
			String str = "";
			for(int j=1;j<=i;j++)
			{
				str+= str2;
			}
			System.out.println(str);
			}
		}
		
public static void main(String...s)
{
	Pyramidpattern1 p = new Pyramidpattern1();
	p.pattern(6);
}
}

