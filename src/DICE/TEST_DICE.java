package DICE;

import javax.swing.JOptionPane;

public class TEST_DICE {
		
		public static void main(String[] args) {
			
			int NoOfDices = 2;
			
			DICE mDice = new DICE();
			
			//Call DICE class static method just to test
			DICE.RollDice(NoOfDices, 6);
			JOptionPane.showMessageDialog(null, mDice.RollCount(), "Thanks for playing", JOptionPane.PLAIN_MESSAGE);
			
			//Call another time just to check RollCount method works Good 
			DICE.RollDice(NoOfDices, 12);	
			JOptionPane.showMessageDialog(null, "Total Dice Rolled " + mDice.RollCount() + "\n\nGoodbye!!!!", "Thanks for playing", JOptionPane.PLAIN_MESSAGE);
			
		}
}
