package allprogram;

public class methodsandconstructor {
    int a;
    int b;
    methodsandconstructor(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("process:");
    }


    int substract(){
        return a-b;
    }
    int add(){
        return a+b;
    }
    int multi(){
        return a*b;
    }


}
class main{
    public static void main(String[] args) {
        methodsandconstructor em=new methodsandconstructor(12,13);

        System.out.println(em.add());

        System.out.println(em.multi());

        System.out.println(em.substract());
    }
}