Multiply Two Number:
You guys know how to multiply two numbers. This time PrepBuddy decide to give two strings S1 and S2, both strings contain non-negative integers. PrepBuddy asks you to print the product of S1 and S2.The output will be also represented as a string.
Note: 
Both S1 and S2 contain only digits 0?9.Both S1 and S2 do not contain any leading zero, except the number 0 itself.
Input Format:
The first line contains an integer T, denoting the number of test cases.
Each test case contains two strings S1 and S2.
Output  Format:
Print the product of S1 and S2.

Example:
Input
2
3 2
12 10
Output
6
120

import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger n1 = new BigInteger(s1);
            BigInteger n2 = new BigInteger(s2);
            System.out.println(n1.multiply(n2)); // prints the product of s1 and s2
        }
    }
}
Explanation:
We first take an input integer T which represents the number of test cases.
For each test case, we take two string inputs S1 and S2.
We then create two BigInteger objects n1 and n2, which are initialized using the string inputs s1 and s2.
We then use the multiply() method of the BigInteger class to compute the product of n1 and n2.
The result is then printed to the console using the println() method.
The loop runs for the number of test cases given as input.
