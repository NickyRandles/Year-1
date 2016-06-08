public class question10
{
	public static void main(String[] args)
	{
		int[] input = new int[10];
		int total = 0;

		for(int i  = 0; i < input.length; i++)
		{
			System.out.print("Enter a number: ");
			input[i] = Keyboard.readInt();

			total = total + input[i];
		} //end of loop

		System.out.println();
		System.out.println("Here is a list of all the numbers you entered: ");
		System.out.println("________________________________________________________________________________");

		for(int j = 0; j < input.length; j++)
		{
			System.out.println(input[j]);

		} //end of loop


		System.out.println("________________________________________________________________________________");
		System.out.println();
		System.out.println("The total of all the numbers you entered is: " + total);

	} //end of main

} //end of class