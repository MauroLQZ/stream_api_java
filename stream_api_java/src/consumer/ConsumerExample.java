package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
	    // Criar uma lista de números inteiros
	    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

	    // Usar o Consumer com expressão lambda para imprimir números pares
	   /* Consumer<Integer> imprimirNumeroPar = numero -> {
	      if (numero % 2 == 0) {
	        System.out.println(numero);
	      }
	    };*/
	    /*Consumer<Integer> imprimirNumeroPar = new Consumer<Integer>() {
		      public void accept(Integer numero) {
		        System.out.println(numero);
		      }
		    };*/
	    /*for (Integer numero : numeros) {
             imprimirNumeroPar.accept(numero);
          }*/
	    Consumer<Integer> imprimirNumeroPar = numero -> System.out.println(numero); 

	    // Usar o Consumer para imprimir números pares no Stream
	    numeros.stream().forEach(imprimirNumeroPar);
	  }

}
