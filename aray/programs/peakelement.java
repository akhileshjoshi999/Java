package aray.programs;

public class peakelement {
    public static void main(String[] args) {
        int []arr={23,34,45,56,27,78};
        for(int a=1;a<arr.length-1;a++)
            if(arr[a-1]<arr[a]&&arr[a]>arr[a+1]){
                System.out.println(arr[a]);
            }
        }
    }

