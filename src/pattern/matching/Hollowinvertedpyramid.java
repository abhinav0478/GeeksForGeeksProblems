package pattern.matching;

public class Hollowinvertedpyramid {
	void pattern(int n)
	{
		String str2 = "*";
		for(int i = n;i>=1;i--)
		{
			String str = "";
			if(i==n||i==1)
			{
				for(int j =1;j<=i;j++)
				{
					str+= str2;
				}
			}
			else
			{
				for(int k = 1;k<=i;k++)
						{
					if(k==1||k==i)
					{
						str+=str2;
					}
					else
					{
						str+=" ";
					}
						}
						}
			System.out.println(str);
			}
			}
	public static void main(String...s)
	{
		Hollowinvertedpyramid p = new Hollowinvertedpyramid();
		p.pattern(6);
	}
	}

