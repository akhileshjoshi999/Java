package src.allprogram;

public class Break {
    public static void main(String[] args) {
       home: for(int i=0;i<11;i++){
            if(i==5)
                break home;
            System.out.println(i);
        }
    }
}
