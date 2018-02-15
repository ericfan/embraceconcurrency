package ch2;

import org.junit.jupiter.api.Test;

class MyFirstThreadGroupTest {

    @Test
    void run() {
        ThreadGroup threadGroup = new ThreadGroup("SystemGroup");
        Thread t1 = new Thread(threadGroup, new MyFirstThreadGroup(),"thread1");
        Thread t2 = new Thread(threadGroup, new MyFirstThreadGroup(),"thread2");
        t1.start();
        t2.start();
        System.out.println(threadGroup.activeCount());
        threadGroup.list();
    }
}