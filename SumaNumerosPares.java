package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class SumaNumerosPares {
    public static int sumaNumerosPares(List<Integer> lista) {
        int total = 0;
        for (int num : lista) {
            if (num % 2 == 0) {
                total += num;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> miLista = new ArrayList<>();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(5);
        miLista.add(6);

        int resultado = sumaNumerosPares(miLista);
        System.out.println("La suma de los números pares es: " + resultado);
    }
}
