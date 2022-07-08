import java.util.Scanner;
public class Harmonic
{
    public static void main(String[] args) 
	{
		double sum=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number to get Harmonic value");
	    int number = sc.nextInt();
	    for(int i=1;i<=number;i++)
	    {
	        sum=sum+(double)1/i;
	    }
	    System.out.println("Harmonic value of "+number+" is : "+sum);
    }
}