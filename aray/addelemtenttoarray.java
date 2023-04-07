package aray;

import static java.lang.System.*;

public class addelemtenttoarray {
    public static void main(String[] args) {
        int ar[]={3,4,5,6,7,8};
        int ele=100;
        int pos=3;
        for(int i =ar.length-1;i>pos-1;i--) {
            ar[i] = ar[i - 1];
        }
            ar[pos-1]=ele;

      for(int a:ar){

      System.out.println(a);
        }
    }}

