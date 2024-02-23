import java.util.Scanner;

public class horas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Variables para almacenar la entrada del usuario estas se obtienen por medio del scanner
        String diaSemana;
        int hora, minutos;
        
        // Variables para el cálculo de minutos hasta el fin de semana
        int minutosHastaFinSemana = 0;
        int minutosPorDia = 24 * 60; 
        
        // Bucle para solicitar al usuario el día de la semana while se ocupa para ejecutar en bucle 
        //un conjunto de instrucciones hasta que se cumpla una condición determinada
    
        do {
            System.out.print("Ingrese un día de la semana (lunes a viernes): ");
            diaSemana = sc.nextLine().toLowerCase();
        } while (!diaSemana.equals("lunes") && !diaSemana.equals("martes") && !diaSemana.equals("miércoles")
                && !diaSemana.equals("jueves") && !diaSemana.equals("viernes"));
        
        // Solicitar la hora
        do {
            System.out.print("Ingrese la hora (0-23): ");
            hora = sc.nextInt();
        } while (hora < 0 || hora > 23);
        
        // Solicitar los minutos
        do {
            System.out.print("Ingrese los minutos (0-59): ");
            minutos = sc.nextInt();
        } while (minutos < 0 || minutos > 59);
        
        // Calcula los minutos hasta el fin de semana
        switch (diaSemana) {
            case "lunes":
                minutosHastaFinSemana = ((4 * minutosPorDia) - ((hora * 60) + minutos));
                break;
            case "martes":
                minutosHastaFinSemana = ((3 * minutosPorDia) - ((hora * 60) + minutos));
                break;
            case "miércoles":
                minutosHastaFinSemana = ((2 * minutosPorDia) - ((hora * 60) + minutos));
                break;
            case "jueves":
                minutosHastaFinSemana = ((1 * minutosPorDia) - ((hora * 60) + minutos));
                break;
            case "viernes":
                minutosHastaFinSemana = ((15 * 60) - ((hora * 60) + minutos));
                break;
        }
        sc.close();
        // Muestra el resultado con una concatenacion 
        System.out.println("Faltan " + minutosHastaFinSemana + " minutos para el fin de semana.");
    }
}

