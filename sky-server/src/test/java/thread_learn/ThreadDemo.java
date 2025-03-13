package thread_learn;

public class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread t1 = new Thread(myRunnable, "飞机");
        Thread t2 = new Thread(myRunnable, "坦克");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.setPriority(Thread.MAX_PRIORITY);    // 10
        t2.setPriority(Thread.MIN_PRIORITY);    // 1

        System.out.println(Thread.currentThread().getPriority());

        t1.start();
        t2.start();
    }
}
