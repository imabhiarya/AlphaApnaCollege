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
        int minVal = Integer.MAX_VALUE; // + infinity
        for (int i = 0; i < arr.length; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
            if (minVal> arr[i]) {
                minVal = arr[i];
            }
        }
        System.out.println("Min Val : " + minVal);
        return maxVal;
    }
    // Binary Search using Iterative
    public static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = (start + end)/2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (key > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }
    // Reverse the Array
    public static void reverseArray(int[] arr){
     int first = 0;
     int last = arr.length -1;
     while (first < last) {
        //swap
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;

        first++;
        last--;
     }   
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
            // int number[] = {1,4,5,6,78,9,5,45,5,7,68,565,4};
            // System.out.println("Largest Number in the Given Array is : "+largestNum(number));
        } 
        // Binary Search
        {
            // int[] myArr = {1,2,3,4,5,6,7,8,9,11,34,55,65,66,87,98};
            // int val = binarySearch(myArr, 87);
            // if (val>=0) {
            //     System.out.println("Index is " + val +" and Value is " + myArr[val]);
            // } else{
            //     System.out.println("Not Found");
            // }
        }
        // Reverse an Array
        {
            int[] myArr = {2,4,6,8,9};
            reverseArray(myArr);
            // --->  print
            for (int i = 0; i < myArr.length; i++) {
                System.out.print(myArr[i] + " ");
            }
        }
    

    }
}
