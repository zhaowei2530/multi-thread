package test.thread;

public class TestStatic {
    static volatile int i = 0, j = 0;
    static void one() {
        i++;
        j++;
    }
    static void two() {
        if (i != j) {
            System.out.println("假 i=" + i + " j=" + j);
            // 正常退出
            System.exit(0);
        }
        if (i == j) {
            System.out.println("真 i=" + i + " j=" + j);
        }
    }
}
