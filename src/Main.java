import java.util.Scanner;

import static java.lang.System.*;


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(in)) {

            System.out.println("Введите первое число:   ");
            int a = scanner.nextInt();
            out.println("Введите второе число:   ");
            int b = scanner.nextInt();
            out.println("Введите третье число:   ");
            int s = scanner.nextInt();


            int mn = 0;
            int m = 0;
            int sra = 0;
            if (a <= b && a <= s) {
                mn = a;

            } else if (b <= s && b <= a) {
                mn = b;

            } else if (s <= b && s <= a) {
                mn = s;
            }
            if (a >= b && a >= s) {
                m = a;

            } else if (b >= s && b >= a) {
                m = b;

            } else if (s >= b && s >= a) {
                m = s;
            }
            sra = (a + b + s) / 3;

            out.println("Минимальное из трех чисел:  " + mn);
            out.println("Максимальное из трех чисел:  " + m);
            out.println("Среднее арифметическое трех чисел:  " + sra);
        }
    }
}


