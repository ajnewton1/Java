//*
// Account: ajn54@pitt.edu
// Author: Aaron Newton
// Completion Time: a few days
// Honor Code: I pledge that this program represents my own program.
// I recieved help from no one in understanding and debugging my program.

package peace;

//import java.util
import card.Card;
import yesnoextractor.YesNoExtractor;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
 
public class Peace {
   
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
YesNoExtractor again = new YesNoExtractor();

// title screen
System.out.println("Let's play some Peace!");

int g = 1;
do {

if (g>1) {
    System.out.println();
    System.out.println("Awesome! Let's do this!");
}
// create vectors    
Vector deck = new Vector();
Vector pd = new Vector();
Vector cd = new Vector();
Vector pp = new Vector();
Vector cp = new Vector();

// create deck of cards      
for (int i = 1; i<53; i++){
    Card card = new Card(i);
    deck.add(card);
}
// shuffle cards
Collections.shuffle(deck);
      
for (int p = 0; p<26; p++) {
    pd.add(deck.elementAt(2*p));
    cd.add(deck.elementAt(2*p + 1));
}

int t = 1;
        while (t < 27) {
    for (int p = 0; pd.size() > 0; ){
        Card pc = (Card) pd.remove(0);
        Card cc = (Card) cd.remove(0);
              
        System.out.println();
        System.out.println("Trick number: " + t);
        System.out.println("Player played: " + pc);
        System.out.println("Dealer played: " + cc);
    t++;
    int w = pc.compare(cc);
    if (w == 1) {
        System.out.println("Player's card wins.");
        pp.add(pc);
        pp.add(cc);
    }
    else {
        System.out.println("Dealer's card wins.");
        cp.add(pc);
        cp.add(cc);
    }
}
}
     
    // print the results    
    System.out.println();
    System.out.println("Game is over, let's tally who won.");
    System.out.println("Player's win pile has " + pp.size() + " cards.");
    System.out.println("Dealer's win pile has " + cp.size() + " cards.");
 
// if you win    
if (pp.size() > cp.size()) {
    System.out.println();
    System.out.println("You win!");
    System.out.println();  
}
    // if its a tie  
    else if (pp.size() == cp.size()) {
        System.out.println();
        System.out.println("It's a draw!");
        System.out.println();
    }
      
// if computer wins
else {
    System.out.println();
    System.out.println("The computer wins. Better luck next time!");
    System.out.println();
}
    
// play another game
g++;
} while (again.askUser("Play another round?"));
  
// if no
System.out.println();
System.out.println("That's too bad, but thanks for playing.");
}
}
  
