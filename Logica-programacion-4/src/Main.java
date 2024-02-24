
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> diccionario = getStringStringMap();


        String[] arr =  diccionario.keySet().toArray(new String[0]);
        int count = 1;
        int palabrasCorrectas = 0;
        for (int i = 0; i < 5; i++) {
            int numeroRandom = (int) Math.floor((Math.random()*diccionario.size()));

            System.out.println("LA PALABRA N#" +count + "/5 A TRADUCIR ES");
            System.out.println( (count++) +" : " + arr[numeroRandom]);
            String palabraTraducida = scanner.next();
            if (diccionario.get(arr[numeroRandom]).equals(palabraTraducida)){
                System.out.println("Muy bien la palabra esta traducida correctamente");
                ++palabrasCorrectas;
            }else{
                System.out.println("Muy mal la palabra esta traducida incorrectamente");
            }
        }
        System.out.println("Tus palabras correctas fueron: " + palabrasCorrectas);
        System.out.println("Tus palabras incorrectas fueron: " + (5 - palabrasCorrectas));
    }

    private static Map<String, String> getStringStringMap() {
        Map<String,String> diccionario = new HashMap<>();
        diccionario.put("Puerta", "Door");
        diccionario.put("Llave", "Key");
        diccionario.put("Helado", "Ice Cream");
        diccionario.put("Zapato", "Shoe");
        diccionario.put("Gato", "Cat");
        diccionario.put("Reloj", "Watch");
        diccionario.put("Camisa", "shirt");
        diccionario.put("Pan", "Bread");
        diccionario.put("Pantalla", "Screen");
        diccionario.put("Casa", "House");
        diccionario.put("Billetera", "Wallet");
        diccionario.put("Arroz", "Rice");
        diccionario.put("Ventana", "Window");
        diccionario.put("Viento", "Wind");
        diccionario.put("Fuego", "Fire");
        diccionario.put("Agua", "Water");
        diccionario.put("Arma", "Gun");
        diccionario.put("Balon", "Ball");
        diccionario.put("Cabeza", "Head");
        diccionario.put("Regla", "Ruler");
        return diccionario;
    }
}