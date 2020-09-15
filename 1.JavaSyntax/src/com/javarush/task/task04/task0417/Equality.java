package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.
*/

public class Equality {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        if (a == b && a == c)
            System.out.println(a + " " + b + " " + c);
        else {
            if (a == b)
                System.out.println(a + " " + b);
            else if (b == c)
                System.out.println(b + " " + c);
                else if (a == c)
                System.out.println(a + " " + c);


        }
    }
}