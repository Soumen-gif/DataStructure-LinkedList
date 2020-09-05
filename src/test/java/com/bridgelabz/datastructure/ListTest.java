package com.bridgelabz.datastructure;

import java.io.FileNotFoundException;
import java.util.LinkedList;

public class ListTest {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList list = new LinkedList();
        LinkedListImpl.readData(list);
        System.out.println(list);
        LinkedListImpl.addFirst(list);
        System.out.println(list);
        LinkedListImpl.remove(list);
        LinkedListImpl.checkEmpty();
        LinkedListImpl.checkSize();
        LinkedListImpl.insertElement();
    }
}
