class Super {
    int a = 10;
}
class InnerSuper extends Super {
    int a = 20;
    void show()
    {
        System.out.println(a);
        System.out.println(super.a);
    }    
}
class Te{
    public static void main(String[] args) {
        InnerSuper r = new InnerSuper();
        r.show();
    }    
}