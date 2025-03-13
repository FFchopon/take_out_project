package thread_learn;

public class ThreadCinema {
    public static void main(String[] args) {
        /*
        * 需求：
        * 电影院某影片共100张票，分3个窗口售票
        * */

        // 创建线程对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        // 设置窗口名
        t1.setName("窗口1");
        t1.setName("窗口2");
        t1.setName("窗口3");

        // 开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
