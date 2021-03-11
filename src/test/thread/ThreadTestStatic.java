package test.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadTestStatic {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    TestStatic.one();
                    TestStatic.two();
                }
            }
        };
        List<Thread> threads = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }
        while (true) {
            if (allThreadTerminated(threads)) {// 所有线程运行结束
                System.out.println("多线程运行结束(*￣︶￣)");
                break;
            }
        }
    }

    private static boolean allThreadTerminated(List<Thread> threads) {
        for (Thread thread : threads) {
            if (thread.isAlive()) {
                return false;
            }
        }
        return true;
    }
}
