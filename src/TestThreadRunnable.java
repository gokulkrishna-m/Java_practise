public class TestThreadRunnable implements Runnable {
    public static void main(String[] args) {
        TestThreadRunnable tr = new TestThreadRunnable();
        Thread t1 = new Thread(tr);
        t1.start();
    }
    public void run(){
        System.out.print("Run method is running");
    }
}
