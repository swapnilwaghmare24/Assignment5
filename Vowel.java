import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    char ch;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter character to check for Vowel or not");
		ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
		System.out.println(ch+" is Vowel");
		else
		System.out.println(ch+" is Consonant");
	}
}
