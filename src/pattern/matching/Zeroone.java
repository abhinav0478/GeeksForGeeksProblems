package pattern.matching;
import java.util.*;
public class Zeroone {
public static void main(String...s)
{
	int arr[] = {1,0,1,0,1,1,1,1,0,0,0,0,1};
	Zeroone z = new Zeroone();
	z.pattern(arr,z);
    System.out.println("the arr is:" + Arrays.toString(arr));
}
void pattern(int arr[],Zeroone z)
{int zero = 0;
int one = 0;
	for(int i =0;i<arr.length;i++)
	{
		if(arr[i] == 0)
		{
			zero++;
		}
		else
		{
			one++;
		}
	}
	z.count(zero,one,arr);
}
void count(int zerocount,int onecount,int arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		if(i<zerocount)
		{
			arr[i] = 0;
		}
		else
		{
			arr[i] = 1;
		}
	}
}
}
