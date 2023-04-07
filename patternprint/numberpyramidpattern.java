package patternprint;

import java.util.Scanner;

public class numberpyramidpattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        for(int i=1;i<=row;i++){
            //for spaces below code
            for(int j=1;j<=row-i;j++) {
                System.out.print(" ");
            }

for(int k=1;k<=i;k++) {
    System.out.print(k);
}
for(int l=i-1;l>=1;l--){
    System.out.print(l);
}
                System.out.println("");
            }
        }
    }

