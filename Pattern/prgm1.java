public class prgm1{
    public static void main(String []args) {
        long startTime=System.currentTimeMillis();
        int n=5;

        //Pattern 1
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //Pattern 2
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //Pattern 3
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
        System.out.println("");
        
        //Pattern 4
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
        System.out.println("");
        
        //Pattern 5
        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        //Pattern 6
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");

        //Pattern 7
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");

            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println(" ");

        //Pattern 8
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        //Pattern 9
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");

            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //Pattern 10
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        //Pattern 11
        int start=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                start=0;
            }
            else{
                start=1;
            }
            for(int j=0;j<i;j++){
            System.out.print(start);
            start=1-start;
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //Pattern 12
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //Pattern 13
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<+i;j++){
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //for calculating time
        int sum=0;
        for(int i=0;i<1_000_000;i++){
            sum +=i;
        }
        long endTime=System.currentTimeMillis();
        System.out.println("Execution time: "+(endTime-startTime)+" ms");
    }
}