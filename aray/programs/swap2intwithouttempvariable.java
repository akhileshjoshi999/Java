package aray.programs;

public class swap2intwithouttempvariable {
    public static void swaptwoint(int a,int b){
        a=a+b;//10
        b=a-b;//4
         a=a-b;//6
        System.out.println("values after swaping");
        System.out.println("a->"+a);
        System.out.println("b->"+b);

    }

    public static void main(String[] args) {
        swaptwoint(4,6);

    }
}
