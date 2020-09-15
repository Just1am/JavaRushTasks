package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.
*/

public class Svetofor {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
     InputStreamReader  inputStreamReader = new InputStreamReader(System.in);
     BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        double green = 3, yellow =1, red = 1;
       // System.out.println("Введите время выхода на пп");
        double timeToDie = Double.parseDouble(bufferedReader.readLine());
        System.out.println(trafficLightsColour(green, yellow, red, timeToDie));
    }

    public static String trafficLightsColour(double green, double yellow, double red, double timeToDie){
        double trafficLightsPeriod = red + yellow + green;
        double momentInPeriod = timeToDie % trafficLightsPeriod;
        if (momentInPeriod < green)
            return "зелёный";
        else if (momentInPeriod < green + yellow)
            return "жёлтый";
                else return "красный";



    }
}