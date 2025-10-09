package Povtorenie_s_GPT.Potoki;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class FirstTread extends Thread {
    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Второстепенный  поток: шаг №" + i + " (" + Thread.currentThread().getName() + ")");
        }
        int n = 1;
        while (n <= 5) {
            System.out.println("Второстепенный поток: шаг №" + n);
            n++;
        }
    }
}

public class MainTread {
    public static void main(String[] args) {
        FirstTread ft = new FirstTread();
        ft.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Главный  поток: шаг №" + i + " (" + Thread.currentThread().getName() + ")");
        }
    }

}

class FirstTread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Загрузка данных: " + i + "%");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Фоновый поток прерван!");
            }
        }
    }
}

class MainTread2 {
    public static void main(String[] args) {
        FirstTread1 ft = new FirstTread1();

        Thread t1 = new Thread(ft);
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Обработка данных: " + i + "%");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Основной поток прерван!");
            }
        }
    }
}


class DataLoader implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Загрузка данных: шаг" + i + "%");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Фоновый поток прерван!");
            }
        }
    }
}

class DataProcessor implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Обработка данных: шаг" + i + "%");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Фоновый поток прерван!");
            }
        }
    }
}

class DataSaver implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Сохранение данных: шаг" + i + "%");

            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Фоновый поток прерван!");
            }
        }
    }
}

class MultiThreadDemo {
    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(new DataLoader(), "loader");
        Thread t2 = new Thread(new DataProcessor(), "processor");
        Thread t3 = new Thread(new DataSaver(), "saver");

//        t1.start();
//        t1.join();
//        System.out.println();
//
//        t2.start();
//        t2.join();
//        System.out.println();
//
//        t3.start();
//        t3.join();

        t1.start();
        t2.start();
        t3.start();


        t1.join();
        System.out.println();
        t2.join(2000);
        System.out.println();
        t3.join(3000);
    }
}


class Taskers implements Runnable {
    private final int number;

    public Taskers(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Задача " + number + " начала работу (" + Thread.currentThread().getName() + ")");
        try {
            int delay = 200 + (int) (Math.random() * 400);
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            System.out.println("Задача " + number + " прервана");
        }
        System.out.println("Задача " + number + " завершена (" + Thread.currentThread().getName() + ")");
    }
}


class Main1 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i < 10; i++) {
            executor.execute(new Taskers(i));
        }

        executor.shutdown();

        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("Главный поток завершён");

    }
}


class WorkTasks implements Runnable {
    private final int number;

    public WorkTasks(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Задача " + number + " начала работу (" + Thread.currentThread().getName() + ")");
        try {
            if (number == 5 || number == 10) {
                Thread.sleep(1500);
            } else {
                int delay = 300 + (int) (Math.random() * 300);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println("Задача " + number + " прервана");
        }
        System.out.println("Задача " + number + " завершена (" + Thread.currentThread().getName() + ")");
    }
}

class Main2 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i < 15; i++) {
            executor.execute(new WorkTasks(i));
        }
        executor.shutdown();

        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("Главный поток завершён");
    }
}