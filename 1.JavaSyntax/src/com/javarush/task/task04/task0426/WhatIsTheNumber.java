package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
"отрицательное четное число" - если число отрицательное и четное,
"отрицательное нечетное число" - если число отрицательное и нечетное,
"ноль" - если число равно 0,
"положительное четное число" - если число положительное и четное,
"положительное нечетное число" - если число положительное и нечетное.
*/

public class WhatIsTheNumber {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int number = Integer.parseInt(bufferedReader.readLine());
        String whatsNumber;
        if (number == 0)
            whatsNumber ="ноль";
        else {
            if (number > 0)
                whatsNumber = "положительное";
            else
                whatsNumber = "отрицательное";

            if (number % 2 == 0)
                whatsNumber += " четное число";
            else
                whatsNumber += " нечетное число";
        }
        System.out.println(whatsNumber);
    }
}
