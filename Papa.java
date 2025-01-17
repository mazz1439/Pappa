class Papa implements Runnable {
    private final Piatto piatto;

    public Papa(Piatto piatto) {
        this.piatto = piatto;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep((int) (Math.random() * 1000));
                piatto.aggiungiBoccone();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}