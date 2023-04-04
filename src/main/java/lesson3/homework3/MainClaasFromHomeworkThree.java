package lesson3.homework3;

import lesson3.MainClassFromLessonThree;

import java.util.*;

public class MainClaasFromHomeworkThree {
    public static void main(String[] args) {
//        List <Integer> list = randList();
//        delEven(list);
//        minMaxAverage(list);
//        removeRepits();
        ArrayList<String> list = listOfNumAndStrings();
        delInt(list);
    }


//    1. Пусть дан произвольный список целых чисел, удалить из него четные числа
//    (в языке уже есть что-то готовое для этого)

    public static List<Integer> randList() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(5));
        }
        System.out.println(list);
        return (list);
    }

    public static void delEven(List<Integer> list) {
        list.removeIf(n -> (n % 2 == 0));
        System.out.println(list);
    }

//    2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и
//    среднее арифметическое из этого списка.

    public static void minMaxAverage(List<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);
        double sumAllElem = 0;
        double average = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            sumAllElem += list.get(i);
        }
        average = sumAllElem / list.size();

        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }

//    3. Доделать начатое на семинаре. Пройтись по списку из задания 2 и удалить повторяющиеся элементы.

    public static void removeRepits() {
        List<String> planetsNames = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto");
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(planetsNames.get(random.nextInt(9)));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1).equals(list.get(i))) {
                list.remove(list.get(i + 1));
                i--;
            }
        }
        System.out.println(list);
    }

//    4*. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
//    Пройти по списку, найти и удалить целые числа.

    public static ArrayList<String> listOfNumAndStrings() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("eru", "ggb", "65", "93", "eif", "4", "uyp", "72"));
        System.out.println(list);
        return (list);
    }

    public static boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void delInt(ArrayList<String> list) {
        list.removeIf(MainClaasFromHomeworkThree::isInteger);
        System.out.println(list);
    }

}
