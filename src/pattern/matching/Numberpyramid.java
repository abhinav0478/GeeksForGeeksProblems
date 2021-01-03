
	package pattern.matching;

	public class Numberpyramid {
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
			for(int t =1;t<=columm;t++)
			{
				if( (mid-i)<=t && t<=(mid+i) )
				{
					for(int j=mid-i;j<mid;j++)
					{
						str+= value;
						value++;
					}
					for(int j=mid;j<=mid+i;j++)
					{
						str+=value;
						value--;
					
				}
					break;
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
		Numberpyramid p = new Numberpyramid();
		p.pattern(5);
	}
	}
