package as5;

import java.io.*;
import java.util.*;

public class Hangman
{
	private static final int MAX_GUESSES = 7;

	private int numLetters, numIncorrectGuesses, numLettersGuessedCorrectly;
	private char[] selectedWordArray;
	private boolean[] guessedLetter;
	private ArrayList<Character> lettersGuessed;

	private int numWins, numLosses;
	private double winRate;

	public Hangman()
	{
		this.reset();

		this.numWins = 0;
		this.numLosses = 0;
		this.winRate = 0.0;
	}

	public char[] getSelectedWordArray()
	{
		return selectedWordArray;
	}

	private String chooseWord()
	{
		ArrayList<String> words = new ArrayList<String>();

		try (Scanner scanner = new Scanner(new File("words.txt")))
		{

			while (scanner.hasNext())
			{
				words.add(scanner.nextLine());
			}

			Collections.shuffle(words);
			return words.get(0);

		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public void play()
	{
		Scanner input = new Scanner(System.in);
		char guess;
		char repeat = 'y';
		do
		{
			do
			{
				System.out.println("Enter guess: ");
				try
				{
					String sGuess = input.next();

					if (sGuess.length() > 1)
						throw new IllegalLengthException("That's not a letter!");
					else
						guess = sGuess.charAt(0);

					if (!Character.isLetter(guess))
						throw new IllegalCharacterException("That's not a letter!");
					else if (this.isIn(guess))
						this.print();
					else
						System.out.println("No matches, try again: ");
				} 
				catch (IllegalCharacterException e)
				{
					e.printStackTrace();
				} 
				catch (IllegalLengthException e)
				{
					e.printStackTrace();
				}

			} while (this.numIncorrectGuesses < MAX_GUESSES && this.numLettersGuessedCorrectly != this.numLetters);

			this.gameResult();

			System.out.println(numWins + " " + numLosses + " " + winRate);
			System.out.println("Play again? (type y to play again)");

			repeat = input.next().charAt(0);
			if (repeat == 'y')
				this.reset();

		} while (repeat == 'y');

		System.out.println("Game Over.");

		input.close();
	}

	private void gameResult()
	{
		if (this.numIncorrectGuesses == MAX_GUESSES)
			this.numLosses++;
		else
			this.numWins++;
		this.winRate = this.numWins / (double)(this.numLosses + this.numWins);
	}

	private boolean isIn(char c)
	{
		boolean result = false;

		if (this.lettersGuessed.contains(c) && this.lettersGuessed != null)
		{
			System.out.println("Letter Already guessed");
			return false;
		}

		for (int i = 0; i < this.numLetters; i++)
		{

			if (this.selectedWordArray[i] == c)
			{
				this.guessedLetter[i] = true;
				this.numLettersGuessedCorrectly++;
				this.lettersGuessed.add(this.selectedWordArray[i]);
				result = true;
			}
		}
		if (!result)
			this.numIncorrectGuesses++;
		return result;

	}

	private void print()
	{
		for (int i = 0; i < this.numLetters; i++)
		{
			if (this.guessedLetter[i])
				System.out.print(this.selectedWordArray[i]);
			else
				System.out.print("_");
		}
		System.out.println();
	}

	private void reset()
	{
		this.selectedWordArray = chooseWord().toCharArray();
		this.numLetters = selectedWordArray.length;
		this.numLettersGuessedCorrectly = 0;
		this.numIncorrectGuesses = 0;
		this.guessedLetter = new boolean[this.numLetters];
		this.lettersGuessed = new ArrayList<Character>();
	}

	public static void main(String[] args)
	{
		Hangman game = new Hangman();
		game.play();
	}

}
