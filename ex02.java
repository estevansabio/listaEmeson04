package pctLista;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		  System.out.print("Digite uma palavra ");
          String texto = receba.nextLine();

          boolean ehPalindromo = true;

          int tamanho = texto.length();

          for (int i = 0; i < tamanho / 2; i++) {
              if (texto.charAt(i) != texto.charAt(tamanho - 1 - i)) {
                  ehPalindromo = false;
                  break;
              }
          }

          if (ehPalindromo) {
              System.out.println("ela é palidromo");
          } else {
              System.out.println("Não é palíndromo");
          }

          receba.close();
      }
  }