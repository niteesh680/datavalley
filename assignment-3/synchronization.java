class CustomCounter {
    private int count = 0;

    public synchronized void increase() {
        count++;
    }

    public synchronized void decrease() {
        count--;
    }

    public int getCountValue() {
        return count;
    }
}

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        CustomCounter customCounter = new CustomCounter();

        Thread thrA = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                customCounter.increase();
            }
        });

        Thread thrB = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                customCounter.increase();
            }
        });

        thrA.start();
        thrB.start();

        thrA.join();
        thrB.join();

        System.out.println("Final counter value: " + customCounter.getCountValue());
    }
}
