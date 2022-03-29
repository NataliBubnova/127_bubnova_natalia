import org.junit.*;
public class Task2_Tests extends Assert {
    @Test
    public void bubbleSort_ArrayContainsOnlyNumbersOne_ArrayHasNotChanged (){
        BubbleSort<Integer> sorter = new BubbleSort<>();

        MyComparator comparator = new MyComparator() {
            @Override
            public int compare(Object first, Object second) {
                return 0;
            }
        };

        Integer[] myArray = {1,2,3};
        sorter.sort(myArray, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }

    class SomeComparator implements MyComparator<Integer>{
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }
    @Test
    public void bubbleSort_GenerateMyBubbleSort_TryToSortVariousNumbers(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {3, 1, 2};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }
    @Test
    public void bubbleSort_GenerateBubbleSort_ToSortLongerArrayWithVariousNumbers(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {3, 2, 1, 7, 5};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 5, 7}, myArray);
    }
    @Test
    public void bubbleSort_GenerateBubbleSort_CompareSameArrays(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {1, 1, 1, 1};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 1, 1, 1}, myArray);
    }
    @Test
    public void bubbleSort_GenerateBubbleSort_CompareSmallArrays(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {2};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{2}, myArray);
    }
    @Test
    public void insertionSort_GenerateInsertionSort_CompareSameArrays(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {1, 2, 3};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }
    @Test
    public void insertionSort_GenerateInsertionSort_CompareSmallArrays(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {1};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1}, myArray);
    }
    @Test
    public void insertionSort_GenerateInsertionSort_SortVariousNumbers(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {2, 3, 1, 5};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 5}, myArray);
    }
    @Test
    public void selectionSort_GenerateSelectionSort_CompareSameArrays(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1, 2, 3};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }
    @Test
    public void selectionSort_GenerateSelectionSort_CompareSmallArrays(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1}, myArray);
    }
    @Test
    public void selectionSort_GenerateSelectionSort_SortArray(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1, 3, 2};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }
    @Test
    public void selectionSort_GenerateSelectionSort_SortLargeArray(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1, 3, 2, 10, 5, 7, 4};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 7, 10}, myArray);
    }
    @Test
    public void selectionSort_GenerateSelectionSort_CompareLargeArrays(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1, 2, 3, 4, 5, 6, 9};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 9}, myArray);
    }
    
}

