package pattern.matching;
import java.util.*;
public class Maxminadjacent {
public static void main(String...s)
{
	int arr[] = {2,7,5,3,1,4,6};
	Arrays.sort(arr);
	int arr1[] = new int[arr.length];
	Maxminadjacent m = new Maxminadjacent();
	m.pattern(arr,arr1);
}
void pattern(int arr[],int arr1[])
{int start = 0;
int end = arr.length - 1;
int i = 0;
	while(start<=end && i<arr.length)
	{
		if(i%2!=0)
		{
			arr1[i] = arr[start];
			i++;
			start++;
		}
		else
		{
			arr1[i] = arr[end];
			end--;
			i++;
		}
	}
	System.out.println("My array is" + Arrays.toString(arr1));
}
}
