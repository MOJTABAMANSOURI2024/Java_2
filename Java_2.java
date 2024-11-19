import java.util.Scanner;

public class NameCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];

        // گرفتن ۱۰ اسم از کاربر
        System.out.println("لطفاً ۱۰ اسم وارد کنید:");
        for (int i = 0; i < 10; i++) {
            System.out.print("اسم " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // نمایش اسم و تعداد کاراکترهای آن
        System.out.println("\nتعداد کاراکترهای هر اسم:");
        for (String name : names) {
            System.out.println(name + ": " + name.length() + " کاراکتر");
        }

        scanner.close();
    }
}