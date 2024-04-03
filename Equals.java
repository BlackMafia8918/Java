// Java Objects - Equals()
class Equals {
    static int a = 10, b = 30;
    int c;
    Equals()
    {
        System.out.println("Addition of 10 and 20: ");
        c = a+b;
        System.out.println("Answer: " + c);

    }
    public static void main(String[] args) {
        System.out.println("1st object created");
        Equals o1 = new Equals();
        System.out.println("2nd object created");
        Equals o2 = new Equals();
        System.out.println("Objects are equal: " + o1.equals(o2));
        System.out.println("Objects are equal: " + o1.equals(o1));
    }
}


WAP to find the area and perimeter of a rectangle
