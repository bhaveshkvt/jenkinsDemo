import java.util.*;
class Calci {
	
	public int add(int a, int b)
	{
		return a+b;
	}


	public int sub(int a, int b)
	{
		return a-b;
	}


	public int mul(int a, int b)
	{
		return a*b;
	}


	public int div(int a, int b)
	{
		return a/b;
	}

public static void main(String args[])
{
Calci c1 = new Calci();
System.out.println("Addition is = "+(c1.add(20,30)));
System.out.println("Addition is = "+(c1.sub(50,30)));
//System.out.println("Addition is = "+(c1.mul(12,3)));
//System.out.println("Addition is = "+(c1.div(49,4)));
}
}