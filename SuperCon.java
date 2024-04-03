class SuperCon {
    SuperCon()
    {
        System.out.println("Hello Viewer");
    }
}

class InnerSuperCon extends SuperCon {
    InnerSuperCon()
    {
        System.out.println("Hello Learner");
    }    
}

class Tes {
    public static void main(String[] args) {
        InnerSuperCon r = new InnerSuperCon();
    }    
}