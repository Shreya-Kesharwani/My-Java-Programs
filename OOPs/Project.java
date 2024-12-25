package OOPs;
import java.util.*;

//Non object-oriented version
/* 
class Square
{
    float length;
    float area;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of square : ");
        length = scan.nextFloat();
    }

    public void compute()
    {
        area = length*length;
        
    }

    public void disp()
    {
        System.out.println("The area of square is : "+area);
    }
}

class Rectangle
{
    float length;
    float breadth;
    float area;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of square : ");
        length = scan.nextFloat();
        System.out.println("Enter the breadth of rectangle : ");
        breadth = scan.nextFloat();
    }

    public void compute()
    {
        area = length*breadth;
        
    }

    public void disp()
    {
        System.out.println("The area of rectangle is : "+area);
    }
}

class Circle
{
    float radius;
    float area;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of circle : ");
        radius = scan.nextFloat();
    }

    public void compute()
    {
        area = 3.141f * radius * radius;
        
    }

    public void disp()
    {
        System.out.println("The area of circle is : "+area);
    }
}

class Project{
    public static void main(String[] args){
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        s.acceptInput();
        s.compute();
        s.disp();

        r.acceptInput();
        r.compute();
        r.disp();

        c.acceptInput();
        c.compute();
        c.disp();
    }
}

*/


//Object oriented version-

abstract class Shape
{
    float area;
    abstract public void acceptInput();
    abstract public void compute();

    public void disp()
    {
        System.out.println("The area is : "+area);
    }
}

class Square extends Shape
{
    private float length;
   

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of square : ");
        length = scan.nextFloat();
    }

    public void compute()
    {
        area = length*length;
        
    }

}

class Rectangle extends Shape
{
    private float length;
    private float breadth;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of square : ");
        length = scan.nextFloat();
        System.out.println("Enter the breadth of rectangle : ");
        breadth = scan.nextFloat();
    }

    public void compute()
    {
        area = length*breadth;
        
    }

  
}

class Circle extends Shape
{
    float radius;
    

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of circle : ");
        radius = scan.nextFloat();
    }

    public void compute()
    {
        area = 3.141f * radius * radius;
        
    }

}

class Geometry
{
    public void permit(Shape ref)
    {
        ref.acceptInput();
        ref.compute();
        ref.disp();
    }
}
class Project{
    public static void main(String[] args){
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        Geometry g = new Geometry();
        g.permit(s);
        g.permit(r);
        g.permit(c);
        
        

      
    }
}