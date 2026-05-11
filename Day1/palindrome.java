
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string or a number:");
        String a=sc.nextLine();
        String revese=new StringBuilder(a).reverse().toString();

        if(a.equals(revese)){
            System.out.println("Entered string is a palindrome");
        }
        else{
            System.out.println("Entered string is NOT a palindrome");
        }

        
    }
}
