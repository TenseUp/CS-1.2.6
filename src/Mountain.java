public class Mountain {

    public static boolean isIncreasing(int[] array, int stop) {
        for (int i = 0; i < stop; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] array, int start) {
        for (int i = start; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int getPeakIndex(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isMountain(int[] array) {
        int peakIndex = getPeakIndex(array);

        if (peakIndex == -1) {
            return false;
        }

        return isIncreasing(array, peakIndex) && isDecreasing(array, peakIndex);
    }
}