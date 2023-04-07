package aray.programs;

public class swap2integers {
    public static void  swap(int a ,int b){
int temp=a;
a=b;
b=temp;

       System.out.println("values after swaping");
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {

       int a=5;
       int b=6;
        swap(a,b);


    }
}
