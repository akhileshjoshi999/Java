package src.allprogram.sortingAlgorithims;

public class InsertionSort {
    static void printrarray(int []arr){
        for(int a:arr)
            System.out.println(a);
    }
    static void insertionsort(int []arr){

        for(int i=1;i<arr.length;i++){
           int j=i;// i and j are two pointers
             while(j>0&&arr[j]<arr[j-1]) {
                 int temp = arr[j];
                 arr[j] = arr[j - 1];
                 arr[j - 1] = temp;
                 j--;
             }
        }
    }
    public static void main(String[] args) {
        int []arr={5,1,6,2,4,3};
        insertionsort(arr);
        printrarray(arr);
    }
}
