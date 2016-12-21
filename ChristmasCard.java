/**
 * 
 * @author Andreas Loizou
 * Created on 21 December 2016
 * This file is meant to be short and to not use any java libraries. It displays a Christmas card with a title, a Christmas tree and a personalised wish to the person who executes the code.
 */
public class ChristmasCard {

	// constants initialisation.
	private static final char STAR = '*';
	private static final char EMPTY = ' ';
	private static final short CHRISTMAS_TREE_HEIGHT = 16; //This excludes the tree trunk and is only for the top part of the tree. The width of the tree, will be 2*CHRISTMAS_TREE_HEIGHT
	private static final short TRUNK_HEIGHT = 5;
	private static final short TRUNK_WIDTH = 6;
	
	public static void main(String[] args) {

		ChristmasCard card = new ChristmasCard();
		card.printTitle();
		card.printChristmasTree();
		card.printWish();
	}

	/**
	 * Prints the Christmas Tree
	 */
	private void printChristmasTree(){
		
		printTopOfChristmasTree();
		printTrunkOfChristmassTree();	
	}
	
	/**
	 * Prints the top part of the Christmas Tree.
	 */
	private void printTopOfChristmasTree(){
		
		for (int i=1;i<=CHRISTMAS_TREE_HEIGHT;i++){
			printSequence(CHRISTMAS_TREE_HEIGHT-i, EMPTY);
			printSequence(i, STAR);
			printSequence(i, STAR);
			printSequence(CHRISTMAS_TREE_HEIGHT-i, EMPTY);
			System.out.println();
		}
	}
	
	/**
	 * Prints the trunk of the Christmass Tree
	 */
	private void printTrunkOfChristmassTree(){
		
		for (int i=1;i<=TRUNK_HEIGHT;i++){
			printSequence(CHRISTMAS_TREE_HEIGHT-TRUNK_WIDTH/2, EMPTY);
			printSequence(TRUNK_WIDTH, STAR);
			printSequence(CHRISTMAS_TREE_HEIGHT-TRUNK_WIDTH/2, EMPTY);
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @param sequenceLength the length of the sequence. How many times the character will be printed
	 * @param character The character to be printed
	 */
	private void printSequence(final int sequenceLength, final char character){
		
		for (int j=0;j<sequenceLength;j++){
			System.out.print(character);
		}		
	}
	
	/**
	 * Prints a personalised wish for the person who executes the code
	 */
	private void printWish(){
		
		System.out.println('\n'+System.getProperty("user.name")+", I wish you 12 Months of success, 52 weeks of laughter, 365 days of fun, 8760 hours of joy, 525600 minutes of good luck and 31536000 seconds of happiness.");		
	}
	
	/**
	 * Prints the title of the card
	 */
	private void printTitle(){
		
		System.out.println("\nMERRY CHRISTMAS! HOHOHO!\n");
	}
}
