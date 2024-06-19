package com.mycompany.ejercicios;

public class MaximoComunDivisor {
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        int mcd = calcularMCD(num1, num2);
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd);
    }
}
