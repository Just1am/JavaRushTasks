package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.
*/

public class MaximumOfFour {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());
        System.out.println(maxofFour(a, b, c, d));
    }
    public static int maxofFour(int a, int b, int c, int d) {
        return maxofTwo(maxofTwo(a, b), maxofTwo(c, d));
    }
    public static int maxofTwo(int a, int b) {
        if (a >= b)
            return a;
        else return b;
    }
}
