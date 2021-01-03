package pattern.matching;

import java.util.Arrays;

public class Splitfunction {
public static void main(String...s)
{
	String str = "  how are  you";
	String st[] = str.split(" ");
	for(int i = 0;i<st.length;i++)
	{
		st[i].trim();
	}
	System.out.println(Arrays.toString(st));
}
}
