package pattern.matching;

public class Code1 {
	void pattern(int hour,int min)
	{
		int x = 30;
		int hangle = hour*x + (min/2);
		int mangle = (min*x)/5;
		int difference;
		difference = Math.abs(360-Math.abs(mangle-hangle));
		/*if(hangle>mangle)
		{difference  = hangle - mangle;}
		else
		{
		 difference = mangle - hangle;
		}*/
		System.out.println(difference +"");
	
	}
	public static void main(String...s)
	{
		Code1 c = new Code1();
		c.pattern(12,12);
	}

}
