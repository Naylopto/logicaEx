import java.util.Scanner;

public class PalabraIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingresa una palabra ");
        String palabra = sc.nextLine();
        String palabraInvertida = " ";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }
        System.out.println();
        System.out.println(" la palabra que ingresaste invertida es: ");
        System.out.println(palabraInvertida);
        sc.close();
    }
}