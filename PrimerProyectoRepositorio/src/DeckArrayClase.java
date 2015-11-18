
public class DeckArrayClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUMBER_OF_PLAYERS = 2;
		
		 
		int []deck = new int[52];
		String []suit={"Spades","Hearts","Diamonds","Clubs"};
		String []card={"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		
		
		initializeDeck(deck);
		
		shuffleCards(deck);
		for (int player = 1; player <= NUMBER_OF_PLAYERS; player++){
		  System.out.println(" Cards for the player number: "+player+":");
		  printCardsGet(deck,suit,card);
		 } 
	}//end main
	
	public static void initializeDeck(int []deck){
		for (int i=0; i<deck.length;i++){
		 deck[i]=i;
		}
	}
	
	public static void shuffleCards(int []deck){
		for (int i = 0; i < deck.length; i++) {
			  int index=(int)(Math.random()* deck.length);
			  int temp=deck[i];
			  deck[i]=deck[index]; 
			  deck[index]=temp;
		}
	}	

	public static void printCardsGet(int []deck,String []suits, String []card){
		final int NUMBER_OF_CARDS = 4;
		int top = 0;
		//if (top +)
		for (int i=0;i< NUMBER_OF_CARDS;i++){
			int cardNumber=deck[top]%13;
			int suit=deck[top++]/13;
			System.out.print(card[cardNumber]+" of"+" ");
			System.out.println(suits[suit]+" ");
		}
	}
	

}//end class
