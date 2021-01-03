package pattern.matching;
import java.util.*;
public class HCFcalculator 
{
public static void main(String...s)
{
	HCFcalculator h = new HCFcalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the second number:");
		int b = sc1.nextInt();
		h.pattern(a,b);
}
void pattern(int x ,int y)
{
	System.out.println("HCF of these numbers are:" + getvalue(x,y));
}
public int getvalue(int x, int y)
{
	if(x==0)
	{
		return y;
	}
	return getvalue(y%x,x);
}
}
