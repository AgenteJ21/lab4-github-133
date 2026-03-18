import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        boolean esPrimo = true;

        if (num <= 1) {
            esPrimo = false;
        } else {
            // Optimización: comprobar hasta la raíz cuadrada
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo)
            System.out.println(num + " es un número primo.");
        else
            System.out.println(num + " no es un número primo.");
        
        scanner.close();
    }
}
