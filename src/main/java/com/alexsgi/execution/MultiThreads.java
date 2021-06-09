package com.alexsgi.execution;

import java.util.ArrayList;

public class MultiThreads {

    private static ArrayList<Thread> list = new ArrayList<>();

    public static void createThreads(Runnable runnable, int amount) {
        clearThreads();
        for (int i = 0; i < amount; i++) {
            list.add(new Thread(runnable));
        }
    }

    public static void startThreads() {
        for (Thread thread : list) {
            thread.start();
        }
    }

    @Deprecated
    public static void stopThreads() {
        for (Thread thread : list) {
            thread.stop();
        }
    }

    public static void interruptThreads() {
        for (Thread thread : list) {
            thread.interrupt();
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
