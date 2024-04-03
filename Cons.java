class Cons {
    Cons(int a)
    {
        System.out.println("Hello Viewer " + a);
    }
}

class Const extends Cons {
    Const()
    {
        super(6000);
        System.out.println("Hello Learner ");
    }    
}

class Ts {
    public static void main(String[] args) {
        Const r = new Const();
    }    
}