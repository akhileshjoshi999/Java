package aray.programs;

public class firstrepeatitiveelementusingvoidmethod {
        public static int repeatitive(int arr[]){
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j])
                        return arr[i];
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int arr []={1,4,6,1,5};
            repeatitive(arr);
            System.out.println("first repeatitive element->"+repeatitive(arr));


        }
    }


