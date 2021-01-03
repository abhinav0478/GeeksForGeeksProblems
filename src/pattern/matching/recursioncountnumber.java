package pattern.matching;
import java.util.*;
public class recursioncountnumber
{
	int sum = 1;
public static void main(String...s)
{
	recursioncountnumber r = new recursioncountnumber();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n = sc.nextInt();
	int x = r.pattern(n,1);
	System.out.println(x);
}
public int pattern(int count,int c1)
{
	if(count==1)
	{
		return sum;
	}
	c1++;
	sum+=c1;
	return pattern(count-1,c1);
}
}
