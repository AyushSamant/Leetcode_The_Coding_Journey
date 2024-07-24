//Problem - Given a roman numeral, convert it to an integer.
/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/
import java.util.*;
import java.lang.String;
import java.util.Scanner;

public class romanToInteger {
    static public int romanToInt(String romanNumber){
        int result=0;//for storing the current value of roman numeral
        int prevValue=0;//for storing the previous value of the letter of the roman numeral

        for(int i=romanNumber.length()-1;i>=0;i--){//loop in decreasing manner as we want to start from the back of the roman numeral
            int currentValue=0;
            switch (romanNumber.charAt(i)){
                case 'I':
                    currentValue=1;
                    break;
                case 'V':
                    currentValue=5;
                    break;
                case 'X':
                    currentValue=10;
                    break;
                case 'L':
                    currentValue=50;
                    break;
                case 'C':
                    currentValue=100;
                    break;
                case 'D':
                    currentValue=500;
                    break;
                case 'M':
                    currentValue=1000;
                    break;
            }
            if(currentValue<prevValue){
                result-=currentValue;
            }else{
                result+=currentValue;
            }
            prevValue=currentValue;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String romanNumber;
        int number;
        System.out.print("Enter the Roman Numeral: ");
        romanNumber = sc.next();
        number = romanToInt(romanNumber);
        System.out.println("The Roman Numeral of " + romanNumber + " is : " + number);
    }
}
