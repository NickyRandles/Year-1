class question01
{
	public static void main(String[] args)
	{
		arrayGenerator(); //calling method

	} //end of main

	static void arrayGenerator()
	{

		int[] numbers = new int[10]; //declaring array

		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random( )*10000) % 10 + 1; //assigning numbers to array
		} //end of loop

		arrayDisplay(numbers);

	} //end of arrayGenerator method

	static void arrayDisplay(int[] values)
	{
		int total = 0; //declaring variable

		System.out.println("Outputting every second number below: "); //message

		for(int i = 0; i < values.length; i = i + 2)
		{
			System.out.println(values[i]); //outputting every second number
			total = total + values[i]; //calculating total
		} //end of loop

		System.out.println("The total of these numbers combined is: " + total); //outputting total

	} //end of arrayDisplay method


} //end of class



