import java.util.Scanner;

public class LoopInJava {
    public static void main(String[] args) {
        // while loop
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int counter = 0;
        // while (counter<num) {

        // System.out.println(counter);
        // counter++;
        // }

        // int num = sc.nextInt();
        // int count = 1;
        // int sum = 0;
        // while (num>=count) {
        // sum = sum + count;
        // count++;
        // }
        // System.out.println("Total Sum is :" + sum);

        // for (int i = 0; i < num; i++) {
        // for (int j = 0; j < num; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // reverse of a Num

        // int n = 10899;
        // int rev = 0;
        // while (n>0) {
        // int lastDig = n%10;
        // rev = (rev*10) + lastDig;
        // n = n/10;
        // }
        // System.out.println(rev);

        // Keep entering numbers till user enters the multiple of 10

        // while (true) {
        // System.out.print("Enter Num :");
        // int n = sc.nextInt();
        // if ((n % 10) == 0) {
        // break;
        // }
        // }

        // Display all num entered by user except multiple of 10
        // int count = 1;
        // while (count < 10) {
        // System.out.print("Enter Num : ");
        // int n = sc.nextInt();
        // if ((n % 10) == 0) {
        // continue;
        // }
        // count++;
        // System.out.println(n + " and count is " + count);
        // }

        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 2) {
            isPrime = true;
        } else {

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }

            }
        }

        if (isPrime == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();
    }
}
