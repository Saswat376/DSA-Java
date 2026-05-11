
import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Pricipal amount:");
        float p=sc.nextFloat();
        System.out.println("Enter the rate of interest:");
        float r=sc.nextFloat();
        System.out.println("Enter the time in months:");
        int t=sc.nextInt();
        float i=(p*r*t)/100;
        System.out.println("The simple intrest is: "+i);
    }
}
