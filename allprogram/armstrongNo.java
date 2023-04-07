package src.allprogram;

import java.util.Scanner;

public class armstrongNo {
    public static int armstrong(int n) {
        int ans = 0, sum =0, digit=0,temp=n;
while(temp>0){
    temp=temp/10;
    digit++;
}
temp=n;
            while (temp != 0) {
                ans = temp % 10;
                sum += Math.pow(ans, digit);
                temp = temp / 10;
            }
    return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
    int sum=armstrong(n);
      System.out.println(sum);
      if(sum==n)
           System.out.println("number is armstrong no");
       else
          System.out.println("no is not armstrong no");



    }}

