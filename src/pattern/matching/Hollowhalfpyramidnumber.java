package pattern.matching;

public class Hollowhalfpyramidnumber 
{
	void pattern(int n)
	{
	  for(int i = 1;i<=n;i++)
	  {
		  String str = "";
		  if(i==1 || i==n)
		  {
			  for(int j =1;j<=i;j++)
			  {
				  str+= j+"";
			  }
		  }
		  else
		  {
			  for(int k =1;k<=i;k++)
			  {
				  if(k==1 || k==i)
				  {
					  str+=k+"";
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
		Hollowhalfpyramidnumber h = new Hollowhalfpyramidnumber();
		h.pattern(5);
	}
}
