package DICE;

import javax.swing.JOptionPane;

public class DICE {
	static int TotalRollCount;

	static void RollDice(int NoOfDice, int MaxValue)
	{
		int count = 1;
		int diceValue = 0;
		int totalDiceValue = 0;
		
		while (count<=NoOfDice)
		{
			diceValue = 1 + (int)(Math.random()*MaxValue);
			totalDiceValue = totalDiceValue + diceValue;
			TotalRollCount++;
			JOptionPane.showMessageDialog(null, "Dice " + count + "\nDice Value " + diceValue + "\nTotal Dice Value " + totalDiceValue + "\nOverall Dice Roll " + TotalRollCount, "Statics", JOptionPane.PLAIN_MESSAGE);
			count++;
		}
	}
	
	public int RollCount()
	{
		return TotalRollCount;	
	}
}
