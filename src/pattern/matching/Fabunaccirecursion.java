package pattern.matching;
import java.util.*;
public class Fabunaccirecursion {
	int c3;
public static void main(String...s)
{
	Fabunaccirecursion f = new Fabunaccirecursion();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n = sc.nextInt();
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
	    return c2;	
	}
	c3 = c1+c2;
	c1 = c2;
	c2 = c3;
	return pattern(count-1,c1,c2);
}
}
