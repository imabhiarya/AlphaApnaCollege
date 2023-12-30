public class SortingArrays {
    // ---> Bubble Sort
    public static void bubbleSortAlgo(int[] arr){
        for(int turn =0; turn<arr.length -1; turn++){
            for (int j = 0; j < arr.length -1- turn; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // print Array
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // Selection Sort
    public static void selectionSortAlgo(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sorting Algorithms");
        {
        // int[] arr = {5,4,1,3,2};
        // bubbleSortAlgo(arr);
        // printArr(arr);
        }
        // Selection Sort
        {
            int[] myArr ={3,5,7,8,4,2};
            selectionSortAlgo(myArr);
            printArr(myArr);
        }
    }
}
