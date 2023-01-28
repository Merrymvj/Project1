package week;
/*name :Merry Viji
Program name: Ice1
Due Date:27-01-23
Description:This program will ask the user for an integer value then divides it with 2 and displays the output
*/
import java.util.*;
public class ice1 {
	private static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num;
		double result;
System.out.println("Welcome to my program   Merry Viji 100859208");
System.out.println(" 'Whoever is happy will make others happy too'- Ann Frank");
System.out.println("Enter an integer value");
num=input.nextInt();
result=(double)num/2;
System.out.println("The remainder of the " +num+ " when divided by 2 is "+ result);

	}

}
