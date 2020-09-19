package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
количество дней в году: x
В високосном году - 366 дней, тогда как в обычном - 365.
1) если год делится без остатка на 400 это високосный год;
2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
*/

public class LeapYear {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int year = Integer.parseInt(bufferedReader.readLine());
        daysInAYear(year);
    }
    public static void daysInAYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");
    }
}

//if тво дней в году: 365");