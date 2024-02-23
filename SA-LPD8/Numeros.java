import java.util.Scanner;

public class Numeros {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numOrd = new int[10];
        int[] numIng = new int[10];
        int pPrimos = 0; 
        int pNoPrimos = numOrd.length - 1;
        
        System.out.println("Bienvenido, ingresa tus numeros.");

        for (int i = 0; i < numOrd.length; i++) {
        	
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            int numUsuario = Integer.valueOf(sc.nextLine());
            
            numIng[i] = numUsuario;
            
            boolean primo = esPrimo(numUsuario);
            
            if (primo) {
                numOrd[pPrimos] = numUsuario;
                pPrimos++;
            } else {
                numOrd[pNoPrimos] = numUsuario;
                pNoPrimos--;
            }
        }
        
        System.out.println("\nposicion | valor");
        imprimirArray(numIng);
        System.out.println();
        imprimirArray(numOrd);

        sc.close();
    }

    public static boolean esPrimo(int numIngresado) {
        if (numIngresado <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numIngresado); i++) {
            if (numIngresado % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void imprimirArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println( i + " = " + arreglo[i]);
        }
    }
}