import org.junit.*;
public class Task3_Tests extends Assert {
    @Test
    public void heapSort_GenerateNewHeapSort_CompareArrays(){
        HeapSort<Integer> sorter = new HeapSort<>();
        Integer[] array = {1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }
    @Test
    public void quickSort_GenerateQuickSort_CompareArrays(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }
    @Test
    public void quickSort_GenerateQuickSort_CompareArraysTwoPositions(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {3, 4};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{3, 4}, array);
    }
    @Test
    public void quickSort_GenerateQuickSort_CompareArraysThreePositions(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {3, 4, 5};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{3, 4, 5}, array);
    }
    @Test
    public void quickSort_GenerateQuickSort_SortTwoPositions(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }
    @Test
    public void quickSort_GenerateQuickSort_SortThreePositions(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {2, 1, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }
    @Test
    public void quickSort_GenerateQuickSort_SortFourReversedPositions(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {10, 9, 8, 7};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{7, 8, 9, 10}, array);
    }
    @Test
    public void quickSort_GenerateQuickSort_WithSimilarPositions(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {7, 4, 3, 4};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{3, 4, 4, 7}, array);
    }
    @Test
    public void mergeSort_GenerateMergeSort_CompareArrays(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }
    @Test
    public void mergeSort_GenerateMergeSort_CompareTwoPositions(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {7, 8};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{7, 8}, array);
    }
    @Test
    public void mergeSort_GenerateMergeSort_CompareThreePositions(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {5, 6, 7};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{5, 6, 7}, array);
    }
    @Test
    public void mergeSort_GenerateMergeSort_SortTwoPositions(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }
    @Test
    public void mergeSort_GenerateMergeSort_SortThreePositions(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {2, 1, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }
    @Test
    public void mergeSort_GenerateMergeSort_SortThreeReversedPositions(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {3, 2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }
    
}
