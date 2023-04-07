package src.allprogram.recursion;

public class factorialOfNo {
    public static int factorial(int n) {
        if (n == 0){
            return 1;
    }
       //  factorial(n-1);
      //  int ans=n*factorial(n-1);
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
