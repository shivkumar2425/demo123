import java.util.*;
class Addtwonumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		
		int num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		
		int num2=sc.nextInt();
		sc.close();
		
		int sum=num1+num2;
		System.out.println("sum of number:"+sum);
	}
}
		