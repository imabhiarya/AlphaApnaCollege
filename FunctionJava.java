public class FunctionJava {

    public static int sumOfTwo(int a, int b){ // parameter or formal parameter
            int sum = a + b;
            return sum;
    }
    public static int sumOfTwo(float a, float b){ // method overloading
        int sum = (int)(a + b);
        return sum;
    }
    public static void swap(int a, int b){
        int temp = a;
        a= b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int product(int a , int b){
        int product = a * b;
        return product;
    }

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int binCoefficient(int n, int r){
            int nFact = factorial(n);
            int rfact = factorial(r);
            int nmrFact = factorial(n - r);
            int binCoef = nFact/(rfact*nmrFact);
            return binCoef;
    }
    public static void main(String[] args) {
        System.out.println("Learning Function");
        System.out.println(sumOfTwo(5, 7)); // Actual parameter or Argument
        int a =4,b=5;
        swap(4, 5);
        System.out.println("Product of a and b : " + product(a, b));

        System.out.println("Factorial : " + factorial(5));

        System.out.println("Binomial Coefficient : " + binCoefficient(5, 2));

        // Method Overloading
        System.out.println("sum of int : " + sumOfTwo(4, 7));
        System.out.println("sum  of float : " + sumOfTwo(5.6f, 3.4f));

    }
}
