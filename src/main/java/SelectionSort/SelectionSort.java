package SelectionSort;

import Base.AbstractSorting;

public class SelectionSort extends AbstractSorting {

    public SelectionSort(boolean debugMode) {
        super(debugMode);
    }

    @Override
    public String getSortName() {
        return "Selection Sort";
    }

    @Override
    protected void doSorting(int[] unsortedArray) {

        for (int i = 0; i < unsortedArray.length; i++) {

            int minimumIndex = i;
            for (int j = i; j < unsortedArray.length; j++) {

                int min = unsortedArray[minimumIndex];
                int val = unsortedArray[j];

                if(val < min) {
                    minimumIndex = j;
                    min = val;
                }
            }

            if(minimumIndex != i) {
                int cur = unsortedArray[i];
                int min = unsortedArray[minimumIndex];

                unsortedArray[i] = min;
                unsortedArray[minimumIndex] = cur;
            }
        }

    }

}
