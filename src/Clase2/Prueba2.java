package Clase2;

import java.util.Scanner;

public class Prueba2 {
    public static void main(String[] args) {
        /*
        // SINTAXIS:
        // acceso tipo nombreDeVariable = asignacion;
        int edad = 22;
        System.out.println("edad vieja: " + edad);

        // ASIGNACION DINAMICA
        Scanner ingresoDeDato = new Scanner(System.in);
        System.out.println("Ingresa la nueva edad: ");
        int nuevaEdad = ingresoDeDato.nextInt();

        if (nuevaEdad > 18) {
            System.out.println("Sos mayor de edad");
        }
        System.out.println("La nueva edad es: " + nuevaEdad);
        */

        // EJ: pedir la edad de todos los del aula
        Scanner ingresoDeDato = new Scanner(System.in);
        int cantidad = 4; //en el aula hay 61
        int edades; //inicializar variable para guardar las edades

        //calcular el promedio de edades
        int sumaEdades = 0; // inicializar contadores en 0 = ELEMENTO NEUTRO DE LA OPERACION
        float promedio;


        for(int alumno = 0; alumno < cantidad; alumno++) {
            System.out.printf("Ingresa tu edad: "); // printf --> formateo de texto (int, float, etc)
            // NEXT INT:
            // metodo de scanner - lee el proximo numero entero que el usuario ingresa por teclado
            edades = ingresoDeDato.nextInt(); //ingreso de cada edad, 4 veces

            //para promedio
            sumaEdades = sumaEdades + edades; //sumaEdades += edades;
        }
        // casteo: forzar un dato a que sea de otro tipo momentaneamente
        promedio = sumaEdades / cantidad;
        // atajo de teclado para println: sout
        System.out.println("Promedio: " + promedio);

    }

}
