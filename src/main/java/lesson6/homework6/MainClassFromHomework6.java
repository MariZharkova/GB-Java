package lesson6.homework6;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClassFromHomework6 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(
                1, "Apple", "MacBook Pro", 10,
                "16\"", 32, 512, "Space Gray");
//        System.out.println(laptop1.getName());
        Laptop laptop2 = new Laptop(
                2, "Asus", "Zbook Pro", 14,
                "15\"", 16, 1000, "Blue");
//        System.out.println(laptop2.getName());
        Laptop laptop3 = new Laptop(
                3, "HP", "ENVY", 14,
                "17\"", 12, 512, "Silver");
//        System.out.println(laptop3.getName());
        Laptop laptop4 = new Laptop(
                4, "Samsung", "Galaxy Book 2", 10,
                "13\"", 16, 512, "Graphite");
//        System.out.println(laptop4.getName());
        Laptop laptop5 = new Laptop(
                5, "Dell", "Inspiron", 4,
                "15\"", 16, 256, "Black");
//        System.out.println(laptop5.getName());
        Laptop laptop6 = new Laptop(
                6, "Microsoft", "Surface Laptop", 4,
                "13\"", 8, 256, "Silver");
//        System.out.println(laptop6.getName());
        Laptop laptop7 = new Laptop(
                7, "Acer", "Spin", 3,
                "13\"", 16, 512, "Silver");
//        System.out.println(laptop7.getName());


        ArrayList laptopsArray = new ArrayList<>();
        laptopsArray.add(laptop1);
        laptopsArray.add(laptop2);
        laptopsArray.add(laptop3);
        laptopsArray.add(laptop4);
        laptopsArray.add(laptop5);
        laptopsArray.add(laptop6);
        laptopsArray.add(laptop7);
        System.out.println(laptopsArray);

        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение RAM, не менее: ");
        int enteredRam = Integer.parseInt(in.nextLine());
        int count = 0;
        for (int i = 0; i < laptopsArray.size() - 1; i++) {
            if (enteredRam <= ((Laptop) laptopsArray.get(i)).getRam()) {
                count++;
                System.out.printf("%d %s", count, laptopsArray.get(i));
                System.out.println();
            }
        }
            if (count == 0){
                System.out.print("Нет таких ноутбуков");
            }
    }
}


