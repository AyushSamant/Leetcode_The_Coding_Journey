import java.util.*;
import java.math.*;
public class consecutiveOnes {
    public  static int maxConsecutiveOne(String binary){
        int maxcount=0;
        int count=0;
        char[] arr=binary.toCharArray();
        for(char i: arr){
            if(i=='1'){
                count++;
            }else{
                if(count>maxcount){
                    maxcount=count;
                }
                count=0;
            }
        }
        if (count > maxcount) {
            maxcount = count;
        }
        return maxcount;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        String binary = Integer.toBinaryString(number);
        int result=maxConsecutiveOne(binary);
        System.out.print("The number of consecutive ones are: "+result);
    }
}
