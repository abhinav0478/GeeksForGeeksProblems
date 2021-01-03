package pattern.matching;
import java.util.*;

import org.w3c.dom.Node;
public class Code111 {
	int sum = 1;
public static void main(String...s)
{
Code111 c = new Code111();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value:");
int number = sc.nextInt();
int value = c.factorial(number);
System.out.println("the factorial is:" + value);
}
public int factorial(int number)
{
	if(number==0)
	{
		return 1;
	}
	if(number==1)
	{
		return sum;
	}
	sum = sum*number;
	return factorial(number-1);
}
}

