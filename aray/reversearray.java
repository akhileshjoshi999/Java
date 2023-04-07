package aray;

public class reversearray {
    public static void printarray(int arr[]){
        for (int i:arr)
            System.out.println(i);
    }
    public static int[] reverse (int arr[]) {
     int n=arr.length;
     int ans[]=new int [n];
     int j=0;
     for (int i=n-1;i>=0;i--){
         ans[j++]=arr[i];//j++ ka mtlb h phle wo j[0]assign krega phir increase krega

        }
    return ans;
    }

    public static void main(String[] args) {
        int arr[]={11,23,4,5,6,6,7,8};
       int anss[]= reverse(arr);
       // for (int i =0;i< arr.length;i++)
        //System.out.println(anss[i]);
printarray(anss);
    }
}

