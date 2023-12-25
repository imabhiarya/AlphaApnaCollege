import java.util.Scanner;

public class LoopQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Loops Question ");
        // Write a program that reads a set of integers,and then prints the sum of the
        // even and odd integers

        
        // int num;
        // int choice;
        // int evenSum = 0;
        // int oddSum = 0;
        // do {
        //     System.out.println("Enter the Number ");
        //     num = sc.nextInt();
        //     if (num % 2 == 0) {
        //         evenSum += num;
        //     } else {
        //         oddSum += num;
        //     }

        //     System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
        //     choice = sc.nextInt();
        // } while (choice == 1);

        // System.out.println("Sum of Even Number is : " + evenSum);
        // System.out.println("Sum of Odd num is : " + oddSum);


        // Write a program to find the factorialof any number entered by the user
        
        // int num = sc.nextInt();
        // int fact =1;
        // for (int i = 1; i <= num; i++) {
        //     fact = fact * i;
        // }
        // System.out.println(fact);

        // Write a program to print the multiplication table of a number N,entered by the user.

        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i +" = "+ (num*i) );
        }

        


        sc.close();
    }
}
