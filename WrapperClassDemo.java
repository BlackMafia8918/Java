public class WrapperClassDemo {
    public static void main(String[] args){
        String text1 = "101";
        String text2 = "34";
        String text3 = "5.5";
        String text4 = "-35.593933";
        String text5 = "93593933";

        System.out.println(Byte.valueOf(text1));
        System.out.println(Short.valueOf(text2));
        System.out.println(Integer.valueOf(text1));
        System.out.println(Float.valueOf(text3));
        System.out.println(Double.valueOf(text4));
        System.out.println(Long.valueOf(text5));
    }
}
