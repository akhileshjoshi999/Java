package src.allprogram.sortingAlgorithims;

public class SelectionSort {
    static void printarray(int[]arr) {
        for (int a : arr)
            System.out.println(a);
    }
public static void selectionsort(int []arr){
    for(int i=0;i<arr.length-1;i++){
        int min=i ,temp=0;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]) {
                min = j;
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }}}}
    public static void main(String[] args) {
        int []arr={1,3,2,5,6,4};
selectionsort(arr);
printarray(arr);

                }
            }
