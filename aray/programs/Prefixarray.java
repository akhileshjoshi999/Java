package src.aray.programs;

public class Prefixarray {
    public static void printarray(int []arr) {
        for (int i : arr)
            System.out.println(i);
    }
    public static int[] preficsum(int arr[]){//new array is forming from another array
        int n=arr.length;
        int ans[] =new int [n];
        ans[0]=arr[0];
        for (int i=1;i<arr.length;i++){
         ans[i]=ans[i-1]+arr[i];
        }

    return ans;
    }
public static void prefixarraywithoutextramemory(int arr[]){//same array is converting into prefix array
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("prefix using extra memory");
       int answer[]=preficsum(arr);
       printarray(answer);
       prefixarraywithoutextramemory(arr);
        System.out.println("array without extra memory");
       printarray(arr);

    }
}
