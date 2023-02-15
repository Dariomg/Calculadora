package Calculadora;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("Introduzca el primer número: ");
        a = sc.nextDouble();
        System.out.print("Introduzca el segundo número: ");
        b = sc.nextDouble();
        
        Principal operacion = new Principal(a, b);
        
        boolean salir = false;
        while (!salir) {
            System.out.println("Elija el tipo de operación a realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los números es: " + operacion.suma());
                    break;
                case 2:
                    System.out.println("La resta de los números es: " + operacion.resta());
                    break;
                case 3:
                    System.out.println("La multiplicación de los números es: " + operacion.multiplicacion());
                    break;
                case 4:
                    try {
                        System.out.println("La división de los números es: " + operacion.division());
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
        
        sc.close();
   
	}

}
