package src.allprogram.sortingAlgorithims;

public class MergeSort {
    public static void printarray(int[] arr) {
        for (int a : arr)
            System.out.println(a);
    }

    public static void merge(int[] arr, int st, int end, int mid) {
        int n1 = mid - st + 1;
        int n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        //left or right me sorted values jayengi
        for (int i = 0; i < n1; i++) {
            left[i] = arr[st + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0, k = st;
        while (i < n1 && j < n2) {
            if (left[i] < right[j])
                arr[k++] = left[i++];
                // k++;i++;

            else
                arr[k++] = right[j++];
            // k++;j++;

        }
        while (i < n1) {
            //agar i piche reh gya h to baki ke sare element arr[k]me dal denge
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < n2) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }


    public static void mergesort(int []arr,int st, int end){
      if(st>=end)return;
       int mid=(st+end)/2;
        mergesort(arr,st,mid);
        mergesort(arr,mid+1,end);
        merge(arr,st ,end ,mid);
    }
    public static void main(String[] args) {
       int []arr={1,3,4,2,5,6};
       int n=arr.length;
        mergesort(arr,0,n-1);
        System.out.println("array after sorting ");
        printarray(arr);
    }
}
