
import java.util.Scanner;

class Fibonacci{
    int a=0;
    int b=1;
    void fibonacci(int n){
        for(int i=0;i<=n;i++){
        int c=a+b;
        a=b;
        b=c;
        System.out.print(" "+c);
        }

    }
}

public class loopsncond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fibonacci f=new Fibonacci();
        System.out.println("Enter the range of fibonacci series: ");
        int n=sc.nextInt();
        f.fibonacci(n);

       

    }
}
