public class question5
{
	public static void main(String[] args)
	{
		//declaring variables
		int [] [] numbers = new int [10] [10]; //declaring 2D array
		int maximum = 10;
		int minimum = 2;

		//nested for loop
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[0].length; j++)
			{
				numbers [i] [j] = minimum + (int)(Math.random()*maximum); //assigning values to array
				System.out.println(numbers [i] [j]); //outputting values
			} //end of second loop

		} //end of first loop

	} //end of main

} //end of class