package pattern.matching;
import java.io.*;
public class fabunacci11 {
	public static void main(String...s)throws Exception
	{
	fabunacci11 f = new fabunacci11();
	InputStreamReader ip = new InputStreamReader(System.in);
	BufferedReader r = new BufferedReader(ip);
	System.out.println("Enter The number:");
	int count = Integer.parseInt(r.readLine());
	f.pattern(0,1,count);
}
	void pattern(int number1,int number2,int count)
	{
		if(count == 1)
		{
			System.out.println("Number is : " + 0);
		    return;
		}
		if(count == 2)
		{
			System.out.println("Number is : " + 1);	
			return;
		}
		int number3 = 0;
		for(int i =0;i<count-2;i++)
		{
		number3 = number1 + number2;
		number1 = number2;
		number2 = number3;
		}
		System.out.println("the number is :" + number3);
	}
	}
