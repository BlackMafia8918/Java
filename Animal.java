// Abstract Method

/* 
abstract class Animal {
}

class Demoo {
    public static void main(String[] args) {
        Animal r = new Animal();
    }    
}
*/


abstract class Animal {}

class Dog extends Animal {}

class Dm {
    public static void main(String[] args) {
        Animal r = new Dog();
    }    
}
