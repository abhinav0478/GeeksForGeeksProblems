package pattern.matching;

public class Initialofname {
public static void main(String...s)
{
	String str = " prabhat kumar singh  ";
	str = str.toUpperCase();
	Initialofname iname = new Initialofname();
	iname.pattern(str);
}
void pattern(String str)
{
String st[] = str.split(" ");	
for(int i=0;i<st.length;i++)
{
st[i].trim();
if(st[i].equals(""))
{
	
}
else
{
	System.out.println(st[i].charAt(0));
}
}
}
}
