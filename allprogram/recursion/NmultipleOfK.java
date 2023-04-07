package src.allprogram.recursion;

public class NmultipleOfK {
    public static void multi(int n,int k){
        if(k==0)
            return;
        multi(n,k-1);//recursive work
        System.out.println(n*k);//self work

    }

    public static void main(String[] args) {

        multi(5,4);
    }
}
