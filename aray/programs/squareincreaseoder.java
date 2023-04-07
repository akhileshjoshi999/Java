package aray.programs;

import javax.imageio.stream.ImageInputStream;

public class squareincreaseoder {
    public static void printarray(int[] arr){
        for (int a:arr)
            System.out.println(a);
    }
    public static void printarray1(int[] anss) {
        for (int a : anss)
            System.out.println(a);
    }
    public static  int [] squareorder(int arr[]){
       int n=arr.length;
       int left=0;
       int right=n-1;
       int ans[]=new int[n];
       int a=0;
       while(left<=right)
       if(Math.abs(arr[left])>Math.abs(arr[right])) {
           ans[a++] = arr[left] * arr[left];
          // a++;
           left++;
       }
       else{
            ans[a++] = arr[right] * arr[right];
           // a++;
            right--;
        }


  return  ans;
    }
    public static void swap(int anss[],int l,int r){
        while(l<r){
            int temp=anss[l];
            anss[l]=anss[r];
            anss[r]=temp;
            l++;
            r--;
        }
    }
public static void reverse(int anss[]){
        int n=anss.length;
        swap(anss,0,n-1);

}
    public static void main(String[] args) {
        int arr[]={-12,-10,-14,3,5,23};
        int anss[]=squareorder(arr);

         printarray(anss);
        reverse(anss);
        System.out.println("reverse array->");
       printarray1(anss);
    }
}
