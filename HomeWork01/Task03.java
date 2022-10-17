// Реализовать простой калькулятор
package HomeWork01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        int a,b;
        String action;
        System.out.println("Простейший калькулятор.");

        Scanner iScanner = new Scanner(System.in);
        System.out.print ("Введите первое число : ");
        a = iScanner.nextInt();
        System.out.print ("Введите действие, которое необходимо. \nДоступны '+' '-' '*' '/' :\n");
        Scanner nameScanner = new Scanner(System.in);
        action = nameScanner.nextLine();
        System.out.print ("Введите второе число : ");
        b = iScanner.nextInt();
        iScanner.close();
        nameScanner.close();
        
        // String result = a + action + b;
        // System.out.println(result);
        int result;
        switch (action) {
        case "+":
            result = a+b;
            System.out.printf ("%d%s%d=%d", a, action, b, result);
            break;
        case "-":
            result = a-b;
            System.out.printf ("%d%s%d=%d", a, action, b, result);
            break;
        case "*":
            result = a*b;
            System.out.printf ("%d%s%d=%d", a, action, b, result);
            break;
        case "/":
            float af = a;
            float bf = b;
            double diffResult = af/bf;
            String s = Double.toString(diffResult);
            DecimalFormat decimalFormat = new DecimalFormat("0.#####");
            String res = decimalFormat.format(Double.valueOf(s));
            System.out.printf ("%d%s%d=%s", a, action, b, res);
            break;
        default:
            result = -1;
        break;
        }
    }   
}


