package allprogram;

import java.util.Scanner;

public class countvovels {
    public static void vovels(String s){
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='i'||ch=='o'||ch=='u' ||ch=='e'  ) {
                count = count + 1;
            }

        }
        System.out.println("no of vowels in setencesis :="+count);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sentences");
        String st= sc.nextLine();
        vovels(st);

    }

}
