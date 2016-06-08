public class question8
{
	public static void main(String[] args)
	{
		int[] lotto = new int[6];
		int minimum = 1;
		int maximum = 44;

		System.out.print("Your lotto numbers are: ");

		for(int i = 0; i < lotto.length; i++)
		{
			lotto[i] = minimum + (int)(Math.random() * maximum);
			System.out.print(lotto[i] + " ");
		}

		System.out.println();

	} //end of main

} //end of class