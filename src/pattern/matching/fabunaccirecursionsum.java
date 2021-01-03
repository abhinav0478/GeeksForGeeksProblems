package pattern.matching;
import java.util.*;
public class fabunaccirecursionsum 
{
	int c3;
	int sum = 1;
public static void main(String...s)
{
	fabunaccirecursionsum f = new fabunaccirecursionsum();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n  = sc.nextInt();
	int x = f.pattern(n,0,1);
	System.out.println(x);
}
public int pattern(int count,int c1,int c2)
{
	if(count==1)
	{
		return c1;
	}
	if(count==2)
	{
		return sum;
	}
	c3 = c1 + c2;
	sum+=c3;
	c1 = c2;
	c2 = c3;
	return pattern(count-1, c1, c2);
}
}
