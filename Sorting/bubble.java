public class bubble {
    public static void bubble(int[] arr){
        int n=arr.length;
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }            
            }
        }
            
        public static void main(String[] args) {
        int[] arr={1, 4, 3, 2, 5};

        System.out.println("Array before sorting: ");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println("");

        bubble(arr);
        System.out.println("The sorted array is:");
            for(int num:arr){
                System.out.print(num+" ");
    }               
    }}
