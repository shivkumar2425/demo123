import java.util.Scanner;
class reverse
{
  public static void main(String args[])
  {
    int n,r;
	System.out.print("Enter any Number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	while(n>0);
	{
	  r=n%10;
	  System.out.println(r);
	  n=n/10;
	}
  }
}  