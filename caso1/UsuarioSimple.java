package caso1;
import java.util.Scanner;
public class UsuarioSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	
        System.out.println("Por favor, ingresa solo tu primer apellido :");
        String nombre = scanner.nextLine();

        System.out.println("Ahora, ingresa tu edad:");
        int edad = scanner.nextInt();

        System.out.println("\n--- Datos del Usuario ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("¡Hola, " + nombre + "! El próximo año tendrás " + (edad + 1) + " años.");

        scanner.close();
    }
}