
import java.util.Scanner;



public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a=sc.nextLine();
        String reverse=new StringBuilder(a).reverse().toString();
        if(a.equals(reverse)){
            System.out.println("the string is a palindrome");
        }else{
            System.out.println("The sting is not a palindrome");
        }
    }
    
}
