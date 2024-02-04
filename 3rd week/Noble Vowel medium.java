Noble Vowel:
Given a string S your task is to find out whether a string is Noble Vowel string or not. A Nobel Vowel string is one in which there has to be a vowel after every consonant, but there can be any letter after any vowel. The only exception is a consonant n ;  after this letter, there can be any letter (not only a vowel) or there can be no letter at all.
Input format:
The first line contains an integer T denoting the number of test cases.
Each test case consists of one string S consisting of lower case alphabets.
Output format
For each test case on a new line print YES if S is a Noble Vowel string else print NO.
Example:
Input:
2
aeiou
cefduo
Output
YES
NO
Explanation:
In the first string, every vowel is followed by another vowel or consonant. So the string is Noble Vowel.
In the second string,f is a consonant, which should be followed by a vowel but it is being followed by another consonant, so this string is not Noble Vowel.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline character left by nextInt()

        while (t-- > 0) {
            String s = sc.nextLine();
            boolean isNobleVowel = true;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'n') {
                    // consonant n - can be followed by any letter or no letter
                    if (i + 1 < s.length()) {
                        c = s.charAt(i + 1);
                        if (!Character.isLetter(c)) {
                            // next character is not a letter
                            continue;
                        }
                        // skip the next character if it is a vowel
                        if (isVowel(c)) {
                            i++;
                        }
                    }
                } else if (isConsonant(c)) {
                    // consonant - must be followed by a vowel
                    if (i + 1 >= s.length() || !isVowel(s.charAt(i + 1))) {
                        isNobleVowel = false;
                        break;
                    }
                } else {
                    // vowel - can be followed by any letter
                    continue;
                }
            }
           System.out.println(isNobleVowel ? "YES" : "NO");
        }
    }
 private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
   private static boolean isConsonant(char c) {
        return !isVowel(c);
    }
}
In this program, we first read in the number of test cases using scanner.nextInt(). We then enter a while loop that will run testCases number of times. Within the loop, we read in the input string using scanner.nextLine() and then call the isNobleVowel method to check whether the input string is a Noble Vowel string or not. If it is, we print "YES" to the console, otherwise we print "NO".

The isNobleVowel method takes a string s as input and returns a boolean value indicating whether s is a Noble Vowel string or not. It starts by assuming that the first letter in s can be any letter (not necessarily a vowel) since there is no preceding consonant. It then iterates through each character in s, checking whether the current character is a consonant or a vowel. If the current character is a consonant, it checks whether the previous character was a vowel. If it was not, then s is not a Noble Vowel string and the method returns false. If the current character is a vowel, then s can be a Noble Vowel string regardless of the previous character. If the current character is the letter 'n', it skips the check for the previous character and continues to the next iteration. If the method makes it through the entire string without returning false, then s is a Noble Vowel string and the method returns true.

The isVowel method takes a character c as input and returns a boolean value indicating whether c is a vowel or not. It simply checks whether c is equal to 'a', 'e', 'i', 'o', or 'u'.
