Playing Cards:
PrepBuddy is playing a card game for the first time and needs your help. Let us tell you rules of this card game. In a pack of 52 cards, each card has a suit (Diamonds — D, Clubs — C, Spades — S, or Hearts — H), and a rank (2,3, 4, 5, 6, 7, 8, 9, T, J, Q, K,or A). At the start of the game, there is one card on the table and all the players have five cards in their hand. A player can play a card from her/his hand if and only if it has the same rank or the same suit as the card on the table.
It is PrepBuddy's turn, there is a card on the table and five cards in her hand. Can you find out if she can play atleast one card?
Input:
First line contains an integer T, denoting the number of test cases.
Each test case consists of two lines. 
First line denotes the card on the table. 
Second line denotes five cards in the hands of the player.
Each card is denoted by rank and suit. For example, 2H - 2 is rank and H is suit.
Output:
For each test case on a new line, print YES or NO depending on the above mentioned condition.

Example
Input
2
AS
2H 4C TH JH AD
2H
3D 4C AC KD AS
Output
YES
NO



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        while (t-- > 0) {
            String tableCard = scanner.next();
            String[] hand = new String[5];
            for (int i = 0; i < 5; i++) {
                hand[i] = scanner.next();
            }
            boolean canPlay = false;
            for (String card : hand) {
                if (card.charAt(0) == tableCard.charAt(0) || card.charAt(1) == tableCard.charAt(1)) {
                    canPlay = true;
                    break;
                }
            }
           if (canPlay) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
Explanation:

We take input the number of test cases t using scanner.nextInt().
Then, we run a loop for each test case and take input the card on the table and the player's hand using scanner.next().
We create a boolean variable canPlay and initialize it to false.
We then iterate over the cards in the player's hand using a for-each loop and check if the card has the same rank or suit as the card on the table. If we find such a card, we set canPlay to true and break out of the loop.
Finally, we check the value of canPlay and print "YES" if it is true, and "NO" otherwise.
