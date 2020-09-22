package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class BodyWeightIndex {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double weightIndex = weight / (height * height);
            if  (weightIndex >= 25){
                if (weightIndex < 30){
                    System.out.println("Избыточный вес: между 25 и 30");
                }
                else {
                    System.out.println("Ожирение: 30 или больше");
                }
            }
            else {
                if (weightIndex >= 18.5){
                    System.out.println("Нормальный: между 18.5 и 25");
                }
                else {
                    System.out.println("Недовес: меньше чем 18.5");
                }
            }

        }



    }
}
