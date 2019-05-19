package basicJava;

public class Arithmeticops {

	//for + operator
	public static	int sum (int a,int b) 
	{
		int s;
		s=a+b;
		return s;
	}

	//for - operator
	public static	int dif (int a,int b) 
	{
		int s;
		s=a-b;
		return s;
	}

	//for * operator
	public static	int mul (int a,int b) 
	{
		int s;
		s=a*b;
		return s;
	}

	//for / operator
	public static	float div (float a,float b) 
	{
		float s;
		s=a/b;
		return s;
	}

	//for % operator
	public static int mod (float a,float b) 
	{
		int s;
		s=(int) (a%b);
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
float r;
Arithmeticops a= new Arithmeticops();
r=a.sum(8, 9);
System.out.println("Sum of the two is \t"+r);
r=a.dif(6,3);
System.out.println("diff of the two is \t"+r);
r=a.div(18, 9);
System.out.println("div of the two is \t"+r);
r=a.mul(8, 9);
System.out.println("mul of the two is \t"+r);
r=a.mod(128,3 );
System.out.println("Sum of the two is \t"+r);
//is there any way to change the return type everytime ?
//is it possible to return 
	
	
	}

}
