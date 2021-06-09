package com.alexsgi.lang;

public class ArrayUtils {

    public static int getMaxValueIndex(int[] array) {
        if (array.length == 0 || array.length == 1) return 0;
        int max = array[0], index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMaxValueIndex(double[] array) {
        if (array.length == 0 || array.length == 1) return 0;
        double max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMaxValueIndex(byte[] array) {
        if (array.length == 0 || array.length == 1) return 0;
        byte max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMaxValueIndex(short[] array) {
        if (array.length == 0 || array.length == 1) return 0;
        short max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMaxValueIndex(float[] array) {
        if (array.length == 0 || array.length == 1) return 0;
        double max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMaxValueIndex(long[] array) {
        if (array.length == 0 || array.length == 1) return 0;
        long max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMinValueIndex(int[] array) {
        if (array.length == 0 || array.length == 1) return 0;
        int min = array[0], index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMinValueIndex(double[] array) {
        if (array.length == 0 || array.length == 1) return 0;
        double min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMinValueIndex(byte[] array) {
        if (array.length == 0 || array.length == 1) return 0;
        byte min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMinValueIndex(short[] array) {
        if (array.length == 0 || array.length == 1) return 0;
        short min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMinValueIndex(float[] array) {
        if (array.length == 0 || array.length == 1) return 0;
        float min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMinValueIndex(long[] array) {
        if (array.length == 0 || array.length == 1) return 0;
        long min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

}