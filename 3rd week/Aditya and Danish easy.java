Aditya and Danish
Aditya and Danish are great chess players and they want to know who is the better player. So they play N games in a row. For each game, we noted down the winner- Aditya or Danish. There was no tie.Now they are tired of playing the game and want you to find out who won more games.
Input format:
The first line contains an integer 
T,denoting the number of test cases.
For each test case
First-line contains an integer N, denoting the length of the string.
The second line contains a string with 
N characters and each character is either A or D where A means Aditya won and D means Danish won.
Output format:
For each test case on a new line,
Print Aditya if Aditya wins more number of games.
Print Danish if Danish wins more number of games.
Print AdiDan is both have equal number of wins.

Example
Input
3
6
ADAAAA
7
DDDAADA
6
DADADA
Output
Aditya
Danish
AdiDan

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // length of string
            String s = sc.next(); // string with n characters
             int adiScore = 0, danScore = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'A') {
                    adiScore++;
                } else {
                    danScore++;
                }
            }
             if (adiScore > danScore) {
                System.out.println("Aditya");
            } else if (danScore > adiScore) {
                System.out.println("Danish");
            } else {
                System.out.println("AdiDan");
            }
        }
    }
}
Explanation:

The program first takes the number of test cases as input. Then, for each test case, it takes the length of the string and the string as input.

Then, it initializes two variables adiScore and danScore to 0 to keep track of the scores of Aditya and Danish respectively. It then loops through the string and increments the respective score for each character.

After the loop, it compares the two scores and prints the result accordingly. If Aditya has a higher score, it prints "Aditya". If Danish has a higher score, it prints "Danish". If both have equal scores, it prints "AdiDan".

Note that we are using charAt(i) to access the i-th character of the string. Also, we are using next() to read the string input, which reads only until the first whitespace character. If the string can contain whitespace characters, we should use nextLine() instead.
