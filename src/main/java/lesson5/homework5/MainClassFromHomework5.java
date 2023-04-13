//1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.


package lesson5.homework5;

import java.util.*;

public class MainClassFromHomework5 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phonesMap = new HashMap<>();
        while (true) {
            String surname = inputSurname();
            if (surname.isEmpty()) {
                break;
            }
            ArrayList<String> phones = new ArrayList<>();
            while (true) {
                String phone = inputPhoneNumber();
                if (phone.isEmpty()) {
                    break;
                }
                phones.add(phone);
            }
            phonesMap = insertEntry(surname, phones, phonesMap);
        }
        System.out.println(phonesMap);
    }

    private static Map<String, ArrayList<String>> insertEntry(
            String surname,
            ArrayList<String> phones,
            Map<String, ArrayList<String>> phonesMap) {
        phonesMap.put(surname, phones);
        return (phonesMap);
    }

    private static String inputSurname() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        return (in.nextLine());
    }

    private static String inputPhoneNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        return (in.nextLine());
    }

}
