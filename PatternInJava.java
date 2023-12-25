public class PatternInJava {
    public static void main(String[] args) {
        // System.out.println("Print Star Pattern");

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Inverted Star
        // int n = 9;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= (n-i+1); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Half Pyramid

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        //  Print Character Pattern
        
        int n = 5;
        char c = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c +" ");
                c++;
            }
            System.out.println();
        }
        
    }
}
