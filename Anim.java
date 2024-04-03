abstract class Anim {
    abstract void sound();
}
class Dog extends Anim{   
    public void sound()
    {
        System.out.println("Dog is barking.");
    }
}
class Lion extends Anim{   
    public void sound()
    {
        System.out.println("Lion roars.");
    }
}

class Dmo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Lion l = new Lion();
        d.sound();
        l.sound();
    }    
}


/*
class Anim {}
class Dog1 extends Anim{   
    public static void main(String[] args)
    {
        Dog1 d = new Dog1();
        System.out.println(d instanceof Dog);
    }
}
      
class Dog2 {
    public static void main(String[] args) {
        Dog2 d = null;
        System.out.println(d instanceof Dog2);
    }
}
*/