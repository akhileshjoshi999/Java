package src.aray.programs;

public class minimumelement {
    public static void sabsechotaelement(int []arr){
       int ans=arr[0];

        for(int a=0;a<arr.length;a++) {

            if (ans >arr[a])
                ans = arr[a];
        }

    }
    public static void main(String[] args) {

        int arr []={13,22,34,45,234,12,23,3,33,};
        sabsechotaelement(arr);
    }
}


