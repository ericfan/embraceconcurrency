package ch2;

public class InterruptedThread implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println(System.currentTimeMillis());
            //如果检测到中断标志，退出循环
            if(Thread.currentThread().isInterrupted()){
                System.out.println("I'm done!!!!!!!!!!");
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                //InterruptedException会清除中断标志，需要手工添加中断标志
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }
}
