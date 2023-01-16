package QuickSort;

import Base.AbstractSorting;

public class QuickSort extends AbstractSorting {

    public QuickSort(boolean debugMode) {
        super(debugMode);
    }

    @Override
    protected void doSorting(int[] unsortedArray) {
        quickSort(unsortedArray, 0, unsortedArray.length -1);
    }

    private void quickSort(int[] array, int left, int right) {
        if(left >= right) return;

        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);

        quickSort(array, left, index - 1);
        quickSort(array, index, right);
    }

    private int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if(left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }

    @Override
    protected String getSortName() {
        return "Quick Sort";
    }
}
