package allprogram;

public class smallestnoamongthree {
   public void min(int a, int b, int c){
       if (a<b &&a<c)
           System.out.println(a);
       else if(b<c)
       System.out.println(b);
       else
           System.out.println(c);
    }

    public static void main(String[] args) {
        smallestnoamongthree am=new smallestnoamongthree();
        am.min(23,45,5);
    }
}
