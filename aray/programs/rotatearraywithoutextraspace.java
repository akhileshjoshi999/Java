package aray.programs;

public class rotatearraywithoutextraspace {
    public static void printarray(int arr[]){
        for(int i:arr)
            System.out.println(i);
    }
    public static void swap(int arr[],int st,int end){
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
    }
    public static void rotate(int arr[],int st,int end){
        while(st<end) {
            swap(arr, st, end);
            st++;
            end--;
        }
    }
    public static void rotatearray(int arr[],int k){
       int  n=arr.length;
        k=k%n;
        rotate(arr,0,n-k-1);//reverse kr rha h 0se n-k-1 tak
        rotate(arr,n-k,n-1);//reverse kr rha h n-k se n-1 tak
        rotate(arr,0,n-1);//upr wale reverse ko phir se pura reverse kr rha h


    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
rotatearray(arr,3);
printarray(arr);
    }
}
