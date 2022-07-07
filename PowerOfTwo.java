import java.util.Scanner;
public class PowerOfTwo
{
    public static final int VALUE=2;
	static int temp=1;
	static int i=1;
	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter power of two you wish");
	    int power = sc.nextInt();
	    while(i<=power)
	    {
	    if(i>=0 && i<31)
	    {
	        temp=temp*VALUE;
	    }
	    else
	    {
	       System.out.println("Invalid power");
	       return;
	    }
	    i++;
	    }
	    System.out.println(temp);
    }
}
	