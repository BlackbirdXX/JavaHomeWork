// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package HomeWork02;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;



public class Task01 {
    public static void main(String[] args) throws IOException {
        System.out.print("\033[H\033[2J");
        int ctr, inner, outer, temp;
        Logger logger = Logger.getLogger(Task01.class.getName());
        FileHandler logH = new FileHandler("HomeWork02/LogTask01.txt");
        logger.addHandler(logH);
        SimpleFormatter sFormat = new SimpleFormatter();
        logH.setFormatter(sFormat);
        logger.info("Заполнение массива");
        int[] nums = new int[10];
        for (ctr = 0; ctr < nums.length; ctr++) {
            nums[ctr] = new Random().nextInt(0,11);
            logger.info(Arrays.toString(nums));
        }
        System.out.print("Массив из рандомных чисел : ");
        for (ctr = 0; ctr < nums.length; ctr++) {
            System.out.print(nums[ctr] + " ");
        }
        logger.info("Сортировка");
        for (outer = 0; outer < nums.length; outer++) {
        
            for (inner = outer; inner < nums.length; inner++) {
                if (nums[inner] < nums[outer]){
                    temp = nums[inner];
                    nums[inner] = nums[outer];
                    nums[outer] = temp;
                }
            }
            logger.info(Arrays.toString(nums));
        }
        
        System.out.print("\nОтсортированный массив    : ");
        for (ctr = 0; ctr < nums.length; ctr++) {
            System.out.print(nums[ctr] + " ");
        }
    }
}
