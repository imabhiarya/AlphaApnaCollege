public class ArraysJava {
    public static void updateArray(int[] arr){
        arr[0] = 100;
        arr[2] = 89;
        //print
        for (int i : arr) {
            System.out.print(i +",");
        }
    }

    // Linear Search
    public static int linearSearch(int[] arr, int val){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }
    // Largest Number in Array
    public static int largestNum(int[] arr){
        int maxVal = Integer.MIN_VALUE; // - infinity
        for (int i = 0; i < arr.length; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        // Arrays
        // int marks[] = new int[4];
        // int marks1[] = {1,3,5,6};

        // updateArray(marks1);

        // ---> Linear Search
        // int[] num = {1,5,4,7,8,6,0,9,5,23,5,46,678,89};
        // int key = 46;
        // int index = linearSearch(num, key);
        // if (index == -1) {
        //     System.out.println("Not Found");
        // } else{
        //     System.out.println("Value is at index : " + index);
        // }

        // --> Largest Number in an Array;
        {
            int number[] = {1,4,5,6,78,9,5,45,5,7,68,565,4};
            System.out.println("Largest Number in the Given Array is : "+largestNum(number));
        } 

    }
}
