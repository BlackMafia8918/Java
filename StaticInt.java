interface Inte {
    public void Show(){
        System.out.println("cannot override static methods");
    }
}
class Stat implements Inte{
    @Override
    public static void Show(){
        System.out.println("Errors");
    }
}
class Inter 
{
    public static void main(String[] args) {
        Inte.Show();
        Stat s = new Stat();
        s.Show();
    }
}