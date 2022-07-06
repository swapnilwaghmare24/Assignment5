import java.util.Scanner;
public class QuotientRemainder
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter first number to divide");
	   int number1=sc.nextInt();
	   System.out.println("Enter second number by which you want to divide first number");
	   int number2=sc.nextInt();
	   int quotient=number1/number2;
	   System.out.println("Quotient is "+quotient);
	   int remainder=number1%number2;
	   System.out.println("Remainder is "+remainder);
	   
	}
}
