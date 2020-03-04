package execution;

import java.util.ArrayList;

public class MultiThreads {

    private static ArrayList<Thread> list = new ArrayList<>();

    public static void createThreads(Runnable runnable, int amount) {
        for (int i = 0; i < amount; i++) {
            list.add(new Thread(runnable));
        }
    }

    public static void startThreads() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).start();
        }
    }

    @Deprecated
    public static void stopThreads() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).stop();
        }
    }

    public static void interruptThreads() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).interrupt();
        }
    }

    public static void clearThreads() {
        interruptThreads();
        list = new ArrayList<>();
    }

    public static int getThreadAmount() {
        return list.size();
    }

}
