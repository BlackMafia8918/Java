public class Var {
    static void display (int num, String ... values){
        System.out.println("Number is: " + num);
        for (String s : values){
            System.out.println(s);
        } 
    }
    public static void main(String[] args) {
        display(500, "hello");
        display(1000, "I", "am", "Black Mafia");
    }
}
