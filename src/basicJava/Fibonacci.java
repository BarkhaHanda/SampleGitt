package basicJava;

public class Fibonacci {
	public static void fib()
	{
		int a,b,c;
		a=0;
		b=1;
		System.out.println("Fibonacci series is:");
		System.out.print(a+"\t");
		//System.out.print(b+"\t");
		for (int i=0;i<10;i++)
		{
			c=a+b;
			//b=a;
			//a=c;

			a=b;
		
			System.out.print(c+"\t");
			b=c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fib();
		
	}

}
