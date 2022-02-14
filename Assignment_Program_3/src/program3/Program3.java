package program3;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number:");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
				
		if (n%2==0)
		{
			System.out.println("Given number is Even");
		}
		else
		{
			System.out.println("Given number is Odd");
		}
	}

}
