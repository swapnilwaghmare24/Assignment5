import javatil.Scanner;
public class TwoDArray
{
	int[][] twoDArray;
	int row,column;

	public TwoDArray(int row,int column)
	{
		this.row=row;
		this.column=column;
		twoDArray=new int[row][column];
	}

	public void initialise()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements ");
		for(int r=0;r<row;r++)
		{
			for(int c=0;c<column;c++)
			{
				twoDArray[r][c]=sc.nextInt();
			}
		}
	}
	public void display()
	{
		System.out.println("array elements are ");
		for(int r=0;r<row;r++)
		{
			for(int c=0;c<column;c++)
			{
				System.out.println(twoDArray[r][c]);
			}
		}
	}

	public static void main(String[] args)
	{
		TwoDArray td = new TwoDArray(3,3);
		td.initialise();
		td.display();
	}
}

