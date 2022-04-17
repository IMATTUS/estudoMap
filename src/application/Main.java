package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		// Map é uma coleção de pares chave/valor (de qualquer tipo)
		/*
		 * Não adminte repetição do objeto da chave
		 * elementos indexados pelo objeto da chave (não possuem posição)
		 * Acesso, remoção e inserão de elementos são rapidos
		 * 
		 * uso comum em cookies, local storage, qualquer modelo chave valor
		 * 
		 * Principais implementações.
		 * HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado
		 * TreeMap - mais lento (operações de O(log(n)) em árvore rubro-negra) e ordenado com base no compareTo 
		 * LinkedHashMap - velocidade intermediária e elementos ficam na ordem que são adicionados.
		 * 
		 */

		Map<String,String> cookies = new TreeMap<>();
		cookies.put("username", "Maria");
		cookies.put("email", "Maria@gmail.com");
		cookies.put("phone", "99771122");
		
		cookies.remove("email"); 

		cookies.put("phone", "99771133");
		
		System.out.println("Contain key = phone "+cookies.containsKey("phone"));
		System.out.println("phone number: "+ cookies.get("phone"));
		System.out.println("Email: "+ cookies.get("email"));
		System.out.println("size: "+ cookies.size());
		
		System.out.println("All cookies");
		for (String key : cookies.keySet()) {
			System.out.println(key + " " +cookies.get(key));
		}
		
		Map<Product, Double> stock = new HashMap<>();
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		Product ps = new Product("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		
	}

}
