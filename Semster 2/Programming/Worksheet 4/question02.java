class question02
{
	public static void main(String[] args)
	{
		//instructions
		System.out.print("Enter how many exam results you want and the results of those exams below please");
		System.out.println("________________________________________________________________________________");

		getExamMarks();
	} //end of main

	static void getExamMarks()
	{
		int amount; //declaring variable
		System.out.print("How many exam results would you like to enter: ");
		amount = Keyboard.readInt(); //user instruction

		int[] examResult = new int[amount]; //declaring array

		for(int i = 0; i < examResult.length; i++)
		{
			System.out.print("Enter result: ");
			examResult[i] = Keyboard.readInt(); //user inputting array values
		} //end of loop

		for(int j = 0; j < examResult.length; j++)
		{
			System.out.println("Result number " + (j + 1) + " is: " + examResult[j]); //outputtng values
		} //end of loop

	} //end of getExamMarks

} //end of class