import org.junit.*;
public class Task1_Tests extends Assert{
    @Test
    public void createDoubleLinkedList_GenerateEmpty_EmptyTrue(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }
    @Test
    public void createDoubleLinkedList_GenerateEmpty_EmptyFalse(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        assertFalse(list.isEmpty());
    }
    @Test
    public void getSize_EmptyDoubleLinkedList_sizeCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(0 == list.getSize());
    }
    @Test
    public void pushFront_DoubleLinkedList_sizeTrue(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertTrue(1 == list.getSize());
    }
    @Test
    public void pushFront_EmptyDoubleLinkedList_TryToDialDifferentNumber(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(2);
            fail();
        } catch (IndexOutOfBoundsException e){
            assertFalse(false);
        }
    }
    @Test
    public  void getHead_PushFront_TryToReceiveTheHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }
    @Test
    public void getHead_PushBack_TryToReceiveTheHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(2);
        list.pushBack(1);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }
    @Test
    public void enterTail_PushFront_TryToReceiveTail(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int tail = ((Node<Integer>)list.getTail()).getData();
        assertEquals(2, tail);
    }
    @Test
    public void enterTail_PushBack_TryToReceiveTail(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        int tail = ((Node<Integer>)list.getTail()).getData();
        assertEquals(1, tail);
    }
    @Test
    public void enter_PushFront_CheckFirst(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        int num = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num);
    }
    @Test
    public void enter_PushBack_CheckFirst(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(3);
        list.pushBack(2);
        list.pushBack(1);

        int num = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num);
    }
    @Test
    public void delete_PushFront_DeleteElementCheckSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, list.getSize());
    }
    @Test
    public void pasteListAfter_GenerateTwoListsAndUnite_CheckSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list.insertListAfter(list.get(0), list2);
        assertEquals(6, list.getSize());
    }
    @Test
    public void pasteListAfter_GenerateTwoListsAndUnite_CheckHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(4);
        list1.pushFront(5);
        list1.pushFront(6);
        list1.insertListAfter(list.get(0), list1);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }
    @Test
    public void insertListBefore_TryToInsertListBefore_CheckValues(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(4);
        list.pushFront(5);
        list.pushFront(6);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);
        list.insertListBefore(list.get(0), list1);
        int num1 = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>)list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>)list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>)list.get(3)).getData();
        assertEquals(4, num1);
        num1 = ((Node<Integer>)list.get(4)).getData();
        assertEquals(5, num1);
        num1 = ((Node<Integer>)list.get(5)).getData();
        assertEquals(6, num1);
    }
    @Test
    public void pushFront_ValuesDoubleLinkedList_ControlValues(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);

        int num1 = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>)list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>)list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>)list.get(3)).getData();
        assertEquals(4, num1);
    }
    @Test
    public void delete_DeleteAElement_CheckValue(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        int num = ((Node<Integer>)list.get(0)).getData();
        assertEquals(2, num);
    }
    @Test
    public void insertListAfter_GenerateTwoListsAndUnitePartTwo_CheckValues(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);

        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(4);
        list1.pushFront(5);
        list1.pushFront(6);
        list.insertListAfter(list.get(2), list1);

        int num1 = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>)list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>)list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>)list.get(3)).getData();
        assertEquals(4, num1);
        num1 = ((Node<Integer>)list.get(4)).getData();
        assertEquals(5, num1);
        num1 = ((Node<Integer>)list.get(5)).getData();
        assertEquals(6, num1);
    }
    @Test
    public void pasteListBefore_TryToPasteListBefore_CheckSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(4);
        list.pushFront(5);
        list.pushFront(6);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);
        list.insertListBefore(list.get(0), list1);
        assertEquals(6, list.getSize());
    }
    @Test
    public void pasteListBefore_TryToPasteListBefore_CheckValues(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(4);
        list.pushFront(5);
        list.pushFront(6);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);
        list.insertListBefore(list.get(0), list1);
        int num1 = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>)list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>)list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>)list.get(3)).getData();
        assertEquals(4, num1);
        num1 = ((Node<Integer>)list.get(4)).getData();
        assertEquals(5, num1);
        num1 = ((Node<Integer>)list.get(5)).getData();
        assertEquals(6, num1);
    }
    @Test
    public void generateArray_KitSizeNewArray_CheckSize(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        assertEquals(5, array.getSize());
    }
    @Test
    public void generateArray_GenerateEmptyArray_CheckSize(){
        DynamicArray<Integer> array = new DynamicArray<>();
        assertEquals(1024, array.getSize());
    }
    @Test
    public void changeTheSize_GenerateArrayAndResizeIt_CheckSize(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.resize(10);
        assertEquals(10, array.getSize());
    }
    @Test
    public void receive_TryToReceiveIndexOutOfBounds_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.get(7);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void receive_TryToReceiveIndexOutOfBorder_VerifyException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.get(5);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void kit_TryToKitIndexOutOfBounds_VerifyException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.set(6,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void kit_TryToKitIndexOutOfBorder_VerifyException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.set(5,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void paste_TryToPasteValueOutOfBounds_VerifyException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.insert(6,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void paste_TryToPastetValueOutOfBorder_VerifyException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.insert(5,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void kit_TryToKitNumbers_VerifyValues(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(5, array.get(4).intValue());
    }
    @Test
    public void paste_TryToPasteNumber_VerifyNewValue(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        array.insert(4, 100);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(100, array.get(4).intValue());
    }
    @Test
    public void pushBack_TryToPushBack_VerifyValues(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        array.pushBack(6);
        array.pushBack(7);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(5, array.get(4).intValue());
        assertEquals(6, array.get(5).intValue());
        assertEquals(7, array.get(6).intValue());
    }
    @Test
    public void popWindow_EmptyArray_VerifyException(){
        DynamicArray<Integer> array = new DynamicArray<>(0);
        try {
            array.popBack();
            fail();
        }
        catch (Exception some) {
            assertEquals("Array is empty", some.getMessage());
        }
    }
    @Test
    public void popBack_CheckCountArray(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.popBack();
        assertEquals(4, array.getSize());
    }
    @Test
    public void delete_TryToDeleteOutOfBounds_VerifyException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.remove(6);
            fail();
        }
        catch (Exception some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void delete_TryToDeleteOut_VerifyException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.remove(5);
            fail();
        }
        catch (Exception some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void delete_TryToDelete_VerifySize(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.remove(3);
        assertEquals(4, array.getSize());
    }

}
