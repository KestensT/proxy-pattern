public class ProxyPatternImplementation {

    public static void main(String[] args) {
        Message message = new ProxyMessage("Mario Kart is boring", "Dauchy");

   message.display();
        System.out.println("");
    }
}
