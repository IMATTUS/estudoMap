package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		// Map � uma cole��o de pares chave/valor (de qualquer tipo)
		/*
		 * N�o adminte repeti��o do objeto da chave
		 * elementos indexados pelo objeto da chave (n�o possuem posi��o)
		 * Acesso, remo��o e inser�o de elementos s�o rapidos
		 * 
		 * uso comum em cookies, local storage, qualquer modelo chave valor
		 * 
		 * Principais implementa��es.
		 * HashMap - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado
		 * TreeMap - mais lento (opera��es de O(log(n)) em �rvore rubro-negra) e ordenado com base no compareTo 
		 * LinkedHashMap - velocidade intermedi�ria e elementos ficam na ordem que s�o adicionados.
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
