package aray.programs;

public class foreachloopprinteven {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,7,8};
        for(int a:arr){
            if(arr[a]%2==0){
                System.out.println(arr[a]);
            }
        }
    }
}
