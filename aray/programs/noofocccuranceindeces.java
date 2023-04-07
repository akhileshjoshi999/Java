package aray.programs;

public class noofocccuranceindeces {

    public static void main(String[] args) {
        int  index = -1;
        int x=34;
        int arr[]={2,3,2,2,34,43,3,2};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                index = i;
        }
        System.out.println(index);
    }

}
