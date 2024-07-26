//Problem - Check whether the number is palindrome or not

import java.util.*;
import java.util.Scanner;

public class reverseInteger {
    public void reverseInt(int number){               //method to check palindrome number with a single parameter
        int rev=0;
        int orignal=number;                           //Storing number in other variable

        while(number!=0){
            int digit=number%10;
            rev=(rev*10)+digit;
            number/=10;
        }

        if(orignal==rev){
            System.out.println("Result: It is a palindrome number");
        }else{
            System.out.println("Result: It is not a palindrome number");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();                        //Taking input
        reverseInteger num1=new reverseInteger();      //creating object
        num1.reverseInt(number);                       //calling method with number as arguement
    }
}
