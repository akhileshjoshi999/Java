package aray;

public class largestelement {
    public static int  maxvalue(int []arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (ans < arr[i]) {
                ans = arr[i];
    }
        }
    return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-1, -13, -34, -123, -54};
        int ans = maxvalue(arr);
        System.out.println(ans);
    }
        }
