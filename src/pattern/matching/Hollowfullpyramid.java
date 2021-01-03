package pattern.matching;

public class Hollowfullpyramid {
	void pattern(int n)
	{
		String str2 = "*";
		int mid = (2*n)/2;
		for(int i = 0;i<n;i++)
		{
			String str = "";
			if(i==(n-1))
			{
				for(int j = 1;j<=(2*n);j++)
				{
					if(j%2==0)
					{
					str+=" ";
				}
					else
					{
						str+=str2;
					}
			}}
			else
			{
				for(int k = 1;k<=(2*n);k++)
				{
					if(k==(mid+i)||k==(mid-i))
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
	public static void main(String ...s)
	{
		Hollowfullpyramid h = new Hollowfullpyramid();
		h.pattern(6);
	}
	}


