package src.allprogram;

public class febonacciUsingMethod {
    public static void printfebo(int n){
        int a=0,b=1;
        for(int i=0;i<n;i++){
        int c=a+b;
        System.out.println(c);
        a=b;
        b=c;
    }}
    public static void main(String[] args) {
        printfebo(5);

    }
}
