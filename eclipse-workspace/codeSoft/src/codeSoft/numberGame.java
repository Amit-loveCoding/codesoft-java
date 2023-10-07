package codeSoft;

import java.util.Scanner;

public class numberGame {
	public static void numberGame()
	{
		//Scanner Class
		Scanner sc = new Scanner(System.in);
		
		// Generate the numbers
		int number=1 + (int)(Math.random()*100);
		
		//taking input for  K trials
		System.out.print("Enter number of trials a gamer want to :"+" ");
		int k=sc.nextInt();	
		
		int i,guess;
		int score=0;
		
		System.out.println("A number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within k trials.");
		
		// Traversing over k trials
		for(i=0;i<k;i++)
		{
			System.out.println("Guess the number:");
			
			//taking input for guessing
			guess= sc.nextInt();
			
			// If number is guessed
			if(number==guess)
			{
				System.out.println("Hurray!! Your guess is right.You are good to go");
				score++;
				break;
			}
			else if(number > guess && i!=k-1)
			{
				System.out.println("The number is too high "+guess);
			}
			else if(number < guess && i!=k-1)
			{
				System.out.println("The number is too low "+guess);
			}
		}
		if(i==k)
		{
			System.out.println("You have exhausted"+"K trials");
			System.out.println("The number was" + number);
		}
		System.out.println("Total Score is :"+score+"");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberGame();

	}

}
