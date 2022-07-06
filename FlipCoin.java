import java.util.Scanner;
public class FlipCoin
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number of times coin to flip");
	    int numOfTimesFlip=sc.nextInt();
	    int i=1;
	    int head=0,tail=0;
	    while(i<=numOfTimesFlip)
	    {
	       double coinValue=Math.random();
	       if(coinValue<0.5)
	       tail++;
	       else
	       head++;
	       i++;
	    }
	    System.out.println("head count "+head);
	    System.out.println("tail count "+tail);
	    double headPercent=head*100/numOfTimesFlip;
	    System.out.println("Percentage of Head "+headPercent+"%");
	    double tailPercent=tail*100/numOfTimesFlip;
	    System.out.println("Percentage of Tail "+tailPercent+"%");
	}
}
