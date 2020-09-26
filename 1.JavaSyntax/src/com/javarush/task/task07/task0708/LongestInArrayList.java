package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки
*/

public class LongestInArrayList {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        String buffer;
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size() - 1 - i; j++) {
                if (strings.get(j).length() > strings.get(j + 1).length()){
                    buffer = strings.get(j+1);
                    strings.set(j+1, strings.get(j));
                    strings.set(j, buffer);
                }
            }
        }  // Сортировка ArrayList по возрастанию

        int k = strings.size() - 1;
        do {
            System.out.println(strings.get(k));
            k--;
        }
        while
            (strings.get(k).length() == strings.get(k+1).length()); // Вывод самой длинной строки в списке и равных ей

    }
}
