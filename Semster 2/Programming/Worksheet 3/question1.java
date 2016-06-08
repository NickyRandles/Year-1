class question1
{
	public static void main(String[] args)
	{
		input(); //calling method

	} //end of main

	static void input()
	{
		int num; //declaring varible
		System.out.print("How many numbers would you like to enter: "); //user instruction
		num = Keyboard.readInt(); //input declaring size of array
		int[] numbers = new int[num]; //declaring int array

		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print("Enter number: "); //user instruction
			numbers[i] = Keyboard.readInt(); //assigning values to array

		} //end of loop

	} //end of input method

} //end of class

