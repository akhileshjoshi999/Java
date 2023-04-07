package allprogram;

public class breakstatement {
    public static void main(String[] args) {
        home:for(int i=0;i<=10;i++){
            //   break home;
            //                break statement is used to terminate the loop.
            // continue home;
            //                continue statement is used to skip the current iteration and jump to next one
            if(i%3==0) {
                break;
            }
            System.out.println(i);
        }
    }
}
