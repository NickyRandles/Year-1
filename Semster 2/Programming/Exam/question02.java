class question02
{
	public static void main(String[] args)
	{
		int [] [] score = new int[5] [2]; //declaring array

		System.out.println("Itb \t Other \t \t Goals scored this game");

		scoreGenerator(score); //calling method

		totalColumns(score); //calling method

		totalRows(score); //calling method
	} //end of main

	//This method is used to assign values to the array
	static void scoreGenerator(int [] [] scoreIn)
	{
		for(int i = 0; i < scoreIn.length; i++)
		{
			System.out.print("Game " + (i+1) + "\t:\t");
			for(int j = 0; j < scoreIn[0].length; j++)
			{
				scoreIn [i] [j] = ((int)(Math.random()*4)+1); // assigning values to array


				System.out.print(scoreIn [i] [j] + "\n");
				System.out.print("\n");
			} //end of loop

		} //end of loop


	} //end of scoreGenerator method

	//This method is used to find the total of the columns
	static void totalColumns(int [] [] scoreIn)
	{
		int total = 0; //declaring variable

		for(int i = 0; i < scoreIn[0].length; i++)
		{
			for(int j = 0; j < scoreIn.length; j++)
			{
				total =  total + scoreIn [i] [j]; //adding to total
				System.out.println(total); //outputting total

			} //end of loop

		} //end of loop

	} //end of totalColumn method

	//This method is used to find the total of the rows
	static void totalRows(int [] [] scoreIn)
	{
		int total = 0;

		for(int i = 0; i < scoreIn.length; i++)
		{
			for(int j = 0; j < scoreIn[0].length; j++)
			{
				total = total + scoreIn [i] [j]; //adding to total
				System.out.println(total); //outputting total

			} //end of loop

		} //end of loop

	} //end of totalRow method



} //end of class