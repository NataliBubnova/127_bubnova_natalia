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
}
