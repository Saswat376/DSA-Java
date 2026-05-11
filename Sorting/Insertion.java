public class Insertion {

    public static int[] insertion(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        //System.out.println(arr);
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={23,14,35,82,37,21};
        Insertion obj=new Insertion();
        System.out.println("Before insertion: ");
        for (Object array : arr) {
            System.out.print(array+" ");
        }
        System.out.println(" ");

        System.out.println("After insertion: ");
        arr=obj.insertion(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}