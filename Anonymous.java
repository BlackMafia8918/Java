abstract class Person {
    abstract void eat();
}
class Pa{
    public static void main(String[] args) {
        Person p = new Person() {
            void eat(){
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}
