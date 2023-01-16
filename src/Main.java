import Base.AbstractSorting;
import BubbleSort.BubbleSort;
import InsertionSort.InsertionSort;
import QuickSort.QuickSort;
import SelectionSort.SelectionSort;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        boolean debugMode = false;
        int arraySize = 100000;

        int[] unsortedArray = IntStream.generate(() -> new Random().nextInt(arraySize)).limit(arraySize).toArray();

        ArrayList<AbstractSorting> sortingList = new ArrayList<AbstractSorting>();
        sortingList.add(new BubbleSort(debugMode));
        sortingList.add(new SelectionSort(debugMode));
        sortingList.add(new InsertionSort(debugMode));
        sortingList.add(new QuickSort(debugMode));

        for(AbstractSorting sorting : sortingList) {
            sorting.execute(unsortedArray);
        }

    }
}