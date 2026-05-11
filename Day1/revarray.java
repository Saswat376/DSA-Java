public class revarray {
    public static int[] Revarray(int[] arr){
        for(int i=arr.length;i>=0;i++){
            System.out.println(arr);
        }

        return arr;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        revarray obj=new revarray();
        int[] reverse=obj.Revarray(arr);
    }
}
