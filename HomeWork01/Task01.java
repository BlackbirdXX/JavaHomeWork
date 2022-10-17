// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package HomeWork01;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        int n = 0;
        Scanner nameScanner = new Scanner(System.in);
        System.out.print ("Введите число N : ");
        n = nameScanner.nextInt();
        nameScanner.close();
        
        int nTriangle = 0;
        for (int i = 1; i <= n; i++) {
            nTriangle += i;
        }
        System.out.printf ("Треугольное число от %d равно %d\n",n, nTriangle);

        int nFactor = 1;
        for (int i = 1; i <= n; i++) {
            nFactor *= i;
        }
        System.out.printf ("Факториал числа %d равно %d ",n, nFactor);
    }
}