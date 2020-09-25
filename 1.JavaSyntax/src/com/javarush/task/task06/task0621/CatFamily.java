package com.javarush.task.task06.task0621;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
*/

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String motherName = reader.readLine();
//        Cat catMother = new Cat(motherName);
//
//        String daughterName = reader.readLine();
//        Cat catDaughter = new Cat(daughterName, catMother);
//
//        System.out.println(catMother);
//        System.out.println(catDaughter);
//    }
//
//    public static class Cat {
//        private String name;
//        private Cat parent;
//
//        Cat(String name) {
//            this.name = name;
//        }
//
//        Cat(String name, Cat parent) {
//            this.name = name;
//            this.parent = parent;
//        }
//
//        @Override
//        public String toString() {
//            if (parent == null)
//                return "The cat's name is " + name + ", no mother ";
//            else
//                return "The cat's name is " + name + ", mother is " + parent.name;
//        }
//    }
//
//}
public class CatFamily {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandPaName = reader.readLine();
        Cat catGrandPa = new Cat(grandPaName, null, null);

        String grandMaName = reader.readLine();
        Cat catGrandMa = new Cat(grandMaName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandPa, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandMa);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);


        System.out.println(catGrandPa);
        System.out.println(catGrandMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }


        @Override
        public String toString() {
            if (father == null) {
                if (mother == null) {
                    return "The cat's name is " + name + ", no mother, no father";
                } else {
                    return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
                }
            }
            else {
                if (mother == null){
                    return "The cat's name is " + name + ", no mother, father is " + father.name;
                }
                else {
                    return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
                }
            }

        }
    }

}
