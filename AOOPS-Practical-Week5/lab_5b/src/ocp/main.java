package ocp;



public class main {
    public static void main(String[] args) {
        
        Shape rectangle = new rectangle(5, 10);
        Shape circle = new circle(7);

       
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}

