package src.aray.programs;

public class Binarysearch {
    public static void binary(int arr[]){
        int n=arr.length;
       int search=9;
       int li=0;
        int ri=n-1;
    int mi=(li+ri)/2;
  while(li<=ri){
        if(arr[mi]==search) {
            System.out.println("element is here" + search);
       break;

        }

        else if (search < arr[mi])
        {
          ri=mi-1;

        }
        else{
            li=mi+1;
        }
mi=(li+ri)/2;
    }
        }



    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        binary(arr);
    }
}
