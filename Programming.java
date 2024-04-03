/* 
create 1 abstract class Programming
name of abstract method is developer
class 1 HTML
class 2 Java
print the method developer in both the classes
*/


abstract class Programming {
    abstract void developer();   
}

class HTML{
    void developer(){
        System.out.println("HTML Developer");
    }
}

class Java{
    void developer(){
        System.out.println("Java Developer");
    }
}

class Programmer{
    public static void main(String[] args) {
        HTML h = new HTML();
        h.developer();

        Java j = new Java();
        j.developer();
    }
}