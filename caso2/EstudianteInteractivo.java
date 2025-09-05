package caso2;

import java.util.Scanner;

// Clase Estudiante
class Estudiante {
    private String nombre;
    private int id;
    private String curso;

    // Constructor
    public Estudiante(String nombre, int id, String curso) {
        this.nombre = nombre;
        this.id = id;
        this.curso = curso;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public void mostrarInfo() {
        System.out.println("\n--- Ficha del Estudiante ---");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Curso: " + curso);
    }
}

// Clase principal
public class EstudianteInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Creación de Nuevo Estudiante ---");
        System.out.print("Introduce el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el ID del estudiante: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Introduce el curso del estudiante: ");
        String curso = scanner.nextLine();

        // Crear instancia del estudiante
        Estudiante nuevoEstudiante = new Estudiante(nombre, id, curso);

        // Mostrar datos
        nuevoEstudiante.mostrarInfo();

        scanner.close();
    }
}
