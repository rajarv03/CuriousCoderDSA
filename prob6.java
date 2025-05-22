/* Prob 2:

Write a program to take x and print multiples of x till 1000.

Input:

100

Expected Output:

100

200

300

400

500

600

700

800

900

1000

Explanation - Input is 100, multiples of 100 is 100*1, 100*2, 100*3 and so on till 1000. */


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the input x ");
       int x = scan.nextInt();
     
        
        System.out.println("Multiples of " + x + " up to 1000:");
        for (int i = 1; i * x <= 1000; i++) {
            System.out.println(i * x + " ");
        }
        
        
    }
}
