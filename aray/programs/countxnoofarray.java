package aray.programs;

public class countxnoofarray {
   static int count=2;
    static int search=0;
    public static void noofx(int[]arr) {
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==count)

               search=search+1;

        }
    }

    public static void main(String[] args) {
        int arr[]={2,2,3,54,32,2,2,5};
noofx(arr);
        System.out.println(search);
        }

    }
