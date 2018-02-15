package ch2;

public class MyFirstThreadGroup implements Runnable {

    @Override
    public void run() {
        String tgn = Thread.currentThread().getThreadGroup().getName() + "-" + Thread.currentThread().getName();
        while(true){
            System.out.println(tgn);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
