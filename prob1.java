/*
Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.
Input:  2 Name y
Expected Output:
2
Name
y
*/

import java.util.Scanner;
class Main
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input");
        int a = scan.nextInt();
        String  str = scan.next();
        String b = scan.next();
        System.out.println(a);
        System.out.println(str);
        System.out.println(b);
    }
}
