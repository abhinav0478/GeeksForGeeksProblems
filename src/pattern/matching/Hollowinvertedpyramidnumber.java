package pattern.matching;

public class Hollowinvertedpyramidnumber 
{
void pattern(int n)
{
	int inc = 0;
for(int i = n;i>0;i--)
{
	inc = (n+1)-i;
	String str ="";
	if(i==n || i==1)
	{
		for(int j = 1;j<=i;j++)
				{
			      str+=inc+"";
			      inc++;
				}
	}
	else
	{
		for(int k=1 ;k<=i;k++)
				{
			if(k==1)
			{
				str+=inc+"";
			}
			else if(k==i)
			{
				str+=n+"";
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
	Hollowinvertedpyramidnumber h = new Hollowinvertedpyramidnumber();
	h.pattern(5);
}
}
