//    2. Пусть дан список сотрудников:
//    Иван Иванов
//    Светлана Петрова
//    Кристина Белова
//    Анна Мусина
//    Анна Крутова
//    Иван Юрин
//    Петр Лыков
//    Павел Чернов
//    Петр Чернышов
//    Мария Федорова
//    Марина Светлова
//    Мария Савина
//    Мария Рыкова
//    Марина Лугова
//    Анна Владимирова
//    Иван Мечников
//    Петр Петин
//    Иван Ежов
//    Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//    Отсортировать по убыванию популярности.


package lesson5.homework5;

import java.util.*;

public class MainClassFromHomework5_2 {
    public static void main(String[] args) {
        Map<String, String> employeesMap = creatingEmployeesMap();
        Map<String, String> repeatedNames = countRepitedEmployeesMap(employeesMap);
        ArrayList<ArrayList<String>> res = sortingEmployees(repeatedNames);
        System.out.println(res);
    }


    private static Map<String, String> creatingEmployeesMap() {
        Map<String, String> employeesMap = new HashMap<>();
        employeesMap.put("Иванов", "Иван");
        employeesMap.put("Петрова", "Светлана");
        employeesMap.put("Белова", "Кристина");
        employeesMap.put("Мусина", "Анна");
        employeesMap.put("Крутова", "Анна");
        employeesMap.put("Юрин", "Иван");
        employeesMap.put("Лыков", "Петр");
        employeesMap.put("Чернов", "Павел");
        employeesMap.put("Чернышов", "Петр");
        employeesMap.put("Федорова", "Мария");
        employeesMap.put("Светлова", "Марина");
        employeesMap.put("Савина", "Мария");
        employeesMap.put("Рыкова", "Мария");
        employeesMap.put("Лугова", "Марина");
        employeesMap.put("Владимирова", "Анна");
        employeesMap.put("Мечников", "Иван");
        employeesMap.put("Петин", "Петр");
        employeesMap.put("Ежов", "Иван");
        System.out.println(employeesMap);
        return employeesMap;
    }

    private static Map<String, String> countRepitedEmployeesMap(Map<String, String> employeesMap) {
        ArrayList<String> names = new ArrayList<>(employeesMap.values());
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        Map<String, String> repeatedNames = new HashMap<>();
        int count = 1;
        for (int i = 0; i < names.size() - 1; i++) {
            if (names.get(i).equals(names.get(i + 1))) {
                count++;
            } else {
                repeatedNames.put(names.get(i), Integer.toString(count));
                count = 1;
            }
        }
        repeatedNames.put(names.get(names.size() - 1), Integer.toString(count));
        ;
        return (repeatedNames);
    }

    private static ArrayList<ArrayList<String>> sortingEmployees(Map<String, String> repeatedNames) {
        ArrayList<ArrayList<String>> sortedNames = new ArrayList<>();
        for (Map.Entry<String, String> entry : repeatedNames.entrySet()) {
            ArrayList<String> tuple = new ArrayList<>();
            tuple.add(entry.getKey());
            tuple.add(entry.getValue());
            sortedNames.add(tuple);
        }
        sortedNames.sort(
                (ArrayList<String> lhs, ArrayList<String> rhs) -> {
                    Integer rInt = Integer.valueOf(rhs.get(1));
                    Integer lInt = Integer.valueOf(lhs.get(1));
                    return rInt.compareTo(lInt);
                });
        return sortedNames;
    }
}