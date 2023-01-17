package SelectionSort;

import Base.AbstractBaseTest;
import Base.AbstractSorting;

class SelectionSortTest extends AbstractBaseTest {
    @Override
    protected AbstractSorting getSorting() {
        return new SelectionSort(false);
    }
    @Override
    protected String expectedSortName() {
        return "Selection Sort";
    }
}