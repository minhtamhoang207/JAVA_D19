package bai4;

public class Main {
    public static void main(String[] args) {
        OngChuThread ongChuThread = new OngChuThread();
        BaChuThread baChuThread = new BaChuThread();
        GiupViecThread giupViecThread = new GiupViecThread();
        try {
            giupViecThread.join();
            ongChuThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        baChuThread.start();
    }
}
