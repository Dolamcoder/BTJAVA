package BT2Thread;

public class QuayVe implements Runnable{
    private String quayVe;

    public QuayVe(String quayVe) {
        this.quayVe = quayVe;
    }

    @Override
    public void run() {
        while (true){
            synchronized (BanVe.lock){
                if(BanVe.soVeCon > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }

                    int tickerNumber = BanVe.soVe - BanVe.soVeCon;
                    tickerNumber++;
                    BanVe.soVeCon--;

                    System.out.println(String.format("Quay %s da ban ve so %d. con lai %d ve", quayVe, tickerNumber, BanVe.soVeCon));
                }else {
                    break;
                }
            }

            // coi thoi gian giua cac lan ban
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println("Quay "+quayVe + " da dong cua");
    }
}
