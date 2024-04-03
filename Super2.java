class Super2 {
    void show()
    {
        System.out.println("Hello Viewer");
    }
}

class InnerSuper2 extends Super2 {
    void show()
    {
        super.show();
        System.out.println("Hello Learn");
    }    
}

class Tess {
    public static void main(String[] args) {
        InnerSuper2 r = new InnerSuper2();
        r.show(); 
    }    
}