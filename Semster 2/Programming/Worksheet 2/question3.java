public class question3
{
	public static void main(String[] args)
	{
		int[] num1 = new int[4];
		int[] num2 = new int[4];
		num1[0] = 2;
		num1[1] = 4;
		num1[2] = 6;
		num1[3] = 8;
		num2[0] = 8;
		num2[1] = 6;
		num2[2] = 4;
		num2[3] = 2;
		int sum;

		for(int i = 0; i < num1.length; i++)
		{
			sum = num1[i] + num2[i];
			System.out.println(sum);
		}

	} //end of main

} //end of class