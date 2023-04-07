package src.allprogram.recursion;

public class febonacci {
    public static int febo(int n){
        if (n==0||n==1)
            return n;
    //    int a=febo(n-1);
//        int b=febo(n-2);
       return febo(n-1)+febo(n-2);
       }
    public static void main(String[] args) {
        // System.out.println(febo(6));
    for(int i=0;i<=10;i++) {
        System.out.println(febo(i));
    }
    }
}
