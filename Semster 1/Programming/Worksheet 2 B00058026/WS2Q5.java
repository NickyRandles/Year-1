/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 11th October 2012						*/
/*        Program name: WS2Q5						    */
/*		  Decription: This program is a more enhanced
		  version of the previous program. The program
		  doubles the value of the number entered.		*/
/*********************************************/
class WS2Q5
{
	public static void main(String[] args)
	{
		int number;
		int numberDouble;

		System.out.println("Give me a number please: ");

		number = Keyboard.readInt();

		System.out.println("Thank you");

		numberDouble = number * 2;

		System.out.println("The value of the number doubled is: " +  numberDouble);

	}

}