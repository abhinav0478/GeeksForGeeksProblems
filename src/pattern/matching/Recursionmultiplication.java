package pattern.matching;
import java.util.*;
public class Recursionmultiplication 
{
	int sum;
public static void main(String...s)
{
	Recursionmultiplication r = new Recursionmultiplication();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");
	int x = sc.nextInt();
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter the Second number:");
	int y = sc1.nextInt();
	int value = r.pattern(x,y);
	System.out.println(value);
}
public int pattern(int x,int y)
{
	if(y>x)
	{
		int temp = y;
		y = x;
		x = temp;
		return pattern(x,y);
	}
	if(y==0)
	{
		return sum;
	}
	sum+=x;
	return pattern(x,y-1);
}
}
