class question3
{
	public static void main(String[] args)
	{
		powers(); //calling method

	} //end of main

	static void powers()
	{
		long[] input = new long[63]; //declaring array

		for(int i = 0; i < input.length; i++)
		{

			input[i] = i + 1; //assigning values to array

			System.out.println("2^" + input[i]); //outputting values

		} //end of loop


	} //end of powers method

} //end of class