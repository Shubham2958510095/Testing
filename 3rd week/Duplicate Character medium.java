Duplicate Character:
Tina is given a string S which contains the first letter of all the student names in her class. She got a curiosity to check how many people have their names starting from the same alphabet. So given a string 
S, she decided to write a code that finds out the count of characters that occur more than once in the string.
Input format:
The first line contains an integer T, denoting the number of test cases. Each test case consists of a string S containing only lowercase characters.
Output format:
For each test case on a new line, print the output in the format character=count. If multiple characters have more than one count, print all of them separated by space, in alphabetical order.
In case no such character is present print ?1.
Example
Input
3

prepbytes
java
algorithm

Output
e=2 p=2 a=2
?1
Sample test case explanation:
In the first string character p is occuring 2 times and character e is occuring 2 times. Printing them in alphabetical order we get,e=2 p=2.

import java.util.*;
public class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int[] freq = new int[26];
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }
            boolean flag = false;
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 1) {
                    System.out.print((char) (i + 'a') + "=" + freq[i] + " ");
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("-1");
            } else {
                System.out.println();
            }
        }
    }
}

Explanation:
The program takes the input string S for each test case and creates an array freq of size 26 to store the frequency of each character in the string. It then loops through the string S and increments the corresponding index in freq for each character. After that, it loops through the freq array and prints the characters with frequency greater than 1. If there are no such characters, it prints -1. The program uses a boolean flag to keep track of whether any characters with frequency greater than 1 were found, so that it knows whether to print a newline character after the output.