package src.aray.programs;

public class removeduplicates {
    public static void printarry(int[] arr, int k){
        for(int i=0;i<k;i++)
            System.out.println(arr[i]);
    }

    public static int removed(int arr[],int n){
        int j=0;
        for (int i=0;i<n-1;i++) {
            if (arr[i] != arr[i+1]){
            arr[j] = arr[i];
            j++;
        }
        }
arr[j]=arr[n-1];
        return j;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,5,6};
        int n=arr.length;
        int j= removed(arr,n);

       // for(int i=0;i<j;i++)
         //   System.out.println(arr[i]);
        printarry(arr,j);
    }
}
