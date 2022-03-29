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
        Integer[] myArray = {2, 1, 3};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }

}

