import java.util.*;
import  java.util.Scanner;
public class lexographicallySmallBig{
    public static String getSmallBig(String str, int k){
        String smallest= str.substring(0,k);
        String largest=str.substring(0,k);
        for(int i=1;i<=str.length()-k;i++){
            String substring=str.substring(i,i+k);
            if(substring.compareTo(smallest)<0){
                smallest=substring;
            }
            if(substring.compareTo(largest)>0){
                largest=substring;
            }
        }
        return smallest +"\n"+ largest;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("Enter the length");
        int k=sc.nextInt();
        System.out.println(getSmallBig(str,k));
    }
}