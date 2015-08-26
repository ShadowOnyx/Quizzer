import java.util.Scanner;
public class Quizzer
	{
		static int counter;
		public static void main(String[] args)
			{
			System.out.println("Welcome to Quizzer 1.0, how many questions will you do today?");	
			Scanner userInput = new Scanner(System.in);
			int numberQ = userInput.nextInt();
			for(int i=0;i<numberQ;i++)
				{
				generator();	
				}
			System.out.println("Your quiz is now complete, you got "+counter+" answers correct");
			}
		public static int generator()
			{
				
			int x = ((int)(Math.random()*24)+1);
			int y = ((int)(Math.random()*12)+1);
			System.out.println("What is "+x+"%"+y+"?");
			Scanner userInput = new Scanner(System.in);
			int userAnswer = userInput.nextInt();
			int answer = x%y;
			if(userAnswer == answer )
				{
				System.out.println("Correct!");
				counter++;
				}
			else
				{
				System.out.println("Sorry, incorrect");	
				}
			return counter;
			}
	}
