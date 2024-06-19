package com.mycompany.ejercicios;

public class InvertirCadena {
    public static String invertir(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado.append(cadena.charAt(i));
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        String miCadena = "Hola Mundo";
        String cadenaInvertida = invertir(miCadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
}
