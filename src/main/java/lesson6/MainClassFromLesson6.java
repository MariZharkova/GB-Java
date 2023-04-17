package lesson6;

import java.util.*;

public class MainClassFromLesson6 {
    public static void main(String[] args) {
//        ex0();
        Cat cat1 = new Cat(10);
        cat1.firstName = "Барсик";
        cat1.species = "British";
        cat1.male = "male";
        cat1.lastVisit = "12.04.2023";
        cat1.age = 2;

        Cat cat2 = new Cat(20);
        cat2.firstName = "Мурка";
        cat2.species = "Notspecies";
        cat2.male = "female";
        cat2.lastVisit = "10.04.2023";
        cat2.age = 1;
        System.out.println(cat2.getId());

        Cat cat3 = new Cat(30, 5, "Борис","Gray",  "male", "20230316" );
        System.out.println(cat3.getFirstName());


        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

    }

    private static void ex0() {

        List<String> data = List.of("Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять", "Десять");
//        List<?> data = List.of(1, 2, 3, 4, 5, 6, 2, 1, 4, 1, 12, 1, 14, 5, 16, 17, 33, 45, 65, 22, 13);
        var dataNew = new ArrayList<>(data);
        Collections.reverse(dataNew);

        System.out.println(new HashSet<>(dataNew));
        System.out.println(new LinkedHashSet<>(dataNew));
        System.out.println(new TreeSet<>(dataNew));
    }
}



