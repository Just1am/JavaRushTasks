package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
*/

public class Sort {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        System.out.println(sort(a, b, c));
    }
    public static String sort(int a, int b, int c) {
        int buffer;
        int[] numbers = {a, b, c};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int k = 0; k < numbers.length - 1; k++)
                if (numbers[k] < numbers[k + 1]) {
                    buffer = numbers[k + 1];
                    numbers[k + 1] = numbers[k];
                    numbers[k] = buffer;
                }
        }
        return numbers[0] + " " + numbers[1] + " " + numbers[2];
    }
}
