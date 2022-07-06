import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter number whose prime factor required");
	   int number=sc.nextInt();
	   if (isPrime(number))
	   {
	   System.out.println(number);
	   }
	   else
	   {
	   for(int i=1;i<=number/2;i++)
	   {
	       if(number%i==0 && isPrime(i))
	       System.out.print(i+" ");
	   }
	   }
	   
	} 
	
	public static boolean isPrime(int num)
	{
	    if(num==1)
	    {
	        return false;
	    }
	    for(int j=2;j<=num/2;j++)
	    {
	        if(num%j==0)
	        {
	        return false;
	        }
	       
	    } 
	     return true;
	  
	}
}
