package aray.programs;

public class firstrepeatitiveelement {
    public static void repeatitive(int[] arr){
        int ans=0;
    for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]) {
            ans=arr[i];
        }
    }
    }
if(ans==1)
    System.out.println("print first repeatitive item->"+ans);
else
    System.out.println("-1");

    }

    public static void main(String[] args) {
        int arr []={1,4,6,9,5};
        repeatitive(arr);




    }
}
