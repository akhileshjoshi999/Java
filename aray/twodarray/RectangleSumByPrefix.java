package src.aray.twodarray;

public class RectangleSumByPrefix {
    public static void prefixofmatrix(int arr[][])
    {
        for (int i=0;i<arr.length;i++)
            for (int j=1;j<arr[0].length;j++)//colum ko kaise nikalte hai?-jitne element row me honge utne hi column present honge row me
                arr[i][j] += arr[i][j - 1];
    }
public static int rectannglesum(int arr[][], int l1, int l2, int m1,int m2){
        int sum=0;
        prefixofmatrix(arr);
        for(int i=l1;i<=l2;i++){
            if(m1>=1)
            sum+=arr[i][m2]-arr[i][m1-1];
            else
                sum+=arr[i][m2];
        }

    return sum;
    }

    public static void main(String[] args) {
        int arr [][]={{1,2,3},{4,1,1,},{1,1,1,}};
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr.length;j++)
        System.out.print(arr[i][j]+" ");
        System.out.println("print rectangle sum");
        int sum=rectannglesum(arr,0,2,0,2);
        System.out.println(sum);
    }
}
