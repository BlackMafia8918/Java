class Stu {
    int id;
    String name;    
}

class Student {
    public static void main(String[] args) {
        Stu t1 = new Stu();
        t1.id = 101;
        t1.name = "Binod";
        System.out.println(t1.id + "   " + t1.name);
    }    
}
