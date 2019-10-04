package path.controller;

import java.util.Scanner;

import path.view.View;

public class Controller
{
	
	private View view;	
	
	private Scanner textScanner;

	public Controller()
	{
		textScanner = new Scanner(System.in);
		
		view = new View();
	}

	public void start()
	{
		view.displayMessage("5 questions will come next. Please answer them the best you can.");

		startAdventure();
	}

	private void startAdventure()
	{
		String name = view.askQuestion("What is your name?");

		if (name.contentEquals("Weston"))
		{
			view.displayMessage("Why are you playing your own game?");
			
			firstQuestion();
		}
		else
		{
			view.displayMessage("Welcome to the adventure! " + name);
			
			firstQuestion();
		}

	}

	private void firstQuestion()
	{
		String answer = "";
		answer = view.askQuestion("What is 2+2?");

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
		answer = view.askQuestion("Was that question hard for you to answer?");

		if (answer.equalsIgnoreCase("yes"))
		{
			answerOne();
		}
		else if (answer.equalsIgnoreCase("no"))
		{
			answerTwo(answer);
		}
		else
		{
			answerThree();
		}
			
	}
	// make this an else if with "no" being an answer for else if,
	//and "else" resulting in a message, "this is a yes or no question, this answer is not valid"
	private void answerOne()
	{
		view.displayMessage("Good job working through it!");
		
		secondQuestion();
	}
	
	private void answerTwo(String wordsAgain)
	{
		view.displayMessage("Don't worry, the next question will be harder.");
		
		secondQuestion();
	}
	
	private void answerThree()
	{
		String answer = "";
		
		view.displayMessage("This is not a valid answer");
		
		optionOne(answer);
	}

	private void optionTwo(String wordsAgain)
	{
		view.displayMessage("That is incorrect.");
		
		firstQuestion();
	}
	
	private void secondQuestion()
	{
		String answer = "";
		answer = view.askQuestion("What is the derivative of y=2x?" + "\ny'=___");
		
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
		view.displayMessage("That's correct, good job!");
	}
	
	private void incorrect()
	{
		view.displayMessage("That is incorrect.");
		
		secondQuestion();
	}
}