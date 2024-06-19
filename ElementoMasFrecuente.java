package com.mycompany.ejercicios;

import java.util.*;

public class ElementoMasFrecuente {
    public static int encontrarElementoMasFrecuente(List<Integer> lista) {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int num : lista) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }
        int maxFrecuencia = 0;
        int elementoMasFrecuente = 0;
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                elementoMasFrecuente = entry.getKey();
            }
        }
        return elementoMasFrecuente;
    }

    public static void main(String[] args) {
        List<Integer> miLista = Arrays.asList(2, 4, 6, 4, 8, 4, 10);
        int resultado = encontrarElementoMasFrecuente(miLista);
        System.out.println("El elemento más frecuente es: " + resultado);
    }
}
