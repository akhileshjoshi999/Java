package aray.programs;

public class sortarrayof0and1 {
    public static void printarray(int []arr){
        for (int a:arr)
            System.out.println(a);
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void reverse(int arr[]){
        int n=arr.length;
       int left=0;
       int right=n-1;
while(left<right){
        if (arr[left]==1&&arr[right]==0) {
            swap(arr, left, right);
            left++;
            right--;
        }
         if(arr[left]==0) {
             left++;
         }
         if(arr[right]==1)
             right--;
        }
        }



    public static void main(String[] args) {
        int arr[]={1,0,0,0,0,1,0,1,0,0,0,1,1,1};
        reverse(arr);
        printarray(arr);

    }
}

