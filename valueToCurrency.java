import java.util.*;
import java.text.*;

//in this code we changed a amount into different currency format of different countries using numberformat , getCurrencyInstance methods
public class valueToCurrency {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("******** Value to Currency format Generator *********");
        System.out.println("======================================");
        int flag=0;
        do {
            System.out.println("\nSelect a option: ");
            System.out.println("1) Generate currency format");
            System.out.println("2) Exit");
            System.out.println();
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                String region;
                System.out.print("Enter amount: ");
                double payment = sc.nextDouble();
                System.out.print("Enter the region: ");
                region = sc.next();
                switch (region) {
                    case "US":
                        NumberFormat usformatter = NumberFormat.getCurrencyInstance(Locale.US);
                        String US = usformatter.format(payment);
                        System.out.println("Currency = " + US);
                        break;
                    case "India":
                        NumberFormat Informatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
                        String India = Informatter.format(payment);
                        System.out.println("Currency = " + India);
                        break;

                    case "China":
                        NumberFormat Cnformatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
                        String China = Cnformatter.format(payment);
                        System.out.println("Currency = " + China);
                        break;
                    case "France":
                        NumberFormat Frformatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                        String France = Frformatter.format(payment);
                        System.out.println("Currency = " + France);
                        break;
                    default:
                        System.out.println("Country currency yet not available!");

                }
            } else if (choice == 2) {
                flag=1;
                System.out.println("=====================");
                System.out.println("Thank you for coming!");
            }
        }while (flag==0);
    }
}
