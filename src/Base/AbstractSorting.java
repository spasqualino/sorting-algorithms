package Base;

import Util.ArrayPrinter;

import java.time.Duration;
import java.time.Instant;

public abstract class AbstractSorting {
    protected ArrayPrinter printer;
    protected boolean debugMode = false;

    public AbstractSorting() {
        this.printer = new ArrayPrinter();
    }

    public AbstractSorting(boolean debugMode) {
        this();
        this.debugMode = debugMode;
    }

    public int[] execute(int[] unsortedArray) {
        int[] internalArray = new int[unsortedArray.length];
        System.arraycopy(unsortedArray, 0, internalArray, 0, unsortedArray.length);

        if(debugMode)
            printer.print("Before: ", internalArray);

        Instant start = Instant.now();

        doSorting(internalArray);

        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);

        if(debugMode)
            printer.print("After: ", internalArray);

        System.out.println(getSortName() +  " - time in seconds: " + timeElapsed.getSeconds());

        return internalArray;
    }

    protected abstract void doSorting(int[] unsortedArray);

    protected abstract String getSortName();
}
