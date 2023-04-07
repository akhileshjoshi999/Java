package aray.programs;

public class twodarray {
    public static void main(String[] args) {
        int [][] arr={{23,34,45,456,56},{23,34,34,34,454},{231,3411,451,656,565,5334}};
        for(int i=0;i< arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}
