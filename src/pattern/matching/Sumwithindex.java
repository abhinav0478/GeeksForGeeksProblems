package pattern.matching;

public class Sumwithindex {
public static void main(String...s)
{
	int arr[] = {2,10,1,20};
	int arr1[] = new int[2*arr.length];
	Sumwithindex t = new Sumwithindex();
	t.copy(arr,arr1);
	t.pattern(arr,arr1);
}
void copy(int arr[],int arr1[])
{int j=0;
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i] = arr[j];
		j++;
		if(j>3)
		{
			j = 0;
		}
	}
}
void pattern(int arr[],int arr1[])
{int sum = 0;
int max = 0;
	for(int i= 0;i<arr.length;i++)
	{sum = 0;
		for(int k =0;k<arr.length;k++)
		{
			sum+= arr1[i+k]*k;
		}
		if(sum>max)
		{
			max = sum;
		}
		System.out.println("the sum is"+sum);
	}
	System.out.println(max);
}
}
