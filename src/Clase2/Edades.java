package Clase2;

import java.util.Scanner;

public class Edades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suma = 0;

        int cantidadEstudiantes = 4;
        // LISTA | ARREGLOS | ARRAYS
        // ____ ____ ____ ____ --> tamaño fijo + add + append
        // SINTAXIS LISTAS
        // tipoDeDato[] nombreLista = new = int[cantidadElementos]
        int[] listaEdades = new int[cantidadEstudiantes]; // cantidad de elementos en la lista

        // modularizar: un algoritmo para cada tarea

        // 1. ingresar los datos
        for(int alumnos = 0; alumnos < cantidadEstudiantes; alumnos++) {
            System.out.println("Ingresa la edad del estudiante " + alumnos + ": ");
            // cargar los datos en la lista
            listaEdades[alumnos] = input.nextInt(); // guardar en la posicion actual (alumnos) el dato ingresado
        }

        // 2. sumar los datos
        for(int alumnos = 0; alumnos < cantidadEstudiantes; alumnos++) {
            suma = suma + listaEdades[alumnos];
        }

        System.out.println("Suma: " + suma);
        // mostrar los datos
        for(int alumnos = 0; alumnos < cantidadEstudiantes; alumnos++) {
            System.out.println("Datos: edades --> " + listaEdades[alumnos]);
        }

    }
}
