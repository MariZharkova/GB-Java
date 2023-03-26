package lesson1.homework1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


final class MinMax {
    public int min = 0;
    public int max = 0;
}
public class MainClassFromHomeworkOne {
    public static void main(String[] args) {
//        MinMax result = getRandomArrMaxMin(15);
//        System.out.printf("максимальное значение: %d\n", result.max);
//        System.out.printf("минимальное значение: %d\n", result.min);
        orderValInArrToEnd();
//        inputNameAndPrintHelloWithDayTime();
    }


// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

    private static MinMax getRandomArrMaxMin(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10, 10);
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        MinMax result = new MinMax();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result.max) {
                result.max = arr[i];
            }
            if (arr[i] < result.min) {
                result.min = arr[i];
            }
        }
        return (result);
    }


//2. Дан массив nums = [3,2,2,3] и число val = 3.
//   Если в массиве есть числа, равные заданному,
//   нужно перенести эти элементы в конец массива.
//   Таким образом, первые несколько (или все) элементов массива
//   должны быть отличны от заданного, а остальные - равны ему.

    private static void orderValInArrToEnd() {
        int[] arr = {3, 2, 2, 3};
        int val = 3;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if ((arr[left] != val) && (arr[right]) != val) {
                left++;
                continue;
            }
            if ((arr[left] == val) && (arr[right]) != val) {
                arr[left] = arr[right];
                arr[right] = val;
            }
            right--;
        }
        for (int num = 0; num < (arr.length); num++) {
            System.out.print(arr[num]);
        }
    }

//3*. В консоли запросить имя пользователя.
// В зависимости от текущего времени, вывести приветствие вида:
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

    private static void inputNameAndPrintHelloWithDayTime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Как вас зовут? ");
        String name = in.nextLine();
        DateFormat timeNow = new SimpleDateFormat("HH:mm");
        String time = timeNow.format(new Date());
        System.out.println(time);
        if ((time.compareTo("05:00") >=0 ) && (time.compareTo("11:59") <= 0)) {
            System.out.printf("Доброе утро, %s!\n", name);
        }
        else if ((time.compareTo("12:00") >=0 ) && (time.compareTo("17:59") <= 0)) {
            System.out.printf("Добрый день, %s!\n", name);
        }
        else if ((time.compareTo("18:00") >=0 ) && (time.compareTo("22:59") <= 0)) {
            System.out.printf("Добрый вечер, %s!\n", name);
        }
        else {
            System.out.printf("Доброй ночи, %s!\n", name);
        }
    }
}