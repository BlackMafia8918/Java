public class ReplaceDemo {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("She is not a good girl.");
        System.out.println(a);
        a.replace(22, 22, " but worse");
        System.out.println(a);
    }
}
