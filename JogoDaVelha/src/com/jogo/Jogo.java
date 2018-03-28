package com.jogo;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		String jogo[][] = { { "|-----|", "|-----|", "|-----|" }, 
							{ "|-----|", "|-----|", "|-----|" },
							{ "|-----|", "|-----|", "|-----|" } };
		char a = 'a';
		String i = "a";

		for (int cont = 0; cont < 500; cont++) {
			if (cont % 2 == 0) {
				i = "X";
			} else {
				i = "O";
			}

			Scanner teclado = new Scanner(System.in);
			System.out.println("Jogo da velha");
			System.out.println("==================");
			/*
			 * System.out.println("    1    2    3");
			 * System.out.println("1 |----|----|----|");
			 * System.out.println("2 |----|----|----|");
			 * System.out.println("3 |----|----|----|");
			 */
			for (int cont1 = 0; cont1 < jogo.length; cont1++) {
				for (int cont2 = 0; cont2 < jogo.length; cont2++) {
					System.out.print(jogo[cont1][cont2]);
				}
				System.out.println();
			}

			System.out.println("==================");
			System.out.println("Quer jogar " + i + " em qual posição?");
			String linha = teclado.nextLine();
			String coluna = teclado.nextLine();
			int contL = Integer.parseInt(linha);
			int contC = Integer.parseInt(coluna);
			for (int l = contL - 1; l < jogo.length; l++) {
				for (int c = contC - 1; c < jogo.length; c++) {
					if (jogo[l][c] == "|-----|") {
						jogo[l][c] = "|  " + i + "  |";
						break;
					} else {
						System.out.println("Não é possível jogar " + i + " nessa posição");
						break;
					}
				}
				break;
			}
			if (jogo[1][1] == "   " + "X" + "   " && jogo[1][2] == "   " + "X" + "   "
					&& jogo[1][3] == "   " + "X" + "   ") {
				System.out.println("Jogador 1 (X) ganhou o jogo!!!!");
				System.exit(0);
			}
		}
	}
}
