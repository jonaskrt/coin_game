import java.util.Scanner;
 
/**
 * play a game with coins
 * 
 * @author Jonas Rhbary
 * @since 1-1-2018
 * @version 66.6
 */
public class CoinGame{
 
    static Scanner scanner;
 
    /**
     * constructor
     */
    public CoinGame() {
        scanner = new Scanner(System.in);
    }
 
    /**
     * starts the execution
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        CoinGame program = new CoinGame();
 
        System.out.println("Willkommen zum Münzenspiel");
        program.play();
        System.out.println("Bis bald");
        scanner.close();
    }
 
    /**
     * play the coin game
     */
    private void play() {
        // TODO Variablen deklarieren
        // TODO aktueller Spieler gleich 1
		int coinnow;
		int playernow = 1;
		int takecoin = 0;
        /* generate random number of coins
           between 10 and 30 */
        coinnow = (int)(Math.random() * 20 + 10); 
 
        // TODO Solange Restliche Münzen grösser Null
		while (coinnow >= 0) {
		
            // TODO Ausgabe: Restliche Münzen 
			System.out.println("Es sind noch " + coinnow + " Münzen auf dem Stapel");
            // TODO Ausgabe: aktueller Spieler nimm 1-3 Münzen
			System.out.println("Spieler " + playernow + " nehme 1-3 Münzen > ");
            // TODO Eingabe: Anzahl Münzen
			takecoin = scanner.nextInt();
            // TODO Falls Anzahl Münzen kleiner 1 
			if (takecoin <= 0) {
                System.out.println("Du musst mindestens 1 Münze nehmen");
            // TODO Sonst
			} else {
                // TODO Falls Anzahl Münzen grösser3
				if (takecoin >= 4) {
                    // TODO Ausgabe: Du kannst höchstens 3 Münzenzen nehme
					System.out.println("Du kannst höchstens 3 Münzen nehmen");
                // TODO Sonst
				} else {
                    // TODO Reduziere Restliche Münzen um Anzahl
					coinnow = coinnow - takecoin;
                    // TODO Aktueller Spieler = 3 - Aktueller Spieler
					playernow = 3 - playernow;
                // Ende der inneren Selektion
				}
            // Ende der äusseren Selektion
			}
       // Ende der Iteration
	   }
      // TODO Ausgabe: aktueller Spieler hat verloren
	  System.out.println("Spieler " + playernow + " hat gewonnen!");
    }
}