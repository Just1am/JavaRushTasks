package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой
совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class StringsLengthsToIntMassive {
    public static void main(String[] args) throws Exception {
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = reader.readLine();
            intArray[i] = stringArray[i].length();
        }
        for (int j : intArray) {
            System.out.println(j);
        }

    }
}
