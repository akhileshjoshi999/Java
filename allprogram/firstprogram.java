package allprogram;

public class firstprogram {
    public static void main(String[] args) {
        int p=5, q=5 ,r=6;
        System.out.println("hello are u there ?");
        System.out.println(p==q);
        System.out.println(p!=q);
        System.out.println(p>=q);
        System.out.println(p<=q);
        System.out.println(p=q);
        System.out.println(p>q && p<q);
        System.out.println(p==q && p>r);
        System.out.println(p++);//5
        System.out.println(p);//6
        System.out.println(++q);//6
        System.out.println(q);//6
        int x=p++;
        int y=++q;
        System.out.println(x);//6
        System.out.println(y);//7
        System.out.println(p);//7
        System.out.println(q);//7
        System.out.println(p++);//7
        System.out.println(p);//8
        int z=p++;
        System.out.println(z);//8
        System.out.println(p);//9

    }
}
