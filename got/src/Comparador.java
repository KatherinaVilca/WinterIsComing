package src;

import java.util.Comparator;
import java.util.Map;

@SuppressWarnings("hiding")
public class Comparador<Object> implements Comparator<Object> {
	
	
	public Comparador(){
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public int compare(Object valor1, Object valor2) {

        int cantidad1= ( ( Map.Entry<String,Integer> ) (valor1) ). getValue ();
        int cantidad2= ( ( Map.Entry<String,Integer> ) (valor2) ). getValue ();

        return Integer.compare(cantidad2, cantidad1);
    }

}
