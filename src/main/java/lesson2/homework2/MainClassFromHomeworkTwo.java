package lesson2.homework2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class MainClassFromHomeworkTwo {
    public static void main(String[] args) {
//        String text = inputString();
//        System.out.println(isPalindrome(text));
//        hundredRepeats();
        extensions("C:\\Users\\Marina\\Documents\\education\\java\\java_seminars");
    }


//1. Напишите метод, который принимает на вход строку (String) и определяет
//        является ли строка палиндромом (возвращает boolean значение).

    private static String inputString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        return (in.nextLine());
    }

    private static Boolean isPalindrome(String text) {
        StringBuilder textSB = new StringBuilder(text);
        for (int i = 0; i < text.length() / 2; i++){
          if (textSB.charAt(i) != textSB.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//        который запишет эту строку в простой текстовый файл, обработайте исключения.

    private static void hundredRepeats() {
        String str = "TEST";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            result.append(str).append(System.lineSeparator());
        }

        try(PrintWriter pw = new PrintWriter("src/main/resources/files/file.txt")) {
        pw.print(result);
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
//3*.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
//
//        1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//        4 Расширение файла: jpg

    private static String getExtention(String path)
    {
        String[] parts = path.split("\\.");
        if (parts.length > 1 && !parts[0].isEmpty())
        {
            return parts[parts.length - 1];
        }
        return "";
    }
    private static void extensions(String pathDir) {
        File file = new File(pathDir);
        if (!file.isDirectory()) {
            return;
        }
//        file.getPath().split(".",2);
        String[] dirListNames = file.list();;

        StringBuilder sb = new StringBuilder();
        int number = 0;
        for (String fileName : dirListNames) {
            File cur_entry = new File(pathDir + '\\' + fileName);
            if (cur_entry.isDirectory()) {
                continue;
            }
            number++;
            sb.append(number + " ").append("Расширение файла ").append(fileName).append(" : ").append(getExtention(fileName)).append(System.lineSeparator());
        }
        System.out.printf("%s%n", sb);
    }












}

