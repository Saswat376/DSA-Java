public class count {
    public static int countdigit(int n){
    //     int ctr=0;
    //    while (n>0) {
    //     ctr=ctr+1;
    //     n=n/10;

        int ctr=(int)(Math.log10(n)+1);
        //return ctr;
    //    }
       return ctr;}

    
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();//starttime
        
        int N=456789;
        System.out.println("The number N is :"+N);
        int digits=countdigit(N);
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        System.out.println("The number of digits in N are: "+digits);
         long endTime = System.currentTimeMillis();   // End time
        System.out.println("Execution time: " + (endTime - startTime) + " ms");

    }
    
}
