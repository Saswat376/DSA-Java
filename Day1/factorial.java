
import java.util.Scanner;

// // This is the iterative method
// class factorial{
//     public static int factorial(int n){
//         int ans=1;
//         for(int i=1;i<=n;i++){
//             ans=ans*i;
//         }
//         return ans;
//     }


 class factorial{
    public static int factorial(int n){
        if(n==0){
            return 1;
        }

        return n*factorial(n-1);

}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print it's factorial: ");
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
    }
}