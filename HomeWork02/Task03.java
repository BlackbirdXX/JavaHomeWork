// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

package HomeWork02;

import java.util.Scanner;

public class Task03 {

    public static String GetStringFromConsole() {
        String newString = new String();
        Scanner nameScanner = new Scanner(System.in);
        System.out.print ("Введите число строку : ");
        newString = nameScanner.nextLine();
        nameScanner.close();
        return newString;
    }
    public static void Palndrom(String str) {
        System.out.println(str.equals(new StringBuilder(str).reverse().toString()));
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Palndrom(GetStringFromConsole());
    }
}
