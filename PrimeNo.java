import java.util.Scanner;

public class PrimeNo {
    public static boolean isPrime(int n){
        if (n == 2) {
            return true;
        }
        for(int i =2; i< n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int n){
        for (int i = 2; i <= n; i++) {
            boolean val = isPrime(i);
            if (val) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    } 
    public static int binToDecimal(int binNum){
        int pow = 0;
        int decNum = 0;
        while (binNum>0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum /10; 
        }
        return decNum;
    }
    public static int decToBinary(int decNum){
        int binNum = 0;
        int pow = 0;
        while (decNum> 0) {
              int rem = decNum % 2;
              binNum = binNum + rem * (int)Math.pow(10, pow);
              pow++;
               decNum = decNum/2;
        }
        return binNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print all Prime in Range");
        System.out.println(isPrime(3));
        // System.out.print("Enter the Range : ");
        // primeInRange(sc.nextInt());
        int binNum = 101;
        System.out.println("Decimal Num For " + binNum + " : " + binToDecimal(binNum));

        int decNum = 7;
        System.out.println("Binary Num for " + decNum + " : " + decToBinary(decNum));

        sc.close();
    }
}
