// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

package HomeWork03;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task03 {
    public static ArrayList<Integer> GetRandomArray(int n) {
        ArrayList<Integer> newArray = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            newArray.add(random.nextInt(0,11));
        }
        return newArray;
    }
    
    public static void Results(ArrayList<Integer> nArray) {
        // ArrayList<Integer>[] nArray = (ArrayList<Integer>) array.clone();
        nArray.sort(Comparator.naturalOrder());
        System.out.println("Минимальное значение : " + nArray.get(0));
        System.out.println("Максимальное значение : " + nArray.get(nArray.size()-1));
        double sumValues = 0;
        double arithmeticMean = 0;
        for (int i = 0; i < nArray.size(); i++) {
            sumValues += nArray.get(i);
        }
        arithmeticMean = sumValues / nArray.size();
            String s = Double.toString(arithmeticMean);
            DecimalFormat decimalFormat = new DecimalFormat("0.#####");
            String res = decimalFormat.format(Double.valueOf(s));
        System.out.println("Среднее арифметическое всех значений : " + res);
    }

    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.println("Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.");
        ArrayList<Integer> nArray =  GetRandomArray(10);
        System.out.println(nArray);
        Results(nArray);
}
}
