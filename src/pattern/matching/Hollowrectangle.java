package pattern.matching;

public class Hollowrectangle {
	void starpattern(int n)
	{
		String str2 = "*";
	for(int i = 1;i<=n;i++)
	{
		String str = "" ;
	
	if(i==1||i==n)
	{
	for(int j=0;j<=6;j++)
	{
	str+= str2;
	}
	}
	else
	{
	for(int k=0;k<=6;k++)
	{
	if(k==0||k==6)
	{
	str+= str2;
	}
	else{
	str+= " ";
	}}}
	System.out.println(str);	
	}}
	public static void main(String...s)
	{
	Hollowrectangle p = new Hollowrectangle();
	p.starpattern(4);
	}}

