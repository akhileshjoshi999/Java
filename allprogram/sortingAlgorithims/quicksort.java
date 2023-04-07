package src.allprogram.sortingAlgorithims;

public class quicksort {
    public static void printarray(int[] arr) {
        for (int i: arr) System.out.println(i);
    }

    public static void swap(int[] arr, int x, int y ) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y]=temp;
    }
public static int partition(int []arr,int st ,int end) {
    int pivot = arr[st];
    int count = 0;
    for (int i = st + 1; i <= end; i++) {
        if (arr[i] <= pivot) {
            count++;
        }
    }
    int pivotidx = st + count;
    swap(arr, st, pivotidx);
    int i = st, j = end;
    while (i < pivotidx && j > pivotidx) {
    while (arr[i] <= pivot)
        i++;
    while (arr[j] > pivot)
        j--;
    if (i < pivotidx && j > pivotidx)
        swap(arr, i, j);
        i++;
j--;
    }
return pivotidx;
}
    public static void quicksortt(int[] arr, int st, int end) {
        if(st>=end)
            return;
        int pi=partition(arr,st , end);
        quicksortt(arr,st,pi-1);
        quicksortt(arr, pi+1,end);

    }


    public static void main(String[] args) {
        int []arr={6,3,8,5, 7,6,4};
        int n=arr.length;
        System.out.println("array before sorting ");
                printarray(arr);
        System.out.println("array after sorting");
        quicksortt(arr,0,n-1);
        printarray(arr);
    }
}
