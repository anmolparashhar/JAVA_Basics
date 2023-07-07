package mypackage;

import java.util.Scanner;

public class QuizApplication {

	public static void main(String[] args) 
	{
				String Name;
				int Score = 0;
				int Answer;
				Scanner obj = new Scanner(System.in);
				System.out.println("Enter your Name: ");
				Name = obj.nextLine();
				
				System.out.println("Hi "+Name+","+"Welcome to Java Quiz.");
				System.out.println("Instruction: There will be total 5 question, each question will consider 2 marks.");
				System.out.println("*********************************************************************************");
				
				System.out.println("Q.1 Which will convert .java file to byte code?");
				System.out.println("1. javac  2. java");
				System.out.println("Your answer:");
				Answer = obj.nextInt();
				if(Answer==1) 
				{
					Score = Score + 2;
					System.out.println("This is correct. Your score is " + Score +".");
			    }
				else {
					System.out.println("This is incorrect. The correct Answer is 1. javac");
				}
				System.out.println("***********************************************************************************");
				System.out.println("Q.2 What is range of byte in Java?");
				System.out.println("1. 0 to 255  2. -128 to 128 3. -127 to 128 4. -128 to 127");
				System.out.println("Your answer:");
				Answer = obj.nextInt();
				if(Answer==4) 
				{
					Score = Score + 2;
					System.out.println("This is correct. Your score is " + Score +".");
			    }
				else {
					System.out.println("This is incorrect. The correct Answer is 4. -128 to 127");
				}
				System.out.println("***********************************************************************************");
				System.out.println("Q.3 Java is case sensitive?");
				System.out.println("1. True  2. False");
				System.out.println("Your answer:");
				Answer = obj.nextInt();
				if(Answer==1) 
				{
					Score = Score + 2;
					System.out.println("This is correct. Your score is " + Score +".");
			    }
				else {
					System.out.println("This is incorrect. The correct Answer is 1. True, it is case sensitive.");
				}
				System.out.println("***********************************************************************************");
				System.out.println("Q.4 String in java is?");
				System.out.println("1. Mutuable  2. Immutable");
				System.out.println("Your answer:");
				Answer = obj.nextInt();
				if(Answer==2) 
				{
					Score = Score + 2;
					System.out.println("This is correct. Your score is " + Score +".");
			    }
				else {
					System.out.println("This is incorrect. The correct Answer is 2. Immutable");
				}
				System.out.println("***********************************************************************************");
				System.out.println("Q.5 Biggest Decimal number that can stored in 1 byte?");
				System.out.println("1. FF  2. 377 3. 255 4. 11111111");
				System.out.println("Your answer:");
				Answer = obj.nextInt();
				if(Answer==3) 
				{
					Score = Score + 2;
					System.out.println("This is correct. Your score is " + Score +".");
			    }
				else {
					System.out.println("This is incorrect. The correct Answer is 3. 255");
				}
				System.out.println("***********************************************************************************");
				System.out.println("Your total score is: " + Score+" out of 10.");
				System.out.println("Thank You for playing "+Name+", have a great time!");
				obj.next();
			}
	}
