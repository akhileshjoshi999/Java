package src.aray.programs;

public class removeduplicatesusingextraspace {

    public static void printarry(int arr[]){
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=0)
            System.out.println(arr[i]);
    }

    public static int[] removewithextramemory(int arr[]){
        int temp[]=new int [arr.length];
        int j=0;
        for (int i=0;i<arr.length-1;i++) {
            if (arr[i] != arr[i+1])
                temp[j] = arr[i];
            j++;

        }
        temp[j]=arr[arr.length-1];
        return temp;
    }


    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,5,5,5};
        int tempp[]=removewithextramemory(arr);
        for(int i=0;i<tempp.length;i++)
            if(tempp[i]!=0)
            System.out.println(tempp[i]);
       printarry(tempp);

    }
}


