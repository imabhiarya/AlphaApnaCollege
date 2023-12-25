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
    public static void main(String[] args) {
        // Arrays
        // int marks[] = new int[4];
        int marks1[] = {1,3,5,6};

        // updateArray(marks1);

        // ---> Linear Search
        int[] num = {1,5,4,7,8,6,0,9,5,23,5,46,678,89};
        int key = 46;
        int index = linearSearch(num, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else{
            System.out.println("Value is at index : " + index);
        }

    }
}
