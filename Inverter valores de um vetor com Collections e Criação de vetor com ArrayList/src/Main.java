import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void inverter(ArrayList arr) {
        Collections.reverse(arr);
    }
	
	public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);
        
        System.out.println("ArrayList original:");
        System.out.println(listaNumeros);
        
        inverter(listaNumeros);
        
        System.out.println("ArrayList invertido:");
        System.out.println(listaNumeros);
    }
}
