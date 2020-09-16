package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
*/

public class Coords {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int result;
        if (a > 0 && b > 0)
        result = 1;
        else
            if (a < 0 && b > 0)
            result = 2;
            else
                if (a < 0 && b < 0)
                result = 3;
                else result = 4;
        System.out.println(result);
    }
}
