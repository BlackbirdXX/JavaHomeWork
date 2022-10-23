// Реализовать алгоритм сортировки слиянием
 
package HomeWork03;

import java.util.Random;

public class Task01 {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("Сортировка слиянием.");
        System.out.println("Задается массив, заполненный рандомными числами.");
        int[] array = GetRandomArray(10);
        System.out.println(arrayToString(array));
        array = mergeSort(array);
        System.out.println(arrayToString(array));
    }

    public static int[] GetRandomArray(int n) {
        int[] newArray = new int[n];
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(0,101);
        }
        return newArray;
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public static int [] mergeSort(int[] array) {
        int[] temp;
        int[] resultArr = array;
        int[] additionalArray = new int[array.length];
        int size = 1;

        while (size < array.length) {
            for (int i = 0; i < array.length; i+=2*size) {
                merge(resultArr, i, resultArr, i + size, additionalArray, i, size);
            }
            temp = resultArr;
            resultArr = additionalArray;
            additionalArray = temp;
            size = size*2;

            System.out.println(arrayToString(resultArr));
        }
        return resultArr;
    }


    public static void merge(int[] subArray1, int sub1Start, int[] subArray2, int sub2Start, int[] resultArray, int resultStart, int size) {
        int index1 = sub1Start;
        int index2 = sub2Start;
        int sub1End = Math.min(sub1Start + size, subArray1.length);
        int sub2End = Math.min(sub2Start + size, subArray2.length);
        int counterSize = sub1End - sub1Start + sub2End - sub2Start;

        for (int i = resultStart; i < resultStart+counterSize; i++) {
            if (index1 < sub1End && (index2 >= sub2End || subArray1[index1] < subArray2[index2])) {
                resultArray[i] = subArray1[index1];
                index1++;
            }
            else {
                resultArray[i] = subArray2[index2]; 
                index2++;
            }
        }
    }
}