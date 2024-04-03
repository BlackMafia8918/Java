class AaA {
    void fun() {
        System.out.println("Hello Ranger");
        class BbB {
            void fun1() {
                System.out.println("Hello Adesh");
                if (true) {
                    class CcC {
                        void fun2() {
                            System.out.println("hello Yadav");
                        }
                    }
                    CcC obb = new CcC();
                    obb.fun2();
                }
            }
        }
        BbB obj1 = new BbB();
        obj1.fun1();
    }
public class Test2{
    public static void main(String[] args) {
        AaA obj = new AaA();
        obj.fun();
    }
}
}