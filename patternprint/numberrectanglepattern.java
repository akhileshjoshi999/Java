package patternprint;

public class numberrectanglepattern {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=6;j++){
            if(j%2==0) {
                System.out.print("2");
            }else {
                System.out.print("1");
            }
        }
        System.out.println("");
    }
}}
