package com.teahmeskills.lesson_7_8.Task_1;

/**
 * Создайте класс, который описывает вектор в двумерной системе координат.
 * У каждого класса должны быть:
 *		конструктор с параметрами в виде списка координат (например, x, y, z);
 *		метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt();
 *		метод, вычисляющий скалярное произведение;
 * 		метод сложения векторов;
 *		метод разности векторов;
 *		статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
 */

public class Vector_2D extends AllVector {

    public Vector_2D(double x, double y) {

        super(x, y);
    }

    public double vectorLength (){
        double length;
        length = Math.sqrt(x * x + y * y);
        return length;
    }

    public double scalarProduct (Vector_2D vector_2D){
        double product;
        product = x * vector_2D.x + y * vector_2D.y;
        return product;
    }

    public double additionVector () {
        double addition;
        addition = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return addition;
    }

    public double subtractionVector(){
        double subtraction;
        subtraction = Math.sqrt(Math.pow(x,2) - Math.pow(y,2));
        return subtraction;
    }

    @Override
    public String toString() {
        return "Vector_2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}