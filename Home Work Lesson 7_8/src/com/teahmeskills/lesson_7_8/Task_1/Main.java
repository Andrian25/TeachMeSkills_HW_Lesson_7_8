package com.teahmeskills.lesson_7_8.Task_1;

/**
 * Создайте класс, который описывает вектор в двумерной системе координат.
 * Создайте класс, который описывает вектор в трехмерной системе координат.
 * У каждого класса должны быть:
 * 		конструктор с параметрами в виде списка координат (например, x, y, z);
 * 		метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt();
 * 		метод, вычисляющий скалярное произведение;
 * 		метод сложения векторов;
 * 		метод разности векторов;
 * 		статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
 * 	Предусмотреть сравнение векторов через метод equals.
 * 	Вывести информацию о векторе используя метод toString.
 */

public class Main {

    public static void main(String[] args) {

        Vector_2D vector_2D = new Vector_2D( 23, -10);
        Vector_2D vector_2D1 = new Vector_2D( 3, -1 );
        Vector_3D vector_3D = new Vector_3D( 33, 21, -1);
        Vector_3D vector_3D1 = new Vector_3D( 3, 2, -10);
        Vector_3D vector_3D2 = new Vector_3D( 5, 10, -1);

        System.out.println("vectorLength: " + vector_2D.vectorLength());
        System.out.println("scalarProduct: " + vector_2D1.scalarProduct(vector_2D));
        System.out.println("additionVector: " + vector_2D.additionVector());
        System.out.println("subtractionVector: " + vector_2D.subtractionVector());
        System.out.println(" " + vector_2D);
        System.out.println("vectorLength: " + vector_3D.vectorLength());
        System.out.println("scalarProduct: " + vector_3D1.scalarProduct(vector_3D1));
        System.out.println("additionVector: " + vector_3D2.additionVector());
        System.out.println("subtractionVector " + vector_3D.subtractionVector());
        System.out.println("  " + vector_3D);



    }
}