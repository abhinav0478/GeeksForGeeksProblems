package pattern.matching;
import java.util.*;
public class Wordsfromcharacters {

	public static void main(String...s) {
		String dictionary[] = {"go","bat","me","eat","goal","boy","run"};
        char alpha[] = {'e','o','b', 'a','m','g', 'l'};
        String str = String.valueOf(alpha);
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        Wordsfromcharacters wc = new Wordsfromcharacters();
        wc.add(str,h);
        wc.pattern(h,dictionary);
	}
void add(String str,HashMap<Character,Integer> h)
{
	for(int i=0;i<str.length();i++)
	{
	h.put(str.charAt(i),1);
	
	}
	System.out.println(h.keySet());
}
void pattern(HashMap<Character,Integer> h,String dictionary[])
{
	String value = "";
	int flag =0;
	for(int i=0;i<dictionary.length;i++)
	{
		for(int j=0;j<dictionary[i].length();j++)
		{
			flag = 0;
		if(h.containsKey(dictionary[i].charAt(j)))
		{
			flag = 1;
		}
		else
		{
			break;
		}
		
		}
	if(flag==1)
	{
		value+= dictionary[i]+",";
	}
	
	}
	System.out.print(value);
}
}
