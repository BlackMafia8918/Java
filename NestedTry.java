class NestedTry {
    public static void main(String[] args) {
        try{
            try{3
                int a[] = {10,20,30};
                System.out.println(a[2]);
            }
            catch(ArrayIndexOutOfBoundsException a) {
                System.out.println(a);
            }
            System.out.println(10/0);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Learn");
    }
}
