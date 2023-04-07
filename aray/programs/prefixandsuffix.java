package src.aray.programs;

public class prefixandsuffix {
    public static int sumarray(int arr[]){
        int sum=0;
        for (int i=0;i<arr.length;i++){
           sum=sum+arr[i];
    }
return sum;
    }
public static boolean equalsumpartition(int[] arr){
        int sum=sumarray(arr);
        int prefixsum=0;
        for (int i =0;i<arr.length;i++){
             prefixsum=prefixsum+arr[i];
           int  suffixsum=sum-prefixsum;
           if(prefixsum==suffixsum) {
               return true;
           }
        }
return false;
    }
    public static void main(String[] args) {
    int arr[]={1,1,1,1,1,5};
        System.out.println(sumarray(arr));
equalsumpartition(arr);
        System.out.println(equalsumpartition(arr));
    }    }