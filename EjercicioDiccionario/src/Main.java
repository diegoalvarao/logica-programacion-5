import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap Diccionario = new HashMap();
        Diccionario.put("Hola", "Hello");
        Diccionario.put("Casa", "House");
        Diccionario.put("Perro", "Dog");
        Diccionario.put("Gato", "Cat");
        Diccionario.put("Pinguino", "Penguin");
        Diccionario.put("Avion", "Airplane");
        Diccionario.put("computador", "computer");
        Diccionario.put("novio", "boyfriend");
        Diccionario.put("novia", "girlfriend");
        Diccionario.put("esposo", "husband");
        Diccionario.put("esposa", "wife");
        Diccionario.put("carrera", "race");
        Diccionario.put("rey", "king");
        Diccionario.put("mesa", "table");
        Diccionario.put("oveja", "sheep");
        Diccionario.put("soldado", "soldier");
        Diccionario.put("edificio", "building");
        Diccionario.put("piramide", "pyramid");
        Diccionario.put("ingeniero", "engineer");
        Diccionario.put("codigo", "code");

        //Escoger 5 palabras aleatorios
        List<String> palabrasEspañol = new ArrayList<>(Diccionario.keySet());
        Collections.shuffle(palabrasEspañol);
        List<String> palabrasAleatorias = palabrasEspañol.subList(0,5);

//
        Scanner sc = new Scanner(System.in);
        int aciertos = 0;
        int equivocaciones = 0;

        System.out.println("Prueba de Diccionario");
        for (String palabra: palabrasAleatorias) {
            System.out.print("Escriba "+ palabra + " En espáñol: ");
            String intento = sc.next();
            String respuestaCorrecta = (String) Diccionario.get(palabra);

            if (intento.equalsIgnoreCase(respuestaCorrecta)){
                System.out.println("Correcto!");
                aciertos ++;
            } else{
                System.out.println("Incorrecto, la respueta era: " + respuestaCorrecta);
                 equivocaciones ++;
            }
        }

        System.out.println("Tuviste " + aciertos + " aciertos");
        System.out.println("y " + equivocaciones + " equivocaciones");



    }
}