package pctLista;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		System.out.print("Digite um numero binario: ");
        String texto = receba.nextLine();

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '1') {
                contador++;
            }
        }

        System.out.println("esse numero tem : " + contador + " uns");

        receba.close();
    }
}


