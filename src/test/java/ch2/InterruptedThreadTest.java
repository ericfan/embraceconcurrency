package ch2;

import org.junit.jupiter.api.Test;

class InterruptedThreadTest {

    @Test
    void run() throws InterruptedException {
        Thread t1 = new Thread(new InterruptedThread());
        //开启被测试线程
        t1.start();
        //当前线程停止执行20ms
        Thread.sleep(20);
        //然后中断被测试线程
        t1.interrupt();
    }
}