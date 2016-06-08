class question01
{
	public static void main(String[] args)
	{
		lottoGenerator(); //calling method
	} //end of main

	static void lottoGenerator()
	{
		int[] lotto = new int[6]; //declaring array

		System.out.print("Your lotto numbers are: ");
		for(int i = 0; i < lotto.length; i++)
		{
			//assigning values to array
			lotto[i] = (int)(Math.random()*44)+1;
			System.out.print(lotto[i] + " "); //outputting lotto numbers
		} //end of loop
		System.out.println(); //blank line

	} //end of lottoGenerator method



} //end of class