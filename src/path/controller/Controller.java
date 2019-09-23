package path.controller;

import java.util.Scanner;

public class Controller
{
	private Scanner textScanner;

	public Controller()
	{
		textScanner = new Scanner(System.in);
	}

	public void start()
	{
		System.out.println("5 questions will come next. Please answer them the best you can.");

		startAdventure();
	}

	private void startAdventure()
	{
		System.out.println("What is your name?");
		String name = textScanner.nextLine();

		if (name.contentEquals("Weston"))
		{
			System.out.println("Why are you playing your own game?");
			
			firstQuestion();
		}
		else
		{
			System.out.println("Welcome to the adventure! " + name);
			
			firstQuestion();
		}

	}

	private void firstQuestion()
	{
		String answer = "";
		System.out.println("What is 2+2?");
		answer = textScanner.next();
		textScanner.nextLine();

		if (answer.equalsIgnoreCase("4"))
		{
			optionOne(answer);
		}
		else
		{
			optionTwo(answer);
		}
	}

	private void optionOne(String words)
	{
		String answer = "";
		System.out.println("Was that question hard for you to answer?");
		answer = textScanner.next();
		textScanner.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			answerOne();
		}
		else
		{
			answerTwo(answer);
		}
	}
	// make this an else if with "no" being an answer for else if,
	//and "else" resulting in a message, "this is a yes or no question, this answer is not valid"
	private void answerOne()
	{
		System.out.println("Good job working through it!");
		
		secondQuestion();
	}
	
	private void answerTwo(String wordsAgain)
	{
		System.out.println("Don't worry, the next question will be harder.");
		
		secondQuestion();
	}

	private void optionTwo(String wordsAgain)
	{
		System.out.println("That is incorrect.");
		
		firstQuestion();
	}
	
	private void secondQuestion()
	{
		String answer = "";
		System.out.println("What is the derivative of y=2x?" + "\ny'=___");
		answer = textScanner.next();
		textScanner.nextLine();
		
		if (answer.equalsIgnoreCase("2"))
		{
			correct();
		}
		else
		{
			incorrect();
		}
	}
	
	private void correct()
	{
		System.out.println("That's correct, good job!");
	}
	
	private void incorrect()
	{
		System.out.println("That is incorrect.");
		
		secondQuestion();
	}
	
	private String questionThree();
	{
		//put String _____ = ___________
	}
}
