package allprogram;

public class continueusingwhile {
    public static void main(String[] args) {
       int i=1;
       home: while(i<12){
            if(i%5==0){
                i++;
                continue home;
            }
            System.out.println(i);
            i++;
        }
    }
}
