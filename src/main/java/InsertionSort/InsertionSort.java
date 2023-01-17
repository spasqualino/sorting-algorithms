package InsertionSort;

import Base.AbstractSorting;

public class InsertionSort extends AbstractSorting {

    public InsertionSort(boolean debugMode) {
        super(debugMode);
    }

    @Override
    protected void doSorting(int[] unsortedArray) {

        for (int u = 0; u < unsortedArray.length; u++) {
            int unsorted = unsortedArray[u];

            for (int s = u - 1; s >= 0; s--) {
                int sorted = unsortedArray[s];

                if(sorted > unsorted)
                    unsortedArray[s + 1] = sorted;

                if (sorted < unsorted)
                    break;

                unsortedArray[s] = unsorted;
            }
        }
    }

    @Override
    public String getSortName() {
        return "Insertion Sort";
    }
}
