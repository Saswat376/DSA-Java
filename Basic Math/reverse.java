
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        int rev=0;
        while(x>0){
            int a=x%10;
            rev=(rev*10)+a;
            x=x/10;
        }
        System.out.println("The reverse number is: "+rev);

        long sum=0;
        for(int i=0;i<1_000_000;i++){
            sum+=i;
        }
        long endTime=System.currentTimeMillis();
        System.out.println("Execution time: "+ (endTime-startTime)+" ms");
    }
    
}
