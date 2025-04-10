/*
Prob 4: Write a program using switch case which takes a value and prints the respective Size.
If size is 29 then its small

If size is 30 then its Medium

If size is 38 then its Large

If size is 42 then its XLarge

If size is not any of the above then Invalid.



Input: 29

Expected Output: 

Small
*/

import java.util.Scanner;
class Main
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input");
        int a = scan.nextInt();
        if (a==29)
    {
        System.out.println("Small");
    }
       else if (a == 30)
       {
           System.out.println("Medium");
       }
        else if(a ==38)
        {
            System.out.println("Large");
        }
       else if(a == 42)
       {
           System.out.println("XLarge");
          
       }
    else 
    {
        System.out.println("invalid");
    }
    }
}
