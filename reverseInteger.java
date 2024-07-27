//Problem - Reverse a given Integer

import java.util.*;
import java.util.Scanner;

public class reverseInt {
    static  public int reverse(int num){
        int rev=0;
        int orignal=num;

        while(num!=0){
            int digit=num%10;
            rev=(rev*10)+digit;
            num/=10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        int result=reverse(number);
        System.out.println("The reverse is: "+result);
    }
}
