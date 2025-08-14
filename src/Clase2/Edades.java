package Clase2;

import java.util.Scanner;

public class Edades {
    public static void main(String[] args) {
        Scanner ingresoDeDato = new Scanner(System.in);

        int cantidadEstudiantes = 4;
        // LISTA | ARREGLOS | ARRAYS
        // ____ ____ ____ ____ --> tamaño fijo + add + append
        // SINTAXIS LISTAS
        // tipoDeDato[] nombreLista = new = int[cantidadElementos]
        int[] listaEdades = new int[cantidadEstudiantes]; // cantidad de elementos en la lista


        for(int alumnos = 0; alumnos < cantidadEstudiantes; alumnos++) {
            System.out.println("Ingresar edad: ");
            listaEdades[alumnos] = ingresoDeDato.nextInt(); // guardar en la posicion actual (alumnos) el dato ingresado
        }
    }
}
