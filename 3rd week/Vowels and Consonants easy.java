Vowels and Consonants
Let's take a simple problem. We all know what are vowels and consonants. Your task is pretty simple, given a string S, count number of vowels and consonants present in the string.
Input format:
The first line contains an integer T, denoting the number of test cases.
Each test case consists of a string S containing only uppercase characters.
Output format:
For each test case on a new line, print vowel count and consonant count separated by a space.
Example
Input
2
PREPBYTES
FLY
Output
2 7
0 3

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // consume the newline character left by nextInt()
        while (T-- > 0) {
            String str = sc.nextLine().trim().toUpperCase();
            int vowels = 0, consonants = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            System.out.println(vowels + " " + consonants);
        }
    }
}

Explanation:

First, we read the number of test cases T using Scanner.nextInt().
Then, we loop T times and for each test case, we read the input string using Scanner.nextLine(). We also call String.trim() and String.toUpperCase() to remove any leading/trailing whitespaces and convert the string to uppercase for easy comparison.
We initialize the vowel and consonant counters to zero.
We loop through each character of the string using a for-loop and check if it's a vowel (A, E, I, O, U) or not. If it's a vowel, we increment the vowels counter. Otherwise, we increment the consonants counter.
Finally, we print the counts of vowels and consonants for the current test case using System.out.println().
Note: The above code assumes that the input string contains only uppercase characters. If the input string can contain lowercase characters or non-alphabetic characters, then you may need to modify the code accordingly.
