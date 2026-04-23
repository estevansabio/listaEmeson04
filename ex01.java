package pctLista;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner receba = new Scanner(System.in);

	        System.out.print("Digite uma palavra: ");
	        
	        String palavra = receba.nextLine();

	
	        System.out.println("Número de caracteres: " + palavra.length());

	        System.out.println("String em maiúsculo: " + palavra.toUpperCase());

	        
	        int numVogais = 0;
	        String vogais = "aeiouAEIOU";

	        for (int i = 0; i < palavra.length(); i++) {
	            if (vogais.indexOf(palavra.charAt(i)) != -1) {
	                numVogais++;
	            }
	        }

	        System.out.println("Número de vogais: " + numVogais);

	        receba.close();
	    }
	}
