/*Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

Input

Nandy

Raja

5

Expected output:

NandyRaja

NandyRaja

NandyRaja

NandyRaja

NandyRaja

Explanation - Nandy is the firstName, Raja is the lastName and n is 5, so the expected output has NandyRaja printed 5 times. */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the input n ");
       int n = scanner.nextInt();
       System.out.println("Enter the firstname");
       String firstName = scanner.next();
       System.out.println("Enter the lastname");
       String lastName = scanner.next();
       for(int i=0;i<=n;i++)
       {
           System.out.println(firstName +" "+lastName);
       }
        
        
    }
}
