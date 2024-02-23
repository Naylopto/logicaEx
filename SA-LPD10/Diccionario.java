import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Diccionario {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = crearDiccionario();
        HashMap<String, String> diccionarioMini = crearDiccionarioMini(diccionario);
        Scanner sc = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("Estas son 5 palabras en español, por favor ingresa su traduccion al ingles. (recuerda respetar la mayuscila al principio)");
        for (String esp : diccionarioMini.keySet()) {
            System.out.println(esp);
        }

        for (int i = 0; i < diccionarioMini.size(); i++) {
            System.out.print("Palabra en ingles: ");
            String input = sc.nextLine();

            if (diccionarioMini.containsValue(input)) {
                correctas += 1;
            } else {
                incorrectas += 1;
            }
        }

        System.out.println("Sacaste " + correctas + " palabras bien.");
        System.out.println("Sacaste " + incorrectas + " palabras mal.");

        sc.close();
    }

    public static HashMap<String, String> crearDiccionario() {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Hola", "Hello");
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
        diccionario.put("Ciudad", "city");
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

    public static HashMap<String, String> crearDiccionarioMini(HashMap<String, String> diccionario) {
        HashMap<String, String> diccionarioAleatorio = new HashMap<>();
        ArrayList<String> llaves = new ArrayList<>();
        Set<String> set = null;
        Random random = new Random();
        set = diccionario.keySet();
        for (String llave : set) {
            llaves.add(llave);
        }
        for (int i = 0; i < 5; i++) {
            int aleatorio = random.nextInt(llaves.size());
            String palabraEspaniol = llaves.remove(aleatorio);
            String palabraIngles = diccionario.remove(palabraEspaniol);
            diccionarioAleatorio.put(palabraEspaniol, palabraIngles);
        }
        return diccionarioAleatorio;
    }
}