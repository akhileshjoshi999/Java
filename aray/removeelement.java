package aray;

public class removeelement {
    public static void main(String[] args) {
int del=34;
        int ar[]={23,34,45,455,57};
        for(int i=0; i<ar.length;i++){
            if(del==ar[i]) {
                for (int j = i; i < ar.length - 1; i++) {
                    ar[i] = ar[i + 1];
                }

            }
}
        for(int i=0; i<ar.length-1;i++)
            System.out.println(ar[i]);
        }
    }

