// Method Overriding
// Always prints the output from the sub class as its overridden


class Shape {
    void draw()
    {
        System.out.println("Can't say a shape");
    }    
}
class Square extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Square Shape");
    }
}

class Demmo {
    public static void main(String[] args) {
        Shape r = new Square();
        r.draw();
    }   
}