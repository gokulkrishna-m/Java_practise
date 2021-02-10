public class TestThread extends Thread
{
    public static void main(String[] args) {
        //Thread t1 = new Thread();
        TestThread t1 = new TestThread();
        t1.start();
    }
    public void run(){
        System.out.print("Running method");
    }
}
