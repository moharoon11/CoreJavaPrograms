import java.util.Scanner;

public class Arrays 
{
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		int[][] arr= new int[3][3];
		
	
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr[i].length-1; i++) 
			{
				System.out.println("ENter the mark of class " + i + " student " + j);
				arr[i][j]  = in.nextInt();
			}
		}
		
		System.out.println();
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; i++) 
			{
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}

}
