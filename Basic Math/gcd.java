public class gcd{
    public static int gcd(int n1, int n2){
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2 % n1;
            }
            if(n1==0){
                return n2; 
            }
            else{
                return n1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n1=24, n2=18;
        int gcd=gcd(n1, n2);
        System.out.println("The gcd of "+n1+" and "+n2+" is: "+gcd);
    }

}