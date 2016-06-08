public class Assignment01
{
	public static void main(String[] args)
	{

	System.out.println("Please and the survey questions with a yes or no answer");
	System.out.println("y = Yes, n = No");
	System.out.println("________________________________________________________________________________");

	char answer1;
	char answer2;
	char answer3;
	char answer4;
	char answer5;
	char answer6;
	char answer7;
	char answer8;
	char answer9;
	char answer10;
	char extraAns1;
	char extraAns2;

	int xtotalYes=0, xtotalNo=0;
	int totalYes=0, totalNo=0;

	System.out.print("Are you a male?: ");

	answer1 = Keyboard.readChar();

	 if(answer1=='y') {
	totalYes = totalYes + 1;
	}

	if(answer1=='n') {
		totalNo = totalNo + 1;
	}
	//end of question 1

	System.out.print("Are you a female?: ");

	answer2 = Keyboard.readChar();

	if(answer2=='y') {
	totalYes = totalYes + 1;
	}

	if(answer2=='n') {
	totalNo = totalNo + 1;
	}

	//end of question 2

	System.out.print("Do you live in Dublin?: ");

	answer3 = Keyboard.readChar();

	 if(answer3=='y') {
	totalYes = totalYes + 1;
	}

	if(answer3=='n') {
	totalNo = totalNo + 1;
	}
	//end of question 3

	System.out.print("Are you 18 years old or older?: ");

	answer4 = Keyboard.readChar();

	if(answer4=='y') {
	totalYes = totalYes + 1;
	}

	if(answer4=='n') {
	totalNo = totalNo + 1;
	}
	//end of question 4

	System.out.print("Are you still in education?: ");

	answer5= Keyboard.readChar();

	 if(answer5=='y') {
	totalYes = totalYes + 1;
	}

	if(answer5=='n') {
	totalNo = totalNo + 1;
	}
	//end of question 5

	System.out.print("Are you currently working?: ");

	answer6 = Keyboard.readChar();

	if(answer6=='y') {
	totalYes = totalYes + 1;
	}

	if(answer6=='n') {
	totalNo = totalNo + 1;
	}
	//end of question 6

	System.out.print("Do you play sports?: ");

	answer7 = Keyboard.readChar();

    if(answer7=='y') {
	totalYes = totalYes + 1;
	}

	if(answer7=='n') {
	totalNo = totalNo + 1;
	}
	//end of question 7

	System.out.print("Do you play video games?: ");

	answer8 = Keyboard.readChar();

    if(answer8=='y') {
	totalYes = totalYes + 1;
	}

	if(answer8=='n') {
	totalNo = totalNo + 1;
	}
	//end of question 8

	System.out.print("Do you have a drivers licence?: ");

	answer9 = Keyboard.readChar();

	if(answer9=='y') {
	totalYes = totalYes + 1;
	}

	if(answer9=='n') {
	totalNo = totalNo + 1;
	}
	//end of question 9

	System.out.print("Do you watch much TV?:  ");

	answer10 = Keyboard.readChar();

	if(answer10=='y') {
	totalYes = totalYes + 1;
	}

	if(answer10=='n') {
	totalNo = totalNo + 1;
	}
	//end of question 10

	System.out.println("________________________________________________________________________________");
	System.out.println("Here is a summary of your answers");
	System.out.println("________________________________________________________________________________");

	System.out.print("Are you a male?: ");
	if (answer1 == 'y')
	{
		System.out.println("Yes was your response!");
	}
	else if (answer1 == 'n')
	{
		System.out.println("No was your response!");
	}
	else
	{
		System.out.println("You entered an invalid answer!");
	}
	//end of answer 1

	System.out.print("Are you a female?: ");
	if (answer2 == 'y')
	{
		System.out.println("Yes was your response!");
	}
	else if (answer2 == 'n')
	{
	System.out.println("No was your response!");
	}
	else
	{
		System.out.println("You entered an invalid answer!");
	}
	//end of answer 2

	System.out.print("Do you live in Dublin?: ");
	if (answer3 == 'y')
	{
		System.out.println("Yes was your response!");
	}
	else if (answer3 == 'n')
	{
		System.out.println("No was your response!");
	}
	else
	{
		System.out.println("You entered an invalid answer!");
	}
	//end of answer 3

	System.out.print("Are you 18 years old or older?: ");
	if (answer4 == 'y')
	{
		System.out.println("Yes was your response!");
	}
	else if (answer4 == 'n')
	{
		System.out.println("No was your response!");
	}
	else
	{
		System.out.println("You entered an invalid answer!");
	}
	//end of answer 4

	System.out.print("Are you still in education?: ");
	if (answer5 == 'y')
	{
		System.out.println("Yes was your response!");
	}
	else if (answer5 == 'n')
	{
		System.out.println("No was your response!");
	}
	else
	{
		System.out.println("You entered an invalid answer!");
	}
	//end of answer 5

	System.out.print("Are you currently working?: ");
	if (answer6 == 'y')
	{
		System.out.println("Yes was your response!");
	}
	else if (answer6 == 'n')
	{
		System.out.println("No was your response!");
	}
	else
	{
		System.out.println("You entered an invalid answer!");
	}
	//end of answer 6

	System.out.print("Do you play sports?: ");
	if (answer7 == 'y')
	{
		System.out.println("Yes was your response!");
	}
	else if (answer7 == 'n')
	{
		System.out.println("No was your response!");
	}
	else
	{
		System.out.println("You entered an invalid answer!");
	}
	//end of answer 7

	System.out.print("Do you play video games?: ");
	if (answer8 == 'y')
	{
		System.out.println("Yes was your response!");
	}
	else if (answer8 == 'n')
	{
		System.out.println("No was your response!");
	}
	else
	{
		System.out.println("You entered an invalid answer!");
	}
	//end of answer 8

	System.out.print("Do you have a drivers licence?: ");
	if (answer9 == 'y')
	{
		System.out.println("Yes was your response!");
	}
	else if (answer9 == 'n')
	{
		System.out.println("No was your response!");
	}
	else
	{
		System.out.println("You entered an invalid answer!");
	}
	//end of answer 9

	System.out.print("Do you watch much TV?: ");
	if (answer10 == 'y')
	{
		System.out.println("Yes was your response!");
	}
	else if (answer10 == 'n')
	{
		System.out.println("No was your response!");
	}
	else
	{
		System.out.println("You entered an invalid answer!");
	}

	System.out.println("________________________________________________________________________________");
	System.out.println("Total number of Yes's is : " + totalYes);
	System.out.println("Total number of No's is : " + totalNo);
	System.out.println("________________________________________________________________________________");

	if (totalYes >= 5)
	{
		System.out.println("Thank you for completing the survey, your data will contribute to our analysis");
	}
	else if (totalYes < 5)
	{
		System.out.println("________________________________________________________________________________");
		System.out.println("Please answer these two extra questions: ");
		System.out.println("________________________________________________________________________________");


		System.out.print("Do you like Java?: ");

		extraAns1 = Keyboard.readChar();

		if(extraAns1=='y') {
		xtotalYes = xtotalYes + 1;
		}

		if(extraAns1=='n') {
		xtotalNo = xtotalNo + 1;
		}
		//end of extra question 1

		System.out.print("Do you like Chinese food?: ");
		extraAns2 = Keyboard.readChar();

		if(extraAns2=='y') {
		xtotalYes = xtotalYes + 1;
		}

		if(extraAns2=='n') {
		xtotalNo = xtotalNo + 1;
		}
		//end of extra question 2

		if (xtotalYes == 2)
		{
			System.out.println("You have a very agreeable nature!");
		}
		if (xtotalYes == 1)
		{
			System.out.println("50-50, one yes and one no!");
		}
		if (xtotalYes == 0)
		{
			System.out.println("You appear to like saying No!");
		}
	}


	} //end of main

} //end of class