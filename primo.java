import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        if (esPrimo(num)) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;

        // Caso especial para 2
        if (n == 2) return true;

        // Si es par y mayor que 2, no es primo
        if (n % 2 == 0) return false;

        // Solo probar impares desde 3 hasta √n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}