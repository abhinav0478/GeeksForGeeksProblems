package pattern.matching;

public class Stringcheck {
	public static void main(String...s)
	{
	String s1 = "45a8";
	Stringcheck t = new Stringcheck();
	t.pattern(s1);
	}
	void pattern(String s1)
	{
		for(int i = 0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				System.out.println("it is a Integer");
			}
			else
			{
				System.out.println("it is a String");
				return;
			
			}
		}
		
	}
}
