package pattern.matching;
import java.util.*;
public class Maxmin {
public static void main(String...s)
{
	Maxmin m = new Maxmin();
	int arr[] = {1,2,3,4,5,6,7,8};
	m.pattern(arr);
	System.out.println("array is:"+ Arrays.toString(arr));
}
void pattern(int arr[])
{
	int temp = 0;
	for(int i =0;i<arr.length-1;i++)
	{
		if(i%2 == 0)
		{
			if(arr[i]>arr[i+1])
			{
				
			}
			else
			{
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		else
		{
			if(arr[i]<arr[i+1])
			{
				
			}
			else
			{
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
	}
}
}
