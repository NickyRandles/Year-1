public class Assignment
{
	public static void main(String[] args)
	{
		System.out.println("Please and the survey questions with a yes or no answer");
		System.out.println("Y= Yes, N= No");
		System.out.println("________________________________________________________________________________");

		char answer1;
		answer1 = 'Y';
		char answer2;
		answer2 = 'N';

		do{
			System.out.println("Are you a male?: ");

			if(answer1 == 'Y')
			{
				answer1 = Keyboard.readChar();
				System.out.println("You have answered Yes");
			}
			 if(answer2 == 'N')
			{
				answer2 = Keyboard.readChar();
				System.out.println("You have answered No");
			}
			else
			{
				System.out.println("Sorry you have have entered an invalid answer!");
				System.out.println("Please answers the question with either Y or N");
			}
			//end of question 1



			System.out.println("Are you a female?: ");
			//end of question 2
			System.out.println("Do you live in Dublin?: ");
			//end of question 3
			System.out.println("Are you 18 years old or older?: ");
			//end of question 4
			System.out.println("Are you still in education?: ");
			//end of question 5
			System.out.println("Are you currently working?: ");
			//end of question 6
			System.out.println("Do you play sports?: ");
			//end of question 7
			System.out.println("Do you play video games?: ");
			//end of question 8
			System.out.println("Do you hace a drivers licence?: ");
			//end of question 9
			System.out.println("Do you watch much TV?: ");
			//end of question 10

		}while(answer1 != 'X');

	} //end of main

} //end of class