package QuickSort;

import Base.AbstractBaseTest;
import Base.AbstractSorting;

class QuickSortTest extends AbstractBaseTest {
    @Override
    protected AbstractSorting getSorting() {
        return new QuickSort(false);
    }
    @Override
    protected String expectedSortName() {
        return "Quick Sort";
    }
}