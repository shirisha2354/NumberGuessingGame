import java.util.Scanner;
// added levels and score for number guessing game
public class NumberGame
{

	// number guessing game
	public static void guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int)(100* Math.random());

		// Given K trials
		int K = 5;
		int i, guess;
		float count=5,y;
		System.out.println("LEVEL1:"+"\n"+"A number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within 5 trials.");
		for (i = 0; i < K; i++) 
		{
			System.out.println("Guess the number:");
			guess = sc.nextInt();
			if (number == guess)
			{
				System.out.println("Congratulations!"+ " You guessed the number.");
				if(count==5)
				{
					System.out.println("you guessed on first try");
					System.out.println("you scored:"+"100");
				}
				else{
						y=count/5*100;
						System.out.println("you scored:"+y);
					}
				level2();
				break;
			}
			else if (number > guess&& i != K - 1) 
			{
				System.out.println("The number is "+ "greater than " + guess);
				count--;
			}
			else if (number < guess&& i != K - 1) 
			{
				System.out.println("The number is"+ " less than " + guess);
				count--;
			}
		}

		if (i == K) 
		{
			System.out.println("You have exhausted"+ " K trials.");
			System.out.println("The number was " + number);
		}
	}	
	public static void level2()
	{
		Scanner sc = new Scanner(System.in);
		int i=0;
		int k=2;
		float count=2;
		int temp;
		int number = 1 + (int)(100* Math.random());
		System.out.println("LEVEL2:");
		for (i = 0; i < k; i++) 
		{
			System.out.println("Guess the number:"+"within 2 trials");
			int guess = sc.nextInt();
			if (number == guess)
			{
				System.out.println("Congratulations!"+ " You guessed the number.");
				if(count==2)
				{
					System.out.println("you guessed on first try");
					System.out.println("you scored:"+100+"\n"+"you successfully completed the game");
				}
				else
				{
					float x=count/2*100;
					System.out.println("you scored:"+x+"\n"+"you successfully completed the game");
				}
				break;
			}
			else if (number > guess&& i != k - 1) 
			{
				temp=number+1;
				System.out.println("The number is between "+guess+" and "+temp);
				count--;
			}
			else if (number < guess&& i != k - 1) 
			{
				temp=number-1;
				System.out.println("The number is between "+temp+" and "+ guess);
				count--;
			}
		}	
		if (i == k) 
		{
			System.out.println("You have exhausted"+ " K trials.");
			System.out.println("The number was " + number);
		}
	}
	public static void main(String arg[])
	{
		guessingNumberGame();
	}
}
