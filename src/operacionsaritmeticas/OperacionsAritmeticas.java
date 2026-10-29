/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionsaritmeticas;
import java.util.Scanner;
/**
 *
 * @author laure
 */
public class OperacionsAritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        //Ejercicio 1.
        System.out.println("Ejercicio 1");
        System.out.println("Bienvenido a la Calculadora de Energía Cinética");
        System.out.println("Necesitaremos que nos des la masa en kilogramos y su velocidad en metros por segundo");
        System.out.println("Masa en kilogramos: ");
        double masa = 0;
        masa = sc.nextDouble();
        System.out.println("Velocidad en metros por segundo: ");
        double velocidad = 0;
        velocidad = sc.nextDouble();
        double energia = 0.5 * masa * Math.pow(velocidad,2);
        System.out.printf("La energia es %.2f joules" , energia);
        
//Ejercicio 2.
System.out.println("\nEjercicio 2");
System.out.println("Bienvenido a la Calculadora de Salario Semanal");
        System.out.println("Necesitaremos que nos des tu pago por hora y la cantidad de horas que trabjaste esta semana");
        System.out.println("Pago por hora: ");
        double pagoHora = 0;
        pagoHora = sc.nextDouble();
        System.out.println("Horas trabajadas esta semana: ");
        int horasSemanales = 0;
        horasSemanales= sc.nextInt();
        double salarioBruto = 0;
        double deduccion = 0;
        double salarioNeto = 0;
        double porcentajeDeduccion = 8.0;
        salarioBruto = horasSemanales * pagoHora;
        deduccion = salarioBruto * (porcentajeDeduccion / 100);
        salarioNeto = salarioBruto - deduccion;  
        System.out.printf("Tu Salario Bruto es: %.2f", salarioBruto);
        System.out.printf("\nTu Deduccion es: %.2f", deduccion);
        System.out.printf("\nTu Salario Neto es: %.2f", salarioNeto);

        //Ejercicio 3.
        System.out.println("\nEjercicio 3");
        System.out.println("Bienvenido a la Calculadora de distancia entre dos puntos");
        System.out.println("Necesitaremos que nos des las coordenadas de dos puntos en un plano cartesiano, ej: (x1, y1) y (x2, y2)");
        System.out.println("Coordenada x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Coordenada y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Coordenada x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Coordenada y2: ");
        double y2 = sc.nextDouble();
        double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.printf("\nLa distancia es %.2f ", distancia);
    }//fin de main
    
}//fin de class
