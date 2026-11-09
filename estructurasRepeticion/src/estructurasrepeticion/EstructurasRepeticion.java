/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasrepeticion;
import java.util.Scanner;

import java.util.Random;

/**
 *
 * @author laure
 */
public class EstructurasRepeticion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        //Ejercicio 1
        System.out.println("Bienvenido al programa de Monitoreo de Estabilidad de Red Inalambrica");

        float señalBase = 0;
        int mediciones = 0;

        while(señalBase != -1){
            System.out.println("Ingresa el nivel de señal base en dBm (un valor positivo o -1 para salir)");
            señalBase = sc.nextFloat();

            if(señalBase != -1){
                int ruidoInterferencia = rd.nextInt(51);

                if(señalBase < 20 || ruidoInterferencia > 40){
                    System.out.println("Alerta: Conexion inestable por baja señal o alta interferencia");
                }else{
                    System.out.println("Conexion Estable");
                }

                mediciones ++;
            }

        }//fin de while

        System.out.printf("Cantidad de mediciones: %d\n", mediciones);


        //Ejercicio 2
        System.out.println("\nBienvenido al sistema de Calibracion de Motores Paso a Paso");

        int opcion = 0;

        do{
            System.out.println("1) Calibrar Eje X");
            System.out.println("2) Calibrar Eje Y");
            System.out.println("3) Salir del modo calibracion");
            System.out.println("Selecciona una opcion:");
            opcion = sc.nextInt();

            switch(opcion){

                case 1:
                    double errorX = rd.nextDouble() * 5;

                    if(errorX > 2.5){
                        System.out.printf("Calibracion del eje fallida: Error de %.2f mm. Requiere ajuste manual\n", errorX);
                    }else{
                        System.out.printf("Eje calibrado exitosamente con error de %.2f mm\n", errorX);
                    }
                    break;

                case 2:
                    double errorY = rd.nextDouble() * 5;

                    if(errorY > 2.5){
                        System.out.printf("Calibracion del eje fallida: Error de %.2f mm. Requiere ajuste manual\n", errorY);
                    }else{
                        System.out.printf("Eje calibrado exitosamente con error de %.2f mm\n", errorY);
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del modo calibracion");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;

            }//fin de switch

        }while(opcion != 3);//fin de do while


        //Ejercicio 3
        System.out.println("\nBienvenido al programa de Simulacion de Atenuacion de Fibra Optica");

        double potenciaInicial = 0;
        int distancia = 0;

        System.out.println("Ingresa la potencia inicial del laser en mW");
        potenciaInicial = sc.nextDouble();

        while(potenciaInicial <= 0){
            System.out.println("La potencia debe ser mayor a 0. Ingresa nuevamente:");
            potenciaInicial = sc.nextDouble();
        }

        System.out.println("Ingresa la distancia total del cable en kilometros");
        distancia = sc.nextInt();

        while(distancia <= 0){
            System.out.println("La distancia debe ser mayor a 0. Ingresa nuevamente:");
            distancia = sc.nextInt();
        }

        double potenciaActual = potenciaInicial;

        for(int i = 1; i <= distancia; i++){

            potenciaActual = potenciaActual * 0.96;

            System.out.printf("Kilometro %d: Potencia restante: %.2f mW\n", i, potenciaActual);

            if(potenciaActual < 5){
                System.out.println("Perdida de señal critica en el kilometro " + i + ". Se requiere un repetidor.");
                break;
            }

        }//fin de for

        sc.close();

    }//fin de main

}//fin de clase