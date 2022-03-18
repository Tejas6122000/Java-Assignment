// Create a resource called message ○Message will have text as the field and isEmpty as the condition○It has two synchronized functions read and write●Create a writer thread that writes resource●Create a reader thread that reads resource

class Message {
    private String text;
    private boolean isEmpty;

    public synchronized void read() {
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Reader reads: " + text);
        isEmpty = true;
        notifyAll();
    }

    public synchronized void write(String text) {
        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.text = text;
        isEmpty = false;
        notifyAll();
    }
}
public class q4 {
    public static void main(String[] args) {
        Message message = new Message();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                message.write("Message " + i);
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                message.read();
            }
        }).start();
    }
}



