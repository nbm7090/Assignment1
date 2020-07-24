import java.util.Scanner;

public class Assignment13 {

	// Problem 3 	Write a program to complete the task given below:
		//Ask the user to enter any 2 numbers in between 1-10 and add both of them to another variable call z.
		//Use z for adding 30 into it and print the final result by using variable results.


	public static void main(String[] args)

	{

		Scanner userinput = new Scanner(System.in);

		System.out.println("Enter value of a");
		int a = userinput.nextInt();

		System.out.println("Enter value of b");
		int b = userinput.nextInt();

		System.out.println("Value of Z");
		int z = a + b;

		System.out.println(30 + z);

		userinput.close();

	}
}
