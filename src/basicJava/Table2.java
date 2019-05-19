package basicJava;

public class Table2 {

	public static void tab()
	{
		int i,j;
		for (j=1;j<=10;j++)
		{
			System.out.println("Table for "+j);
		for (i=1;i<=10;i++)
		{
			System.out.println(j+"*"+i+"="+j*i);
		}
		System.out.println();
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Table from 1 to 10");
		tab();
	}

}
