package lang;

public class ArrayUtils {

    // Max

    public static int getMaxIndex(int[] array) {
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

    public static int getMaxIndex(double[] array) {
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

    public static int getMaxIndex(byte[] array) {
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

    public static int getMaxIndex(short[] array) {
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

    public static int getMaxIndex(float[] array) {
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

    public static int getMaxIndex(long[] array) {
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

    // Min

    public static int getMinIndex(int[] array) {
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

    public static int getMinIndex(double[] array) {
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

    public static int getMinIndex(byte[] array) {
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

    public static int getMinIndex(short[] array) {
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

    public static int getMinIndex(float[] array) {
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

    public static int getMinIndex(long[] array) {
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