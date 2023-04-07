package src.aray;

import java.util.Scanner;

public class freqarray {
        public static int[] makefrequencyarray(int[] arr) {
            int[] freq = new int[10000];

            for(int i = 0; i < arr.length; ++i) {
                ++freq[arr[i]];
            }

            return freq;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size of array");
            int total = sc.nextInt();
            int[] arr = new int[total];
            System.out.println("enter array");

            for(int i = 0; i < total; ++i) {
                arr[i] = sc.nextInt();
            }

            int[] freq = makefrequencyarray(arr);
            System.out.println("enter queries");

            int q = sc.nextInt();
               while(q>0)
            {
                System.out.println("enter number  to be searched");
                int x = sc.nextInt();
                if (freq[x] > 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                    q--;
                }
            }

        }
    }


