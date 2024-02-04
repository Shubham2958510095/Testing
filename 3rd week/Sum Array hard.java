Sum Array:
Given an array of n integers find the sum of all the elements of the array.
Note: the elements of the array might be large.
Input format:
First line contains integer t ,denoting the number of testcases. 
For each testcase:
First line contains an integer n.
Second line contains n space separated integers.
Output format:
For each testcase print the sum of all the array elements on a new line.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        
        while (t-- > 0) { // iterate through all test cases
            int n = scanner.nextInt(); // number of elements in array
            long sum = 0; // initialize sum to 0
            for (int i = 0; i < n; i++) {
                sum += scanner.nextLong(); // add each element to sum
            }
            System.out.println(sum); // print the sum for this test case
        }
    }
}

Explanation:
The program reads the number of test cases t from the input using the Scanner class. Then, for each test case, it reads the number of elements n in the array, initializes a variable sum to 0, and uses a for loop to iterate through each element of the array and add it to the sum. Finally, it prints the sum for that test case.
Note that we use long data type to store the sum since the elements of the array might be large. The Scanner class is used to read input from the console. The scanner.close() statement closes the scanner object to prevent resource leaks.
