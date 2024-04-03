class Studd{
    int rollno;
    String name;
    String city;

    Studd(int rollno, String name, String city){
        this.rollno = rollno;
        this.name = name;
        this.city = city; 
    }

    public static void main(String[] args) {
        Studd s1 = new Studd(101, "Binod", "Ghaziabad");
        Studd s2 = new Studd(102, "Rahul", "Delhi");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}