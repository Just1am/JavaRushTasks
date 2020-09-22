package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class EvenAndOdd {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n;
        n = Integer.parseInt(reader.readLine());
        while (n <= 0){
            System.out.println("Введенное число меньше либо равно нулю, повторите ввод:");
            n = Integer.parseInt(reader.readLine());
        }
        while (n % 10 != 0) {
            if (n % 10 % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            n = n / 10;
        }
        System.out.println("Even: " + even +" "+ "Odd: " + odd);
    }
}
