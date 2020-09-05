package com.bridgelabz.datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListImpl {

    static LinkedList<Object> list;
    public static LinkedList readData(LinkedList list) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("E:\\DataStructure-LinkedList\\src\\main\\resources\\list.csv"))) {
            scanner.useDelimiter(",");
            list= new LinkedList<>();

            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        }
        System.out.println("This is the list :" + list);
        return list;
    }
    public  static LinkedList addFirst(LinkedList list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data :");
        String text = sc.next();
        if (list.contains(text) == true) {
            System.out.println(text + " Is Present In Linked List");
            System.out.println("Removing the Data From Linked List And Adding Data To End Of List");
            list.remove(text);
            list.add(text);
        } else {
            list.add(text);
        }
        System.out.println("Linked List After Addition Of data:" + list);
        return list;
    }
    public static LinkedList remove(LinkedList list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data You Want To Remove :");
        String text = sc.next();
        list.remove(text);
        System.out.println("Linked List After Deletion Of Data :" + list);
        return list;
    }
    public static void checkEmpty() {
        if (list.isEmpty() == true) {
            System.out.println("No Data In The Linked List");
        } else {
            System.out.println("Linked List Is Not Empty And It Has " + list);
        }
    }
    public static void checkSize() {
        System.out.println("Size Of Linked List Is :" + list.size());
    }
    public static void insertElement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data  To Insert Element:");
        String text = sc.next();
        System.out.println("Enter Position To Insert Element:");
        int position = sc.nextInt();
        list.set(position, text);
        System.out.println("Linked List After Adding " + text + " At Postion " + position + " :" + list);
    }

}

