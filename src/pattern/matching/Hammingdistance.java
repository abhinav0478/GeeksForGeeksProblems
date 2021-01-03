package pattern.matching;

public class Hammingdistance {
public static void main(String...s)
{
	int arr[] = {1,2,3,1};
	int arr1[] = new int[2*arr.length];
	Hammingdistance h = new Hammingdistance();
	h.copy(arr,arr1);
	h.pattern(arr,arr1);
}
void copy(int arr[],int arr1[])
{int j= 0;
	for(int i =0;i<arr1.length;i++)
	{
		arr1[i] = arr[j];
		j++;
		if(j>3)
		{
			j= 0;
		}
		
	}
}
void test(int arr1[])
{
	for(int i=0;i<arr1.length;i++)
	{
	System.out.println(arr1[i]);	
	}
}
void pattern(int arr[],int arr1[])
{
int hd = 0;
int distance = 0;
for(int i =1;i<arr.length;i++)
{
	distance = 0;
	/*if(hd == arr.length)
	{
		break;
	}*/
	for(int j = 0;j<arr.length;j++)
	{
		if(arr1[i+j] == arr[j])
		{
			
			distance = 0;
		}
		else
		{
			distance++;
			if(hd<distance)
			{
				hd = distance;
				
			}
		}
	}
	
}
System.out.println(hd);
}
}
