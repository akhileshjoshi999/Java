package aray;

public class reversearray2 {
    public static void printarray(int []arr){
        for (int a:arr)
            System.out.println(a);
    }
    public static void swap(int arr[],int i,int j){
       while(i<j) {
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
    }
public static void rotate(int arr[]){
int n=arr.length;
        swap(arr,0,n-1);

    }
// int i=0;int j=n-1;//parameters ni dene pe aise likhenge

    public static void main(String[] args) {
        int arr[]={9,2,3,4,1};
        rotate(arr);
printarray(arr);

    }
}
