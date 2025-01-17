public class Main {
    public static void main(String[] args) {
        Piatto piatto = new Piatto(10); 

        Papa papa = new Papa(piatto);
        Bambino bambino = new Bambino(piatto);

        Thread threadPadre = new Thread(papa);
        Thread threadBambino = new Thread(bambino);

        threadPadre.start();
        threadBambino.start();
    }
}
