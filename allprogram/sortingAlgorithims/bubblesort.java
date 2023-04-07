package src.allprogram.sortingAlgorithims;

public class bubblesort {
    static void printarray(int[]arr){
        for(int a:arr)
            System.out.println(a);

    }
    static void bubblesortt(int []arr){
        for(int i=0;i<arr.length;i++){
            boolean flag=false;//check kr rhe h ki swaping ho rai h ki ni
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]) {
                    int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=true;
                }
            }
            if(flag==false)// agar swapping ni hori h to return kr jao
                return;
        }
    }
    public static void main(String[] args) {
        int []arr={5,1,6,2,4,3};
        bubblesortt(arr);
        printarray(arr);

    }
}
// time complexity of bubble sort is 0(n^2)and it is an stable sorting algo,it is inplace algo