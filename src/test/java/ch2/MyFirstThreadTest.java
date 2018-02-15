package ch2;

import org.junit.jupiter.api.Test;

public class MyFirstThreadTest {

    @Test
    public void test(){
        MyFirstThread thread = new MyFirstThread();
        thread.start();
    }
}
