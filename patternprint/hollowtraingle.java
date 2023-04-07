package patternprint;

public class hollowtraingle {
    public static void main(String[] args) {
        int j;
for(int i=1;i<=5;i++)
{
    for(j=1;j<=5-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=2*i-1;k++){
        if(i==1||i==5||k==1||k==2*i-1) {
            System.out.print("*");
        }else{
            System.out.print(" ");
        }

    }
    System.out.println("");
}
    }
}
