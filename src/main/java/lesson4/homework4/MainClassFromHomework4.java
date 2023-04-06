package lesson4.homework4;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MainClassFromHomework4 {
    public static void main(String[] args) {
//        workWithStringCollection();
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "apple", "orange", "banana", "tomato", "strawberry", "melon");
        System.out.println(wordsList);
        System.out.println(reverseLinkedList(wordsList));

//    1. Реализовать консольное приложение, которое:
//    Принимает от пользователя и “запоминает” строки.
//    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//    Если введено revert, удаляет предыдущую введенную строку из памяти.

//    private static void workWithStringCollection() {
//        Scanner in = new Scanner(System.in);
//        LinkedList<String> stringList = new LinkedList<>();
//
//        while (true) {
//            System.out.println();
//            System.out.print("Введите строку: ");
//            String inputString = in.nextLine();
//
//            if (inputString.length() == 0) {
//                System.out.println("Строка не должна быть пустой");
//                continue;
//            }
//            if (inputString.equalsIgnoreCase("End")) {
//                break;
//            }
//            if (inputString.equalsIgnoreCase("print")) {
//                printReverseValues(stringList);
//                continue;
//            }
//            if (inputString.equalsIgnoreCase("revert")) {
//                delPreviousValue(stringList);
//                continue;
//            }
//
//            stringList.add(inputString);
//        }
//    }
//    private static void printReverseValues(LinkedList<String> stringList) {
//        Iterator<String> reverseList = stringList.descendingIterator();
//        int pos = 0;
//        while (reverseList.hasNext()) {
//            pos ++;
//            System.out.println(pos + ") " + reverseList.next());
//        }
//    }
//    private static void delPreviousValue(LinkedList<String> stringList) {
//        stringList.removeLast();
//    }

//    2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    }

    private static LinkedList<String> reverseLinkedList(LinkedList<String> wordsList) {
        Iterator<String> reverseListIterator = wordsList.descendingIterator();
        LinkedList<String> reverseList = new LinkedList<>();
        while (reverseListIterator.hasNext()) {
            reverseList.add(reverseListIterator.next());
        }
        return(reverseList);
    }
}













