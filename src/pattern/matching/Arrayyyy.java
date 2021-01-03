package pattern.matching;

public class Arrayyyy {
public static void main(String...s)
{
	Arrayyyy a = new Arrayyyy();
	String st = "2994";
	a.pattern(st);
}
void pattern(String st)
{
int i = Integer.parseInt(st);
int modulos = i%10;
if(modulos<6)
{
 i = i-modulos;
 st = Integer.toString(i);
}
else
{
i = i+10-modulos;
st = Integer.toString(i);
}
System.out.println(st);
}
}
