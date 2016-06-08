class question05
{
	public static void main(String[] args)
	{
		int [] [] numbers = new int [6] [4]; //declaring array
		int total = 0; //declaring variable
		int row_total = 0;
		int column_total = 0;

		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[0].length; j++)
			{
					numbers [i] [j] = (int)(Math.random( )*10000) % 10 + 1; //assigning values to array
			} //endof second loop

		} //end of first loop

		for(int x = 0; x < numbers.length; x++)
		{
			total = total + numbers [x] [x]; //finding full total
			row_total = total + numbers [x] [0]; //finding row total
			column_total = total + numbers [0] [x]; //finding column total
		} //end of loop

		//outputting totals
		System.out.println("The total of all the elements is: " + total);
		System.out.println("The total of the rows is: " + row_total);
		System.out.println("The total of the columns is: " + column_total);

	} //end of main

} //end of class