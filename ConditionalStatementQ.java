import java.util.Scanner;

public class ConditionalStatementQ {
    public static void main(String[] args) {
        // Write a Java program to get a number from the user and print whether it is
        // positive or negative.

        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if (num>= 0) {
        // System.out.println("Positive");
        // }
        // else{
        // System.out.println("Negative");
        // }

        // Q2

        // double temp = 103.5;
        // if (temp>100) {
        // System.out.println("You have Fever");
        // }
        // else{
        // System.out.println("You don't have Fever");
        // }

        // Q3

        // int weekDay = sc.nextInt();
        // switch (weekDay) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Number Between 1 - 7");
        //         break;
        // }

        // Q5 Leap Year

            int year = sc.nextInt();
            if ((year%4) == 0) {
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not Leap Year");
            }
            

        sc.close();
    }
}
