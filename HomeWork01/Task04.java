// Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.

package HomeWork01;

import java.util.Scanner;

public class Task04 {
    public static boolean isNumeric(String string) { 
        int intValue; 
        
        // System.out.println(String.format("Parsing string: \"%s\"", string)); 
        
        if(string == null || string.equals("")) { 
        System.out.println("String cannot be parsed, it is null or empty."); 
        return false; 
        } 
        
        try { 
        intValue = Integer.parseInt(string); 
        return true; 
        } catch (NumberFormatException e) { 
        // System.out.println("Input String cannot be parsed to Integer."); 
        } 
        return false; 
        } 
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.println("Программа, которая восстанавливает уравнение.");
        String s = "q? + ?w = e";
        System.out.printf("Формула для восстановления : %s\n", s);
        Scanner iScanner = new Scanner(System.in);
        System.out.print ("Введите число q : ");
        char q = iScanner.next().charAt(0);
        System.out.print ("Введите число w : ");
        char w = iScanner.next().charAt(0);
        Scanner jScanner = new Scanner(System.in);
        System.out.print ("Введите число e : ");
        String e = jScanner.nextLine();
        iScanner.close();
        jScanner.close();
        s = s.replace('q',q);
        s = s.replace('w',w);
        s = s.replaceAll("e", e);
        System.out.printf("Теперь наше уравнение выглядит так : %s\n", s);
        s = s.replace('?','0');
        
        String[] chars = s.split(" ");
        int[] numbersChar = new int[3];
        String temp = new String();
        int count = 0;
        
        for (int i = 0; i < chars.length; i++) {

            if (isNumeric(chars[i])) {
            temp = chars[i];
            int a = Integer.parseInt(temp);
            numbersChar[count++] = a;
            }
        
        }
    
    int x = numbersChar[0];
    int y = numbersChar[1];
    int z = numbersChar[2];
    int xy = x+y;
    int res = z - xy;
    x = res%10+x;
    y = res/10*10+y;
    res = x + y;
    System.out.printf("Восстановленное уравнение : %d + %d = % d", x, y, res);
}
    
}
