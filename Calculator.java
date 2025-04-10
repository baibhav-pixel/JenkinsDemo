public class Calculator
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int subtract(int a, int b)
	{
		return a-b;
	}

	public int mul(int a, int b)
	{
		return a*b;
	}

	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		System.out.println(c.add(5,6));
		System.out.println(c.subtract(11,4));
	}
}