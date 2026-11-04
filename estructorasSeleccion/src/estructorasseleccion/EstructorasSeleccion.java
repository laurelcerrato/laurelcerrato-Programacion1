/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructorasseleccion;
import java.util.Scanner;
/**
 *
 * @author laure
 */
public class EstructorasSeleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. Alarma de Voltaje en Capacitores (Selección Simple)
        Scanner sc =  new Scanner(System.in);
        float voltajeNominal = 0;
        float voltajeActual = 0;
        System.out.println("Bienvenido al programa de alarma de voltaje en capacitores");
        System.out.println("Necesitaremos que ingreses el Voltaje nominal(maximo) del capacitor y el Voltaje Actual medido en el circuito");
        System.out.println("Ingresa el Voltaje nominal(maximo) del capacitor");
        voltajeNominal= sc.nextFloat();
        System.out.println("Ingresa el Voltaje Actual medido en el circuito");
        voltajeActual= sc.nextFloat();
        float porcentajeCarga = (voltajeActual/voltajeNominal) * 100;
        System.out.printf("El porcentaje de carga es %.2f%%\n", porcentajeCarga);

        if(voltajeActual > 0.85*voltajeNominal){
            System.out.println("ALERTA: Riesgo de sobretensión. Disminuya la fuente");
        }
        //2. Clasificador de Señal Digital TTL (Selección Doble)
        System.out.println("Bienvenido al programa de Clasificador de Señal Digital TTL ");
        System.out.println("Ingresa un valor de voltaje leído por un microcontrolador. ");
        double voltaje = sc.nextDouble();
        if(voltaje >= 2.0){
            System.out.println("Estado Lógico: ALTO (1)");
        }else{
            System.out.println("Estado Lógico: BAJO (0)");
        }
        //3. Configurador de Tasa de Baudios para Puerto Serial (Selección Múltiple - switch)
System.out.println("Bienvenido al  Configurador de Tasa de Baudios para Puerto Serial");

System.out.println("Selecciona la cantidad de baudios: ");
System.out.println("1. = 9600 baudios");
System.out.println("2. = 19200 baudios");
System.out.println("3. = 115200 baudios");
int baudios = sc.nextInt();
switch(baudios){
    case 1:
        int opcion1 = 9600;
        System.out.printf("Configurando puerto serial a %d bps\n", opcion1);
        break;
    case 2:
        int opcion2 = 19200;
        System.out.printf("Configurando puerto serial a %d bps\n", opcion2);
        break;
    case 3:
        int opcion3 = 115200;
        System.out.printf("Configurando puerto serial a %d bps\n", opcion3);
        break;
    default:
        System.out.println("Opción no válida, usando 9600 bps por defecto.\n");
        break; 
}
//4. Control de Acceso a Base de Datos (Selección Anidada)
System.out.println("Bienvenido al programa de Control de Acceso a Base de Datos");
System.out.println("Ingresa un nombre de administrador: ");
String nombre = sc.next();
System.out.println("Ingresa un PIN(4 DIGITOS): ");
int pin = sc.nextInt();
if(nombre.equals("admin")){
    if( pin == 1234){
        System.out.println("Acceso concedido al motor de base de datos");
    }else{
        System.out.println("PIN incorrecto, acceso denegado");
    }
}else{
    System.out.println("Usuario no Encontrado.");
}
    }//fin de main
    
}//fin de clase
