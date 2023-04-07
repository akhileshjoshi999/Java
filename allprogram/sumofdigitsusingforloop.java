package allprogram;

public class sumofdigitsusingforloop {
    public static void main(String[] args) {
      int n=2345; int sum=0;int digit=0;
       for(int i=0;n>0;n=n/10){
           digit=n%10;
           sum=sum+digit;
//sum=sum+n%10;

       }
        System.out.println(sum);
    }
}
