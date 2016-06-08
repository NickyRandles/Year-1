class question2
{
	public static void main(String[] args)
	{
		int num; //declaring variable
		System.out.print("How many numbers would you like to enter: "); //user instruction
		num = Keyboard.readInt(); //user input
		int[] input = new int[num]; //declaring int array

		for(int i = 0; i < input.length; i++)
		{
			System.out.print("Enter number: "); //user instruction
			input[i] = Keyboard.readInt(); //user input
		} //end of loop

		outputting(input); //calling method

	} //end of main

	static void outputting(int output[])
	{

		System.out.println("The numbers you entered are: ");
		for(int i = 0; i < output.length; i++)
		{
			System.out.println(output[i]); //outputting numbers

		} //end of loop

	} //end of output method

} //end of class