package lesson1;

import java.util.Scanner;

public class MainClassFromLessonOne {
    public static void main(String[] args) {
        //    inputNameAndPrint();
        getRandomArrMaxCount();
    }

//    1. Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//    Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

    private static void inputNameAndPrint() {
        Scanner in = new Scanner(System.in);
        System.out.print("Как вас зовут? ");
        String name = in.nextLine();
        System.out.printf("Привет, %s!", name);
    }

    //  2. Дан массив двоичных чисел, например [1,1,0,1,1,1,0,1], вывести максимальное количество подряд идущих 1.
    private static void getRandomArrMaxCount() {
        int[] array = new int[]{1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxCount = 0;
        for (int num : array) {
            if (num == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }

            } else {
                count = 0;
            }
        }
        System.out.print(maxCount);
    }
}











