abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    //this abstract class should be defined in the subclasses
    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a,double b) {
        super(a,b);
    }

    double area() {
        System.out.println("Inside the area of Rectangle");
        return dim1*dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a,b);
    }

    double area() {
        System.out.println("Inside the area of Triangle");
        return dim1*dim2/2;
    }
}

class AbsractAreas {
    public static void main(String args[]) {

        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);

        Figure fs;

        fs = r;
        System.out.printf("Area is (%.2f*%.2f) = %.2f\n",fs.dim1,fs.dim2,fs.area());
        fs = t;
        System.out.printf("Area is (%.2f*%.2f)/2 = %.2f\n",fs.dim1,fs.dim2,fs.area());

    }
}
