import java.util.*;
public class areAnagram {
    public static boolean isAnagrams(String x,String y){
        x=x.toLowerCase();
        y=y.toLowerCase();

        char a[]=x.toCharArray();
        char b[]=y.toCharArray();

        if(a.length!=b.length){
            return false;
        }

        int count[]=new int[256];

        for(int i=0;i< a.length;i++){
            count[a[i]-'a']++;
            count[b[i]-'a']--;
        }
        for(int i=0;i<256;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First String :");
        String x=sc.next();
        System.out.print("Enter Second String :");
        String y=sc.next();
        if(isAnagrams(x,y)){
            System.out.println(x+" and "+y+" are anagrams!");
        }else{
            System.out.println(x+" and "+y+" are not anagrams!");
        }
    }
}
