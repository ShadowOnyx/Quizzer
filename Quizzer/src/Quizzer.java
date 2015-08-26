import java.util.Scanner;
public class Quizzer
	{
		static int answerCounter;
		static int counter;
		static int numberQ;
		static int counter1;
		public static void main(String[] args)
			{
			System.out.println("Welcome to Quizzer 1.5, how many questions will you do today?");	
			Scanner userInput = new Scanner(System.in);
			numberQ = userInput.nextInt();
			for(int i=0;i<numberQ-2;i++)
				{
				generator();	
				}
			generatorEqual();
			generatorLargerRight();
			System.out.println("Your quiz is now complete, you got "+answerCounter+" answers correct");
			}
		public static int generator()
			{	
			int x = ((int)(Math.random()*24)+12);
			int y = ((int)(Math.random()*12)+1);
			System.out.println("What is "+x+"%"+y+"?");
			Scanner userInput = new Scanner(System.in);
			int userAnswer = userInput.nextInt();
			int answer = x%y;
			if(userAnswer == answer )
				{
				System.out.println("Correct!");
				answerCounter++;
				}
			else
				{
				System.out.println("Sorry, incorrect");	
				}
			return answerCounter;
			}
		public static int generatorEqual()
			{
			int x = ((int)(Math.random()*24)+1);
			System.out.println("What is "+x+"%"+x+"?");
			Scanner userInput = new Scanner(System.in);
			int userAnswer = userInput.nextInt();
			int answer = x%x;
			if(userAnswer == answer )
				{
				System.out.println("Correct!");
				answerCounter++;
				}
			else
				{
				System.out.println("Sorry, incorrect");	
				}
			return answerCounter;	
			}
		public static int generatorLargerRight()
			{
				int x = ((int)(Math.random()*12)+1);
				int y = ((int)(Math.random()*24)+12);
				System.out.println("What is "+x+"%"+y+"?");
				Scanner userInput = new Scanner(System.in);
				int userAnswer = userInput.nextInt();
				int answer = x%y;
				if(userAnswer == answer )
					{
					System.out.println("Correct!");
					answerCounter++;
					}
				else
					{
					System.out.println("Sorry, incorrect");	
					}
			return answerCounter;	
			}
	}
