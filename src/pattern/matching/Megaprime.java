package pattern.matching;
import java.util.*;
public class Megaprime {
public static void main(String...s)
{
	Megaprime m = new Megaprime();
	ArrayList l = new ArrayList();
	m.prime(l);
	System.out.println(l);
	m.mprime(l,m);
	System.out.println(l);
}
void prime(ArrayList j)
{
	j.add(2);
	int flag = 0;
	for(int i = 3;i<100;i++)
	{
		for(int k = 2;k<i;k++)
		{
			if(i%k == 0)
			{
				flag = 0;
				break;
			}
			else
			{
				flag = 1;
			}
		}
		if(flag == 1)
		{
			j.add(i);
		}
		
	}
}
boolean isprime(int n)
{int flag = 0;
if(n==1)
{System.out.println("not a prime");
	return false;
}
if(n==2)
{
	return true;
}
	for(int k = 2;k<n;k++)
	{
		if(n%k == 0)
		{
			flag = 0;
			break;
			
		}
		else
		{
			flag = 1;
		}
	}
	if(flag == 1)
	{
		return true;
	}
	return false;
}
void mprime(ArrayList x,Megaprime g)
{int i = 0 ;
	while(i<x.size())
	{int value;
	value = (int) x.get(i);
	System.out.println(value);
	if(value<10)
	{
		System.out.println("10 se neeche" + value);
		i++;
	}
	else if(value<100)
		{	System.out.println("10 se upar " + value);
			if(g.megprime(value,g))
			{System.out.println("it is a megaprime" + value);
			i++;	
			}
			else
			{System.out.println("we will remove it");
				x.remove(i);
			}
			
		}
	}
	
}
boolean megprime(int y,Megaprime f)
{int element = y;
	int modulos;
	while(element>0)
	{modulos = element%10;
	System.out.println("modulos inside :" + modulos);
	if(!f.isprime(modulos))
	{
		return false;
	}
	element = element/10;
	
}
	return true;
}
}