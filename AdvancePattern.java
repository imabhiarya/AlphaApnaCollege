import java.util.Scanner;

public class AdvancePattern {
    public static void floydsTriangle(int num){
        int count = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    // 0-1 Triangle
    public static void Triangle0_1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 ==0) {
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    // ButterFly Pattern
    public static void butterFlyPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // for (int j = 1; j < n-i + 1; j++) {
            //     System.out.print(" ");
            // }
            for (int j = 1; j <= 2*(n-i); j++) {  // 2 will remove
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }
        // 2nd Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*(i-1); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=(n-i)+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Hollow Rectangle
        // System.out.println("Enter Rows : ");
        // int a = sc.nextInt();
        // System.out.println("Enter Cols : ");
        // int b = sc.nextInt();
        // for (int i = 1; i <= a; i++) {
        //     for (int j = 1; j <= b; j++) {
        //         if ((i == 1 || j==1) || (i == a || j == b)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // ----->  INVERTED ROTATED HALF PYRAMID

            // System.out.println("Enter Rows : ");
            // int rows = sc.nextInt();
            // //outer loop
            // for (int i = 1; i <= rows; i++) {
            //     // Inner Loop
            //     for (int j = i; j < rows; j++) {
            //         System.out.print(" ");
            //     }
            //     for (int j = 1; j <= i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

        // -------->  INVERTED HALF PYRAMID WITH NUMBERS
        // int num = 5;
        // for (int i = 1; i <= num; i++) {
        //     for (int j = 1; j <= num - i + 1; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // floydsTriangle(5);

        // Triangle0_1(5);

        butterFlyPattern(8);

        sc.close();
    }
}
