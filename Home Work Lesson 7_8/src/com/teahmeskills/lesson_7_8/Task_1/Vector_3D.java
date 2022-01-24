package com.teahmeskills.lesson_7_8.Task_1;

/**
 * Создайте класс, который описывает вектор в трехмерной системе координат.
 * У каждого класса должны быть:
 *		конструктор с параметрами в виде списка координат (например, x, y, z);
 *		метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt();
 *		метод, вычисляющий скалярное произведение;
 * 		метод сложения векторов;
 *		метод разности векторов;
 *		статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
 */

public class Vector_3D extends AllVector {

    private double z;

    public Vector_3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double vectorLength (){
        double length;
        length = Math.sqrt(x * x + y * y + z * z);
        return length;
    }

    public double scalarProduct (Vector_3D vector_3D1){
        double product;
        product = x * vector_3D1.x + y * vector_3D1.y + z * vector_3D1.z;
        return product;
    }

    public double additionVector () {
        double addition;
        addition = Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
        return addition;
    }

    public double subtractionVector(){
        double subtraction;
        subtraction = Math.sqrt(Math.pow(x,2) - Math.pow(y,2) - Math.pow(z,2));
        return subtraction;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector_3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}