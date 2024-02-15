public class DelDemo {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("She is not a good girl.");
        System.out.println(a);
        a.delete(0, 25);
        System.out.println(a);
    }
}
