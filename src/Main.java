public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(3,"red");
        System.out.println(circle);
        System.out.println("Area Circle="+circle.getArea());
        Cylinder cylinder=new Cylinder(4,"blue",6);
        System.out.println(cylinder);
        System.out.println("Volume Cylinder="+cylinder.getVolume());
    }
}
