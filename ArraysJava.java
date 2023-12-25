public class ArraysJava {
    public static void updateArray(int[] arr){
        arr[0] = 100;
        arr[2] = 89;
        //print
        for (int i : arr) {
            System.out.print(i +",");
        }
    }
    public static void main(String[] args) {
        // Arrays
        // int marks[] = new int[4];
        int marks1[] = {1,3,5,6};

        updateArray(marks1);

    }
}
