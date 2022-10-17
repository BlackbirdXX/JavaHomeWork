//Вывести все простые числа от 1 до 1000
package HomeWork01;

public class Task02 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        int num, temp;
        System.out.println("Простые числа, от 1 до 1000 : ");
        for (num = 1; num <1000; num++) {
            temp = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                temp++;
            }
            if (temp <= 2)
                System.out.print (" " + num);
 
        }
}
}