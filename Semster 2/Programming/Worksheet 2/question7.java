public class question7
{
	public static void main(String[] args)
	{
		int[] randomNum = new int[1000];
		int total = 0;
		int minimum = 1;
		int maximum = 7;

		for(int i = 0; i < randomNum.length; i++)
		{
			randomNum[i] = minimum + (int)(Math.random() * maximum);
			total = total + randomNum[i];
		}

		System.out.println("The total of all these numbers is: " + total);

	} //end of main

} //end of class