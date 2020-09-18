package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class MaximumIzN {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum, challenger;
        int n = Integer.parseInt(reader.readLine());

        if (n > 0){
            maximum = Integer.parseInt(reader.readLine());
            if (n > 1)
            for (int i = 0; i < n-1 ; i++) {
                challenger = Integer.parseInt(reader.readLine());
                if (maximum < challenger)
                    maximum = challenger;
            }
            System.out.println(maximum);
        }




    }
}
