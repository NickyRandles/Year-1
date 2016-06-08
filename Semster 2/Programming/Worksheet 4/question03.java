class question03
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

		calculations(examResult, amount); //calling method

	} //end of getExamMarks

	static void calculations(int[] examMark, int num)
	{
		int total = 0;
		int average;
		int largest = 0;

		for(int i = 0; i < examMark.length; i++)
		{
			//finding average
			if (examMark[i] > largest)
			{
				largest = examMark[i];
			}
			//adding up total
			total = total + examMark[i];

		} //end of loop

		//calculating average
		average = total / num;

		//outputting largest and average
		System.out.println("The result highest result is: " + largest);
		System.out.println("The average of your exam results is: " + average);

	} //end of calculations method

} //end of class