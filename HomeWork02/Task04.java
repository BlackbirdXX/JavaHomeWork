// К калькулятору из предыдущего дз добавить логирование.

package HomeWork02;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task04 {
    public static void main(String[] args) throws SecurityException, IOException {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        int a,b;
        String action;
        System.out.println("Простейший калькулятор.");

        Logger logger = Logger.getLogger(Task01.class.getName());
        FileHandler logH = new FileHandler("HomeWork02/LogTask04.txt", true);
        logger.addHandler(logH);
        SimpleFormatter sFormat = new SimpleFormatter();
        logH.setFormatter(sFormat);

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
            System.out.printf ("Результат : %d%s%d=%d\n", a, action, b, result);
            logger.info((a + action + b + "=" + result));
            break;
        case "-":
            result = a-b;
            System.out.printf ("Результат : %d%s%d=%d\n", a, action, b, result);
            logger.info((a + action + b + "=" + result));
            break;
        case "*":
            result = a*b;
            System.out.printf ("Результат : %d%s%d=%d\n", a, action, b, result);
            logger.info((a + action + b + "=" + result));
            break;
        case "/":
            float af = a;
            float bf = b;
            double diffResult = af/bf;
            String s = Double.toString(diffResult);
            DecimalFormat decimalFormat = new DecimalFormat("0.#####");
            String res = decimalFormat.format(Double.valueOf(s));
            System.out.printf ("Результат : %d%s%d=%s\n", a, action, b, res);
            logger.info((a + action + b + "=" + res));
            break;
        default:
            result = -1;
        break;
        }
    }
}
