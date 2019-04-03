/**
 * Clase Maim.
 * Clase encargada de la interacción con el usuario. Lee el archivo de texto.
 *
 * @author Marco Fuentes y Abril Palencia
 * @since 02/04/2019
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Maim {
    public static void main (String args[]){
        try{
            VectorHeap<Paciente> queue = new VectorHeap<>();
    // leer el archivo de texto que contiene a los pacientes
            String sCadena;
            BufferedReader bf = new BufferedReader(new FileReader("pacientes.txt"));
            while ((sCadena = bf.readLine())!=null) {
                String[] px = sCadena.split(",");
                queue.add(new Paciente(px[0],px[1],px[2]));
            }

            String menu = "             Hospital \n" +
                    " 1. Ver el siguiente paciente en la sala de espera\n" +
                    " 2. Agregar un nuevo paciente \n" +
                    " 3. Cerrar por hoy";
            String respuesta ="";
            while (!respuesta.equals("3")){
                System.out.println(menu);
                Scanner teclado = new Scanner(System.in);
                respuesta=teclado.nextLine();
                switch (respuesta) {
                    case "1":
                        System.out.println("\n3" + queue.remove().toString() + "\n");
                        break;
                    case "2":
                        System.out.println("Nombre del paciente: ");
                        Scanner r = new Scanner(System.in);
                        String nombre = r.nextLine();

                        System.out.println("Sintoma: ");
                        Scanner j = new Scanner(System.in);
                        String sintoma = j.nextLine();

                        System.out.println("Prioridad: ");
                        Scanner k = new Scanner(System.in);
                        String prioridad = k.nextLine();

                        queue.add(new Paciente(nombre, sintoma, prioridad));
                        break;
                    case "3":
                        System.out.println("Hasta luego!");
                        break;
                    default:
                        System.out.println("Ese dato no es válido");
                        break;
                }
            }
        }catch(Exception e){
            if(e instanceof NoSuchElementException){
                System.out.println("Ya no hay mas pacientes! :D");
            }
            else if (e instanceof FileNotFoundException){
                System.out.println("No se pudo encontrar el archivo o hay problemas con este....");
            }else{
                System.out.println("Algo salio mal... :(");
            }
        }
    }
}