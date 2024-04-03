class Shape {
    void draw()
    {
        System.out.println("Can't say a shape");
    }    
}
class Square extends Shape
{
    @Override
    void draw2()
    {
        System.out.println("Square Shape");
    }
}

class Demm {
    public static void main(String[] args) {
        Shape r = new Square();
        r.draw();
    }   
}