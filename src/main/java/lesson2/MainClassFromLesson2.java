package lesson2;


public class MainClassFromLesson2 {
    public static void Main(String[] args) {
//        returnLengthN();
        stringCompression();
    }


    private static void returnLengthN() {
        int n = 7;
        String a = "a";
        String b = "B";
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                c.append(a);
            } else {
                c.append(b);
            }
        }
        System.out.println(c);
    }

    private static void stringCompression() {
        String str = "aaaabbbcdd";
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > 1) {
                    res.append(str.charAt(i)).append(count);
                } else {
                    res.append(str.charAt(i));
                }
                count = 1;
            }
        }
        if (count > 1) {
            res.append(str.charAt(str.length() - 1)).append(count);
        } else {
            res.append(str.charAt(str.length() - 1));
        }
        System.out.println(res);
    }

    private static void ex2_1() {
        String longString = "aaaabbbcdd";
        StringBuilder shortStringSB = new StringBuilder();
        char prev = longString.charAt(0);
        char curr = prev;
        int counter = 1;

        for (int i = 1; i < longString.length(); i++) {
            prev = longString.charAt(i - 1);
            curr = longString.charAt(i);
            if (prev != curr) {
                shortStringSB.append(prev);
                shortStringSB.append((counter > 1) ? counter : "");
                counter = 0;
            }
            counter++;
        }
        shortStringSB.append(curr);
        shortStringSB.append((counter > 1) ? counter : "");

        System.out.printf("%s -> %s%n", longString, shortStringSB);
    }
}