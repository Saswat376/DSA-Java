public class selection {
    public static void selection(int[] arr){
        int n=arr.length;

        //For traversal through array
        for(int i=0; i<=n-1; i++){
            int minindex=i;

            for(int j=i+1; j<=n-1; j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }

            //Swapping to first place after sorting
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }

        System.out.println("The sorted array is: ");
        //Printing each element
        for(int num:arr){
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr={25, 78, 34, 11, 47, 3};
        System.out.println("The array before sorting: ");
        for(int num:arr){
            System.out.print(num + " ");
        }
        System.out.println(" ");
        //Calling the function
        selection(arr);
    }
}
