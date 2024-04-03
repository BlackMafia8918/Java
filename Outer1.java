class Outer1 {
    static int data = 30;
    static class B{
        void msg(){
            System.out.println("Data is: " + data);
        }
    }
    public static void main(String[] args) {
        Outer1.B obj = new Outer1.B();
        obj.msg();
    }
}

