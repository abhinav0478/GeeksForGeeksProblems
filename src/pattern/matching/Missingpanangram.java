package pattern.matching;
import java.util.*;
public class Missingpanangram {
public static void main(String...s)
{
	Missingpanangram m = new Missingpanangram();
	HashMap h = new HashMap();
	m.pattern(h);
}
void pattern(HashMap j)
{
	 String s1= "abcdefghijklmnopqrstuvwxyz";
	 String s2 = "how are you";
	 String s3 = "";
	
	 for(int i = 0;i<s2.length();i++)
	 {
		 j.put(s2.charAt(i),1);
	 }
	 for(int k=0;k<s1.length();k++)
	 {
		 if(j.containsKey(s1.charAt(k)))
		 {
			 
		 }
		 else
		 {
			 s3+= s1.charAt(k);
		 }
	 }
	 System.out.println(s3 + "");
	 System.out.println(s2 + "");
}
}
