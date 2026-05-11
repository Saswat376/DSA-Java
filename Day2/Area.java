
import java.util.Scanner;

class Circle{
    
    void area(int radius){
        double ar= 3.14*(radius*radius);
        System.out.println("The area of the circle is : "+ ar);
    }

    void circumference(int radius){
        double circum=2*3.14*radius;
        System.out.println("The circumference of the circle is : "+circum);
    }
}

class Rectangle{
    void area(int l,int b){
        double ar=l*b;
        System.out.println("The area of the rectangle is: "+ ar);
    }

    void perimeter(int l, int b){
        double peri=2*(l+b);
        System.out.println("The perimeter of the rectangle is: "+ peri);
    }
}

class Cube{
    void tsa(int edge){
        double tsa=6*(edge*edge);
        System.out.println("The total surface area of the cube: "+tsa);
    }

    void volume(int edge){
        double vol=edge*edge*edge;
        System.out.println("The colume of the cube: "+vol);
    }
}
public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int radius=sc.nextInt();
        Circle c=new Circle();
        c.area(radius);
        c.circumference(radius);

        System.out.println("Enter the length: ");
        int l=sc.nextInt();
        System.out.println("Enter the breadth");
        int b=sc.nextInt();
        Rectangle rec=new Rectangle();
        rec.area(l, b);
        rec.perimeter(l, b);

        System.out.println("Enter the edge: ");
        int e=sc.nextInt();
        Cube cube=new Cube();
        cube.tsa(e);
        cube.volume(e);
        sc.close();


        
    }

    
}
