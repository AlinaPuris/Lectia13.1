import java.util.ArrayList;
import java.util.*;
import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> ex1 = new ArrayList<>();
        ex1.add("Ma scol");
        ex1.add("Maninc");
        ex1.add("Adorm");
        System.out.println(ex1);

        Set<String> ex2 = new HashSet<>();
        ex2.add("Mama");
        ex2.add("Tata");
        ex2.add("Mama");
        System.out.println(ex2);

        Map<String, String> dictionar = new HashMap<>();
        dictionar.put("gheata", "ice");
        dictionar.put("foc", "fire");
        dictionar.put("apa", "water");

        for (Map.Entry<String, String> entry : dictionar.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}