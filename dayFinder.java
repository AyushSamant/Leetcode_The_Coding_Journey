import java.util.Scanner;                        // for user input
import  java.time.LocalDate;                     //to represent a date without the time of the day
import java.time.format.DateTimeFormatter;       //For parsing date strings.

public class dayFinder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the date in the format(YYYY-MM-DD): ");
        String inputDate=sc.nextLine();

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");  //to define the format for parsing the input date.
        LocalDate date=LocalDate.parse(inputDate,formatter);                    //to convert the input string into a LocalDate object.

        String dayOfWeek=date.getDayOfWeek().toString();                        //method of the LocalDate class returns the day of the week as a DayOfWeek enum and to convert the DayOfWeek enum to a string using toString() for printing.
        System.out.println("The day of "+inputDate+" is :"+dayOfWeek);

    }
}
