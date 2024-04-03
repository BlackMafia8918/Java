interface Static {
    public static void Show() {
        System.out.println("Can not override static methods");
    }
}
class Testt{
    public static void main(String[] args) {
        Static.Show();
    }
}
