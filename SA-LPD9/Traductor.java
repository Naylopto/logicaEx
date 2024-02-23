import java.util.HashMap;
import java.util.Scanner;

public class Traductor {
    public static void main(String[] args) {
        HashMap<String, String> tradiccionario = crearDiccionarioT();
        Scanner sc = new Scanner(System.in);


        while (true) {
            String input = sc.nextLine();
            if (input.equals("salir")) {
                break;
            }

            if (tradiccionario.containsKey(input)) {
                System.out.println(tradiccionario.get(input));
            } else {
                System.out.println(" Lo sentimos la palabra ingresada no se encuentra en el diccionario");
            }
        }

        sc.close();
    }

    public static HashMap<String, String> crearDiccionarioT() {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Amor", "Love");
        diccionario.put("Gato", "Cat");
        diccionario.put("Familia", "Family");
        diccionario.put("Amigo", "Friend");
        diccionario.put("Musica", "Music");
        diccionario.put("Comida", "Food");
        diccionario.put("Libro", "Book");
        diccionario.put("Noche", "Night");
        diccionario.put("Casa", "House");
        diccionario.put("Escuela", "School");
        diccionario.put("Trabajo", "Job");
        diccionario.put("Ciudad", "City");
        diccionario.put("Pais", "Country");
        diccionario.put("Mundo", "World");
        diccionario.put("Dia", "Day");
        diccionario.put("Tarde", "Afternoon");
        diccionario.put("Mañana", "Morning");
        diccionario.put("Triste", "Sad");
        diccionario.put("Feliz", "Happy");
        diccionario.put("Adios", "Goodbye");
        return diccionario;
    }
}
