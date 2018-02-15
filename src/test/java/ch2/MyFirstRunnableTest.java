package ch2;

import org.junit.jupiter.api.Test;

class MyFirstRunnableTest {

    @Test
    void run() {
        Thread thread = new Thread(new MyFirstRunnable());
        thread.start();
    }
}