public class revarray {
    public static int[] Revarray(int[] arr){
        int n=arr.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[n-1-i];
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        revarray obj=new revarray();
        int[] reverse=obj.Revarray(arr);
        System.out.println("The reverse arrary is: ");
        for(int num:reverse){
            System.out.println(num+" ");
        }
        System.out.println();
    }
}
