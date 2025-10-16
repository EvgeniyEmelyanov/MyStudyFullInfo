package Povtorenie_s_GPT.Potoki;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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

class Loader implements Runnable {
    private final int fileNumber;

    public Loader(int fileNumber) {
        this.fileNumber = fileNumber;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Файл file_" + fileNumber + ".jpg загружается... (шаг " + i + ")");

            try {
                int delay = 200 + (int) (Math.random() * 400);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("Загрузка файла file_" + fileNumber + " прервана");
            }
        }
        System.out.println("Файл file_" + fileNumber + ".jpg загружен! ✅");
    }
}

class Main3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Thread t = new Thread(new Loader(i), "loader-" + i);
            t.start();


        }
    }
}

class Loader1 implements Runnable {
    private final int stepNumber;

    public Loader1(int stepNumber) {
        this.stepNumber = stepNumber;

    }

    @Override
    public void run() {
        for (int i = 1; i <= stepNumber; i++) {
            System.out.println("Загрузка данных: шаг " + i);
            try {
                int delay = 300 + (int) (Math.random() * 300);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("Загрузка данных: шаг " + i + " прервана");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("Данные в шаге " + stepNumber + " загружены!✅");

    }
}

class Processor1 implements Runnable {
    private final int stepNumber;

    public Processor1(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= stepNumber; i++) {
            System.out.println("Обработка данных: шаг " + i);

            try {
                int delay = 300 + (int) (Math.random() * 300);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("Обработка данных: шаг " + i + " прервана");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("Данные в шаге " + stepNumber + " обработаны!✅");

    }
}

class Saver implements Runnable {
    private final int stepNumber;

    public Saver(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= stepNumber; i++) {
            System.out.println("Сохранение данных: шаг " + i);

            try {
                int delay = 300 + (int) (Math.random() * 300);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("Сохранение данных: шаг " + i + " прервана");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("Данные в шаге " + stepNumber + " сохранены!✅");

    }
}

class Main4 {
    private static void runBatch(Thread[] threads) throws InterruptedException {
        for (Thread t : threads) t.start();
        for (Thread t : threads) t.join();
    }

    public static void main(String[] args) throws InterruptedException {
/*        final int STEPS = 3;
        for (int i = 1; i <= 3; i++) {

            Thread t = new Thread(new Loader1(STEPS), "loader-" + i);
            t.start();
            t.join();

            Thread t1 = new Thread(new Processor1(STEPS), "processor-" + i);
            t1.start();
            t1.join();

            Thread t2 = new Thread(new Saver(STEPS), "saver-" + i);
            t2.start();
            t2.join();

        }*/

        final int STEPS = 5;


        Thread[] loaders = new Thread[STEPS];
        for (int i = 0; i < STEPS; i++) {
            loaders[i] = new Thread(new Loader1(STEPS), "loader-" + (i + 1));
        }
        runBatch(loaders);
        System.out.println("[main] Все загрузчики завершены\n");

        Thread[] processors = new Thread[STEPS];
        for (int i = 0; i < STEPS; i++) {
            processors[i] = new Thread(new Processor1(STEPS), "processor-" + (i + 1));
        }
        runBatch(processors);
        System.out.println("[main] Все процессоры завершены\n");


        Thread[] savers = new Thread[STEPS];
        for (int i = 0; i < STEPS; i++) {
            savers[i] = new Thread(new Saver(STEPS), "saver-" + (i + 1));
        }
        runBatch(savers);
        System.out.println("[main] Все сохранители завершены ✅");


    }
}


class ComputeThread implements Runnable {
    private final List<Integer> result;
    private final int number;


    public ComputeThread(List<Integer> result, int number) {
        this.result = result;
        this.number = number;
    }

    @Override
    public void run() {
        int value;
        for (int i = 1; i <= number; i++) {
            value = i * i;

            System.out.println("[compute] add " + i + " -> " + value + " (" + Thread.currentThread().getName() + ")");

            synchronized (result) {
                result.add(value);

            }

            try {
                int delay = 200 + (int) (Math.random() * 200);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("[compute] interrupted");
                return;
            }
        }
        System.out.println("[compute] done (" + Thread.currentThread().getName() + ")");

    }
}

class ProgressThread implements Runnable {
    private final int number;
    private final int intervalMs;

    public ProgressThread(int number, int intervalMs) {
        this.number = number;
        this.intervalMs = intervalMs;
    }


    @Override
    public void run() {
        for (int i = 1; i <= number; i++) {
            System.out.println("[progress] идёт работа… (" + i + "/" + number + ") ["
                    + Thread.currentThread().getName() + "]");

            try {
                Thread.sleep(intervalMs);
            } catch (InterruptedException e) {
                System.out.println("[progress] interrupted on tick " + i);
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("[progress] done [" + Thread.currentThread().getName() + "]");
    }
}

class WriteThread implements Runnable {
    private final List<Integer> result;
    private final File outFile;

    public WriteThread(List<Integer> result, File outFile) {
        this.result = result;
        this.outFile = outFile;
    }

    @Override
    public void run() {

        List<Integer> snapshot;
        synchronized (result) {
            snapshot = new ArrayList<>(result);
        }

        System.out.println("[writer] start, items=" + snapshot.size() + " ["
                + Thread.currentThread().getName() + "]");

        try (PrintWriter pw = new PrintWriter(new FileWriter(outFile))) {
            for (Integer item : snapshot) {
                pw.println(item);
            }
            System.out.println("[writer] saved to " + outFile.getName() + " ["
                    + Thread.currentThread().getName() + "]");
        } catch (IOException e) {
            System.out.println("[writer] error: " + e.getMessage());
        }
    }
}


class Main5 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> results = new ArrayList<>();

        Thread compute = new Thread(new ComputeThread(results, 10), "compute");
        Thread progress = new Thread(new ProgressThread(10, 300), "progress");
        Thread writer = new Thread(new WriteThread(results, new File("writer.txt")), "writer");

        compute.start();
        progress.start();


        compute.join();
        writer.start();

        progress.join();
        writer.join();

        System.out.println("[main] all done");
    }

}


class PipeLineWorker implements Runnable {
    private final int id;
    private final int steps;


    public PipeLineWorker(int id, int steps) {
        this.id = id;
        this.steps = steps;
    }

    @Override
    public void run() {

        //load
        for (int i = 1; i <= steps; i++) {
            System.out.println("[" + id + "] load: шаг " + i + " (" + Thread.currentThread().getName() + ")");


            try {
                int delay = 200 + (int) (Math.random() * 400);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("[" + id + "] load interrupted");
                Thread.currentThread().interrupt();
                return; // завершаем всю цепочку
            }
        }
        System.out.println("[" + id + "] load is done");

        //process
        for (int i = 1; i <= steps; i++) {
            System.out.println("[" + id + "] process " + i + " (" + Thread.currentThread().getName() + ")");

            try {
                int delay = 200 + (int) (Math.random() * 400);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("[" + id + "] process interrupted");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("[" + id + "] process is done");

        //save
        for (int i = 1; i <= steps; i++) {
            System.out.println("[" + id + "] save [" + i + "] (" + Thread.currentThread().getName() + ")");

            try {
                int delay = 200 + (int) (Math.random() * 400);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("[" + id + "] save interrupted");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("[" + id + "] save is done");

    }
}

class Main6 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new PipeLineWorker(1, 3), "pipe-1");
        Thread t2 = new Thread(new PipeLineWorker(2, 3), "pipe-2");
        Thread t3 = new Thread(new PipeLineWorker(3, 3), "pipe-3");

        t1.start();
        t2.start();
        t3.start();


        Thread.sleep(600);
        System.out.println("[main] interrupt pipe-2");
        t2.interrupt();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("[main] all done");
    }
}
