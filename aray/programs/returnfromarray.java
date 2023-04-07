package aray.programs;

import java.util.Arrays;

public class returnfromarray {
    public static int[]retary(int arr[]){
        Arrays.sort(arr);


        int[]ans={arr[0],arr[arr.length-1]};
return ans;

    }

    public static void main(String[] args) {
        int arr[]={12,23,34,23,12,23,23,11};

      int[] ans= retary(arr);

        System.out.println(ans[0]);
        System.out.println(ans[1]);


    }
}
