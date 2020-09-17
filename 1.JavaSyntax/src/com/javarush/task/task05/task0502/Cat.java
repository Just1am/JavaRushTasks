package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;
    public static int score;
    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        score = 0;
        score(this.age, anotherCat.age);
        score(this.weight, anotherCat.weight);
        score(this.strength, anotherCat.strength);
        return score > 0;

    }
    public static void score(int attribute1, int attribute2) {
        if (attribute1 > attribute2)
            score++;
        else if (attribute1 < attribute2)
            score--;
    }

    public static void main(String[] args) {

    }
}
