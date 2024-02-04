Print Prefix and Suffix
The prefix of a string is any leading contiguous part and Suffix is any trailing contiguous part (See sample test case explanation for better understanding). Given a string S, your task is to first print all the prefixes of S each in a new line, then print all the suffixes of S each in a new line.
Input Format
There is only one input, a string S containing only lowercase English alphabets.
Output
Print the required output as mentioned above.
Example
Input 1
abc
Output 1
a
ab
abc
c
bc
abc

Input 2
prep
Output 2
p
pr
pre
prep
p
ep
rep
prep
Sample test case explanation
Prefixes of string prep are p, pr, pre, prep. All are leading contiguous parts of the given string.
Suffixes of string prep are p, ep, rep, prep. All are trailing contiguous parts of the given string.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        // Printing all prefixes of the string
        for (int i = 1; i <= n; i++) {
            System.out.println(s.substring(0, i));
        }

        // Printing all suffixes of the string
        for (int i = n; i >= 1; i--) {
            System.out.println(s.substring(i-1, n));
        }
    }
}

Explanation:

We first take input the string S from the user using the Scanner class.
We find the length of the string and store it in the variable n.
We then use two loops to print all the prefixes and suffixes of the string.
In the first loop, we start from the first character and print all the substrings starting from that character up to the entire string. This gives us all the prefixes of the string.
In the second loop, we start from the last character and print all the substrings starting from that character up to the last character. This gives us all the suffixes of the string.
We use the substring method of the String class to extract the required substrings.
Finally, we print each substring on a new line using the println method of the System.out object.
Note: We start the second loop from n and go down to 1 because the substring method uses 0-based indexing, i.e., the first character of the string has index 0, and the last character has index n-1.
