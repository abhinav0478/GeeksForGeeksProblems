package pattern.matching;
import java.util.*;
public class Removepunctuation {
public static void main(String...s)
{
	Removepunctuation p = new Removepunctuation();
	HashMap h = new HashMap();
	p.pattern(h);
}
void pattern(HashMap j)
{
	String s1 = "abcdef!@gh%^&ijkl%&$#^&$^*$mno#%pqrstuvwxyz";
	for(int i = 0;i<s1.length();i++)
	{
		if(j.containsKey(s1.charAt(i)))
		{
			
		}
		else if('a'<= s1.charAt(i) && s1.charAt(i)<='z' || s1.charAt(i)>=0 && s1.charAt(i)<=9 )
			{
				j.put(s1.charAt(i), 1);
			}
		else
		{
			
		}
	}
	System.out.println(j.keySet());
}
}
