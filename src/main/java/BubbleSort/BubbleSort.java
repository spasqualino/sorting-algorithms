package BubbleSort;

import Base.AbstractSorting;

public class BubbleSort extends AbstractSorting {

    public BubbleSort(boolean debugMode){
        super(debugMode);
    }

    @Override
    public String getSortName() {
        return "Bubble Sort";
    }

    @Override
    protected void doSorting(int[] unsortedArray) {
        boolean swaped = false;
        do {
            swaped = false;
            for(int i = 1; i < unsortedArray.length; i++) {
                int prev = unsortedArray[i-1];
                int curr = unsortedArray[i];

                if(prev > curr) {
                    unsortedArray[i] = prev;
                    unsortedArray[i-1] = curr;
                    swaped = true;
                }
            }
        } while (swaped);
    }
}
