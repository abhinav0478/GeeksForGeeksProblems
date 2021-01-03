
	package pattern.matching;

	public class Numberpyramid2 {
	void pattern(int n)
	{
	int columm = 9;
	int mid = 5;
	for(int i = 0;i<n;i++)
	{String str = "";
		int value  = i+1;
		if(i==4)
		{
			for(int k = 1;k<mid;k++)
			{
				str+= value +"";
				value++;
			}
			for(int k =mid;k<=columm;k++)
			{
				str+= value +"";
				value--;
			}
		}
		else
		{
			for(int t =1;t<mid;t++)
			{ 
				if(t>=mid-i)
				{
					str+= value;
					value++;
				}
				else
				{
					str+=" ";
				}
				
			}
			for(int t =mid;t<=columm;t++)
			{
				if(t<=mid+i)
				{
					str+=value;
					value--;
				}
				else
				{
					str+= " ";
				}
				
			}
		}
		System.out.println(str);
	}
	}
	public static void main(String ...s)
	{
		Numberpyramid2 p = new Numberpyramid2();
		p.pattern(5);
	}
	}

