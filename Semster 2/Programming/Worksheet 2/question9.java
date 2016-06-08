public class question9
{
	public static void main(String[] args)
	{
		int[] numbers = new int[51];
		int maximum = 10;
		int minimum = 1;
		int half = numbers.length / 2;

		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = minimum + (int)(Math.random() * maximum);
		}

		System.out.println("The index value is: " + half);
		System.out.println("The value contained in the element is: " + numbers[half]);

	} //end of main

} //end of class