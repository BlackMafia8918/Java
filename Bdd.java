class Ad extends Thread{
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("Tight ");
        }
    }    
}
class Bdd{
    public static void main(String[] args) {
        Ad t = new Ad();
        t.start();
        for (int i=0; i<=5; i++){
            System.out.println("Bhaukaal ");
        }
    }
}