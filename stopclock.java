import java.util.Scanner;

public class Stopwatch {
    private long startTime;
    private long endTime;
    private boolean running;

    public void start() {
        startTime = System.currentTimeMillis();
        running = true;
        System.out.println("Stopwatch started...");
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        running = false;
        System.out.println("Stopwatch stopped.");
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = System.currentTimeMillis() - startTime;
        } else {
            elapsed = endTime - startTime;
        }
        return elapsed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stopwatch stopwatch = new Stopwatch();

        System.out.println("Type 'start' to begin and 'stop' to stop the stopwatch.");
        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("start")) {
                stopwatch.start();
            } else if (input.equals("stop")) {
                stopwatch.stop();
                long time = stopwatch.getElapsedTime();
                System.out.println("Elapsed time in milliseconds: " + time);
                break;
            } else {
                System.out.println("Invalid command. Please type 'start' or 'stop'.");
            }
        }

        scanner.close();
    }
}