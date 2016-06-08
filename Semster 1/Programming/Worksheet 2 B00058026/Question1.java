/**********************************************/
/*        Name: Nicky Randles B00058026                 */
/*	      Date: 4th October 2012						*/
/*        Program name: Question1						*/
/*		  Decription: This is the first program we did
          in Lecture two. It allows the users to type
          in their age. 								*/
/*********************************************/
public class Question1 {



  public static void main(String[] args) {

	int age; //Declaring
	age = 45; //Variable assignment
	int ageEntered;

	System.out.print("Please enter your age: ");

	ageEntered = Keyboard.readInt();

	System.out.println("Age entered was " + age);

	if(ageEntered<age) {
		System.out.println("No, you're a bit older!");
	}
	else if(ageEntered==45) {
		System.out.println("You're honest");

	}
	else {
		System.out.println("Don't put yourself down");
	}

  }


}