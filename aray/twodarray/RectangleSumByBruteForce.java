package src.aray.twodarray;

public class RectangleSumByBruteForce {
    public static void rectanglesum(int [][]arr,int l1,int l2,int m1,int m2){
       int sum=0;
        for(int i=l1;i<=l2;i++)
            for (int j=m1;j<=m2;j++){
              sum+=arr[i][j];
            }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        rectanglesum(arr,0,1,0,2);
    }
}
