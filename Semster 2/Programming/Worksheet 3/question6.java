public class question6
{
	public static void main(String[] args)
	{
		//declaring 2D array
		double [] [] numbers = {	//assigning values to array
									{1.2, 1.5, 1.6},
									{1.7, 3.0, 3.5},
									{5.7, 9.2, 1.0}
								};

		//nested for loop
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers.length; j++)
			{
				System.out.println(numbers [i] [j] + 1.0); //outputting values
			} //end of second loop

		} //end of first loop

	} //end of main

} //end of class