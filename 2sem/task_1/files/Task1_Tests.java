import org.junit.*;
public class Task1_Tests extends Assert{

    private int getIntValue(ListNode<Integer> item) {
        return ((Node<Integer>) item).getData();
    }

    @Test
    public void pushFront_EmptyList_False() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertFalse(list.isEmpty());
    }
    @Test
    public void pushFront_EmptyList_WhenTryingToGetElementNumberOneAnErrorOccurs() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(1);
            fail();
        } catch (IndexOutOfBoundsException e)
            assertTrue(true);
    }
    @Test
    public void pushElements_ThreeElements_FirstElementIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        assertEquals(1, getIntValue(list.get(0)));
    }
    @Test
    public void pushElements_ThreeElements_SecondElementIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        assertEquals(2, getIntValue(list.get(1)));
    }
    @Test
    public void pushElements_ThreeElements_ThirdElementIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        assertEquals(3, getIntValue(list.get(2)));
    }
    @Test
    public void pushElements_ThreeElements_HeadIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        assertEquals(1, getIntValue(list.getHead()));
    }
    @Test
    public void pushElements_ThreeElements_TailIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        assertEquals(3, getIntValue(list.getTail()));
    }
    @Test
    public void pushElements_BackThreeElements_FirstElementIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(3);
        list.pushBack(2);
        list.pushBack(1);
        assertEquals(1, getIntValue(list.get(0)));
    }
    @Test
    public void pushElements_BackThreeElements_SecondElementIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(3);
        list.pushBack(2);
        list.pushBack(1);
        assertEquals(2, getIntValue(list.get(1)));
    }
    @Test
    public void pushElements_BackThreeElements_ThirdElementIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(3);
        list.pushBack(2);
        list.pushBack(1);
        assertEquals(3, getIntValue(list.get(2)));
    }
    @Test
    public void deleteElement_FirstElement_FirstElementIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, getIntValue(list.get(0)));
    }
    @Test
    public void deleteElements_FirstElement_HeadIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, getIntValue(list.getHead()));
    }
    @Test
    public void deleteElement_FirstElement_TailIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(3, getIntValue(list.getTail()));
    }
    @Test
    public void deleteElement_FirstElement_SizeIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, list.getSize());
    }
    @Test
    public void pasteList_afterFirstElement_SizeIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(0), list2);
        assertEquals(6, list1.getSize());
    }
    @Test
    public void pasteList_afterFirstElement_HeadIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(0), list2);
        assertEquals(1, getIntValue(list1.getHead()));
    }
    @Test
    public void pasteList_afterFirstElement_TailIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(0), list2);
        assertEquals(3, getIntValue(list1.getTail()));
    }
    @Test
    public void pasteList_afterFirstElement_ElementsAreCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);

        list1.insertListAfter(list1.get(0), list2);

        assertEquals(1, getIntValue(list1.get(0)));
        assertEquals(4, getIntValue(list1.get(1)));
        assertEquals(5, getIntValue(list1.get(2)));
        assertEquals(6, getIntValue(list1.get(3)));
        assertEquals(2, getIntValue(list1.get(4)));
        assertEquals(3, getIntValue(list1.get(5)));
    }
    @Test
    public void pasteList_afterSecondElement_ElementsAreTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);

        list1.insertListAfter(list1.get(1), list2);

        assertEquals(1, getIntValue(list1.get(0)));
        assertEquals(2, getIntValue(list1.get(1)));
        assertEquals(4, getIntValue(list1.get(2)));
        assertEquals(5, getIntValue(list1.get(3)));
        assertEquals(6, getIntValue(list1.get(4)));
        assertEquals(3, getIntValue(list1.get(5)));
    }
    @Test
    public void pasteList_afterThirdElement_ElementsAreTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);

        list1.insertListAfter(list1.get(2), list2);

        assertEquals(1, getIntValue(list1.get(0)));
        assertEquals(2, getIntValue(list1.get(1)));
        assertEquals(3, getIntValue(list1.get(2)));
        assertEquals(4, getIntValue(list1.get(3)));
        assertEquals(5, getIntValue(list1.get(4)));
        assertEquals(6, getIntValue(list1.get(5)));
    }
    @Test
    public void pasteList_afterThirdElement_HeadIsTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(2), list2);
        assertEquals(1, getIntValue(list1.getHead()));
    }
    @Test
    public void pasteList_afterThirdElement_TailIsTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(2), list2);
        assertEquals(6, getIntValue(list1.getTail()));
    }







}
