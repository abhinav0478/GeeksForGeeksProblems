package pattern.matching;
import java.util.*;
public class Panangram {

	public static void main(String...s)
	{
		Panangram p = new Panangram();
		HashMap h = new HashMap();
		p.pattern(h);
		
	}
	void pattern(HashMap j)
	{
		int count = 0;
		String s = "abcdef   ghijk   lmn  opq   rstuv    wxyz";
		s =  s.replaceAll(" ","");
				for(int i = 0;i<s.length();i++)
				{
					if(j.containsKey(s.charAt(i)))
							{
						
							}
					else
					{
					j.put(s.charAt(i),1);	
					}
				}
			Iterator itr = j.entrySet().iterator();
			while(itr.hasNext())
			{
				itr.next();
				count++;
			}
			if(count==26)
			{
				System.out.println("it is a parangram");
			}
			else
			{
				System.out.println("it is not a parangram");
			}
			System.out.println(count + "");		
	}}
	
	 