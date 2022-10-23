// Пусть дан произвольный список целых чисел, удалить из него четные числа

package HomeWork03;

import java.util.ArrayList;
import java.util.Random;

public class Task02 {
    public static ArrayList<Integer> GetRandomArray(int n) {
        ArrayList<Integer> newArray = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            newArray.add(random.nextInt(0,11));
        }
        return newArray;
    }
    

    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.println("Пусть дан произвольный список целых чисел, удалить из него четные числа.");
        ArrayList<Integer> nArray =  GetRandomArray(10);
        System.out.println(nArray);
        for (int i = nArray.size()-1; i >= 0; i--) {
            if(nArray.get(i)%2 == 0){
                nArray.remove(i);
            }
        }
        System.out.println(nArray);
}
}
