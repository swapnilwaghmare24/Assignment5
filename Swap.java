import java.util.Scanner;
public class Swap
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter first number");
	   double number1=sc.nextDouble();
	   System.out.println("Enter second number");
	   double number2=sc.nextDouble();
	   System.out.println("Number before Swap : number1 = "+number1+"  number2 = "+number2);
	   double temp=number1;
	   number1=number2;
	   number2=temp;
	   
	  System.out.println("Number after Swap : number1 = "+number1+"  number2 = "+number2);
	   }
}