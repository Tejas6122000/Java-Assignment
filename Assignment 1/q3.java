public class q3 {
    public static void main(String[] args){
        Thread thread1 = new Thread(new fetchData(), "thread1");
        Thread thread2 = new processData("thread2");
        thread1.start();
        try
        {
            thread1.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
        thread2.start();
        try
        {
            thread2.join();
        }

        catch(Exception ex)
        {
            System.out.println("Exception has been" +
                                    " caught" + ex);
        }
    }

}

class fetchData implements Runnable {

    @Override
    synchronized public void run() {
        System.out.println("STARTING "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ENDING "+Thread.currentThread().getName());
    }
}


class processData extends Thread {

    public processData(String name) {
        super(name);
    }

    @Override
    synchronized public void run() {
        System.out.println("STARTING "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ENDING "+Thread.currentThread().getName());
    }

}