class Bambino implements Runnable {
    private final Piatto piatto;

    public Bambino(Piatto piatto) {
        this.piatto = piatto;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep((int) (Math.random() * 1000));
                piatto.consumaBoccone();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}