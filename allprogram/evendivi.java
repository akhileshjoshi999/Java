package allprogram;

import java.util.Scanner;

public class evendivi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int s=sc.nextInt();
//        if(s%2==0&&s%3==0) {
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }
  /*  String ans;
    ans=(s%2==0&&s%3==0)? "even":"odd";
       System.out.println(ans);
   */
    if(s%3==0||s%5==0){
        System.out.println("divisible");
    }
    }

}
