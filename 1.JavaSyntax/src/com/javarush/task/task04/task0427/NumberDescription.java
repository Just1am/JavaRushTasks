package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
*/

public class NumberDescription {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int a = Integer.parseInt(bufferedReader.readLine());
        if (a > 0 && a < 1000) {
            String whatsNumber = even(a)+charactersNumber(a);
            System.out.println(whatsNumber);
        }
    }
    public static String even ( int a) {
        if (a % 2 == 0)
            return "четное ";
        else
            return "нечетное ";
    }
    public static String charactersNumber(int a) {
        if (a/100 != 0)
            return "трехзначное число";
        else
            if (a/10 != 0)
                return "двузначное число";
            else
                return "однозначное число";
    }
}
