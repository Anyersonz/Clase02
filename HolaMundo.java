import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        // Imprimir datos en pantalla / consola / terminal 
        System.out.println("Hola Anyerson!");

        System.out.print( "Como van las cosas");
        System.out.print(10);
        System.out.print(10.5);
        System.out.print('A');
        System.out.println();

        System.out.printf("Aqui va una cadena: %s%n", "Anyerson");
        System.out.printf("Aqui va una entero: %d%n", 10);
        System.out.printf("Mi nombre es %s y tengo %d años%n", "Anyerson Zamora", 25);

        var entrada = new Scanner(System.in);

        System.out.print("Por favor ingresa un numero entero:");
        var entero = entrada.nextLine();

        System.out.println(entero);

        entrada.close();
    }
}