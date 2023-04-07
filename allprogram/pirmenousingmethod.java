package allprogram;

import java.util.Scanner;

public class pirmenousingmethod{



        protected void prime(int n) {
        boolean flag = false;

        for (int i = 2; i <= n/2; i++) {//n/2 isliye likha a kyonki koi bhi no apne se adhe no se hi divide ho skta hai
            if (n % i == 0){
                flag = true;
            break;
        }}
        if (!flag) {
            System.out.println(n + ":is prime no");
        } else {
            System.out.println(n + ":is not prime no ");
        }
    }

    public static void main(String[] args) {
        pirmenousingmethod pm=new pirmenousingmethod();

        pm.prime(3);
        pm.prime(56);
        pm.prime(29);
        pm.prime(33);

    }


    }

