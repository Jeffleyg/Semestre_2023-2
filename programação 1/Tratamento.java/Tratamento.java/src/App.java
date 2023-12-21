public class App {
    public static void main(String[] args) {

        Caneta c1 = new Caneta("BIC", 0.5f, "Marrom", true);

        c1.status();
        Caneta c2 = new Caneta("Zaa", 9.9f, "vermelho", false);
        c2.status();

    }
}
