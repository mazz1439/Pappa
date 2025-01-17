class Piatto {
    private int bocconi; 
    private final int capacitaMassima;

    public Piatto(int capacitaMassima) {
        this.bocconi = 0;
        this.capacitaMassima = capacitaMassima;
    }

    public synchronized void aggiungiBoccone() throws InterruptedException {
        while (bocconi == capacitaMassima) {
            System.out.println("Piatto pieno, il padre aspetta...");
            wait(); 
        }
        bocconi++;
        System.out.println("Il padre ha preparato un boccone. Bocconi nel piatto: " + bocconi);
        notifyAll();
    }

    public synchronized void consumaBoccone() throws InterruptedException {
        while (bocconi == 0) {
            System.out.println("Piatto vuoto, il bambino aspetta...");
            wait();
        }
        bocconi--;
        System.out.println("Il bambino ha mangiato un boccone. Bocconi rimasti: " + bocconi);
        notifyAll(); 
    }
}