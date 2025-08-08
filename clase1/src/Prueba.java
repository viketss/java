
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) { //main
        //print
        System.out.print("Tom\n");
        System.out.println("Cruise"); //println = \n

        //VARIABLES
        // privacidad tipoDeDato nombreVariable;
        /* strings (cadenas) - int (numeros enteros) - float (numeros decimales)
         double (decimales mas grandes) - boolean (true o false)*/
        String nombre1 = "vi";
        System.out.println(nombre1);
        int edad = 22;
        //variables en el print
        System.out.println(nombre1 + " tiene " + edad);

        // ASIGNACION DINAMICA: el usuario ingresa y se asigna a la variable
        // input -- archivos
        //INPUT
        Scanner scanner = new Scanner(System.in); // crear instancia de scanner --> generar input
        // new - reservar espacio de memoria - constructores de clases
        System.out.print("Ingrese un número: ");
        int legajo = scanner.nextInt(); //input
        System.out.println("El legajo es: " + legajo);

        //INSTRUCCIONES BASICAS

        //if condicional
        if ( legajo > 1000 /*condicion */) {
            System.out.println("Legajo abierto con exito:" + legajo);
        }
        //else if
        else {
            System.out.println("no se encontro el legajo");
        }

        //for
        for (int iterador = 0; iterador <= 4; iterador ++) { //iterador++ aumenta de a 1
            System.out.println("Indice del iterador: " + iterador);
        }

        //while
        int numeros = 6;
        while(numeros <= 12) {
            System.out.println("Numero: " + numeros);
            numeros++;
        }

    }

}
