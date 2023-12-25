import java.util.Scanner;

public class MethodPractice {
    //Q1 Method
    public static int avgOfThree(int a, int b, int c){
        int avg = (a + b + c)/3;
        return avg;
    }
    // Q2
    public static boolean isEven(int a){
        if(a % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    // Q3 
    public static boolean palindromeCheck(int n){
        int num = n;
        int newNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            newNum = newNum * 10 + lastDigit;
            num = num / 10;
        }
        if (newNum == n) {
            return true;
        }
        return false;
    }
    // Q5.
    public static int sumOfDigit(int n){
        int sum = 0;
        while (n>0) {
        int lastDigit = n % 10;
        sum = sum + lastDigit;
        n = n/10;
        }
        return sum;
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Method Practice Question

        // Q1
        // System.out.println("Enter Three Num : ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // System.out.println("Average of Three Num " + a + " ," + b + " ," + c + " : " + avgOfThree(a, b, c));

        // Q2 
        // System.out.println("Enter the Number");
        // int num = sc.nextInt();
        // System.out.println("Number is Even : " + isEven(num));

        // Q3. 
        // System.out.println("Enter the ");
        // int num = sc.nextInt();
        // System.out.println("Entered Num is Palindrome : " + palindromeCheck(num));

        // Q4.
        // Math Classs
     {
        // int a =89;
        // int b = 98;
        // System.out.println("Math.min : " + Math.min(a, b));
        // System.out.println("Math.max : " + Math.max(a, b));
        // System.out.println("Math.sqrt : " + (int)Math.sqrt(25) );
        // System.out.println("Math.pow : " + (int)Math.pow(5, 3));
        // // System.out.println("Math.avg : " + Math.avg()); not defined in Math class
        // System.out.println("Math.abs : " + Math.abs(-89.45));
    }
        // Q5 sum of digits of an integer
        {
            // System.out.println("Sum of Digit 456 : " + sumOfDigit(456));
        }



        sc.close();
    }
}
