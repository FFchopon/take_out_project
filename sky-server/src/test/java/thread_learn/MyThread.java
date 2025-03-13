package thread_learn;

public class MyThread extends Thread{

    // 表示这个类所有的对象，都共享ticket数据
    static int ticket = 0; // 0 - 99

//    // 锁对象，一定要是唯一的
//    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            // 同步代码块
            synchronized (MyThread.class) { // 字节码文件对象一定是唯一的
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票！！！");
                } else {
                    break;
                }
            }
        }
    }
}
