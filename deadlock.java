class ResourceA {
    // Representing ResourceA
}

class ResourceB {
    // Representing ResourceB
}

class Task1 implements Runnable {
    private final ResourceA resourceA;
    private final ResourceB resourceB;

    public Task1(ResourceA resourceA, ResourceB resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }

    @Override
    public void run() {
        synchronized (resourceA) {
            System.out.println("Task1 locked ResourceA");
            try {
                // Simulate some work with ResourceA
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (resourceB) {
                System.out.println("Task1 locked ResourceB");
                // Simulate work with both resources
            }
        }
    }
}

class Task2 implements Runnable {
    private final ResourceA resourceA;
    private final ResourceB resourceB;

    public Task2(ResourceA resourceA, ResourceB resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }

    @Override
    public void run() {
        synchronized (resourceB) {
            System.out.println("Task2 locked ResourceB");
            try {
                // Simulate some work with ResourceB
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (resourceA) {
                System.out.println("Task2 locked ResourceA");
                // Simulate work with both resources
            }
        }
    }
}

public class DeadlockSimulation {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();

        Thread thread1 = new Thread(new Task1(resourceA, resourceB));
        Thread thread2 = new Thread(new Task2(resourceA, resourceB));

        thread1.start();
        thread2.start();
    }
}
















