package aray;

import java.util.Arrays;

public class copyarray {
    public static void copyarry(int[]arr){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        int arr[]={12,43,344,456,57};
        int arr2[]=arr.clone();
       //  arr2=Arrays.copyOf(arr,3);
       // System.out.println("copyof method");
       //  copyarry(arr2);
        // arr2=Arrays.copyOfRange(arr,2,5);
        //System.out.println("copy of range method");
        //copyarry(arr2);

        arr[0]=1;// arr me change krne pr arr2 me change ni hoga clone method ki wajah se
        System.out.println("original array");
        copyarry(arr);
        System.out.println("copied array");
        copyarry(arr2);



    }

}
