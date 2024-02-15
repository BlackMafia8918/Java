class A0{
    void add (int... a){
        int sum = 0;
        for (int x:a){
            sum = sum + x;
        }
        System.out.print("Sum of numbers: " + sum + "\n");
    }
}
class Demo{
    public static void main (String[] args){
        A0 r = new A0();
        r.add();         // Passing a single number
        r.add(10);         // Passing a single number
        r.add(10, 20);       // Passing multiple numbers
    }    
}