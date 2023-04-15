package lesson6.homework6;

//    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
//    Реализовать в java.
//    Создать множество ноутбуков (ArrayList).
//    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//    Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//    Выводить только те ноутбуки, что соответствуют условию


import java.util.Objects;

public class Laptop {
    int id;
    String brand;
    String name;
    int processorCount;
    String displaySize;
    int ram;
    int ssd;
    String color;

    public Laptop(
            int id,
            String brand,
            String name,
            int processorCount,
            String displaySize,
            int ram,
            int ssd,
            String color) {

        this.id = id;
        this.brand = brand;
        this.name = name;
        this.processorCount = processorCount;
        this.displaySize = displaySize;
        this.ram = ram;
        this.ssd = ssd;
        this.color = color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, name, processorCount, displaySize, ram, ssd, color);
    }

    @Override
    public String toString() {
        return String.format("%s %s", brand, name);
    }

    public int getRam() {
        return ram;
    }

}
