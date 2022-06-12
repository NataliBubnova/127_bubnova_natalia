public class Program {
    public static void main(String[] args) {
        System.out.println("Offset_hash_1");
        HashTable hashTable = new OffsetHashTable(13);

        hashTable.insert(87);
        hashTable.print();
        System.out.println();

        hashTable.insert(37);
        hashTable.print();
        System.out.println();

        hashTable.insert(75);
        hashTable.print();
        System.out.println();

        hashTable.insert(29);
        hashTable.print();
        System.out.println();

        hashTable.insert(39);
        hashTable.print();
        System.out.println();

        hashTable.insert(64);
        hashTable.print();
        System.out.println();

        hashTable.insert(35);
        hashTable.print();
        System.out.println();

        hashTable.insert(81);
        hashTable.print();
        System.out.println();

        hashTable.insert(4);
        hashTable.print();
        System.out.println();

        hashTable.insert(96);
        hashTable.print();
        System.out.println();

        hashTable.insert(16);
        hashTable.print();
        System.out.println();

        hashTable.insert(40);
        hashTable.print();
        System.out.println();

        System.out.println("Offset_hash_2");

        HashTable hashTable1 = new OffsetHashTable(19);

        hashTable1.insert(76);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(24);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(95);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(73);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(6);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(97);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(97);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(70);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(3);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(61);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(14);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(82);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(24);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(34);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(94);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(94);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(82);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(97);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(73);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(70);
        hashTable1.print();
        System.out.println();

        System.out.println("Offset_hash_3");

        HashTable hashTable2 = new OffsetHashTable(19);

        hashTable2.insert(26);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(59);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(27);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(71);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(10);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(17);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(34);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(21);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(32);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(81);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(33);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(96);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(34);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(71);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(32);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(77);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(25);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(33);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(33);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(10);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(67);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(76);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(93);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(81);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(21);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(26);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(96);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(27);
        hashTable2.print();
        System.out.println();

        System.out.println("List_hash_1");
        HashTable listHashTable = new ListHashTable(13);

        listHashTable.insert(83);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(55);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(32);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(36);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(69);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(41);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(3);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(92);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(55);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(79);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(87);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(90);
        listHashTable.print();
        System.out.println();

        System.out.println("List_hash_2");

        HashTable listHashTable1 = new ListHashTable(19);

        listHashTable1.insert(69);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(17);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(87);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(21);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(50);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(89);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(38);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(6);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(86);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(37);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(30);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(13);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(92);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(98);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(14);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(86);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(98);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(38);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(13);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(69);
        listHashTable1.print();
        System.out.println();

        System.out.println("List_hash_3");

        HashTable listHashTable2 = new ListHashTable(19);


        listHashTable2.insert(54);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(6);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(54);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(10);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(14);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(30);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(69);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(13);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(69);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(16);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(79);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(95);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(79);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(14);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(16);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(85);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(22);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(99);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(13);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(99);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(56);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(39);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(46);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(69);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(10);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(22);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(30);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(56);
        listHashTable2.print();
        System.out.println();
    }
}