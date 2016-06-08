public class Assignment02
{
	public static void main(String[] args)
	{
		char answer;


			System.out.println("Are you a male?: ");
			answer = Keyboard.readChar();
			if (answer == 'Y')
			{
				System.out.println("You have answered Yes! ");
			}
			else if (answer == 'N')
			{
				System.out.println("You have answered no! ");
			}
			else
			{
				System.out.println("Sorry you have have entered an invalid answer!");
				System.out.println("Please answers the question with either Y or N");
			}

	}

}