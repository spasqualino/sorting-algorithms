package InsertionSort;

import Base.AbstractBaseTest;
import Base.AbstractSorting;

class InsertionSortTest  extends AbstractBaseTest {
    @Override
    protected AbstractSorting getSorting() {
        return new InsertionSort(false);
    }
    @Override
    protected String expectedSortName() {
        return "Insertion Sort";
    }
}