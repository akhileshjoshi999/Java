package allprogram;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int es=s.nextInt();
//        if(es%2==0) {
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }
String ans;
ans=( es%2==0)? "even":"odd";
        System.out.println(ans);
    }
}
