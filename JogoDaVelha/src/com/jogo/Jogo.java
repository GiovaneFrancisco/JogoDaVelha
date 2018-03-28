package com.jogo;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		String jogo[][] = { { "|-----|", "|-----|", "|-----|" }, 
							{ "|-----|", "|-----|", "|-----|" },
							{ "|-----|", "|-----|", "|-----|" } }; // Cria um vetor multidimensional
		char a = 'a';
		String i = "a";
		System.out.println("Jogo da velha");
		for (int cont = 0; cont < 500; cont++) { // Cria um looping 'infinito'
			if (cont % 2 == 0) {
				i = "X"; // Define se o 'índice' vai ser X ou O para poder dar interatividade
			} else {
				i = "O";
			}

			Scanner teclado = new Scanner(System.in);
			System.out.println("=====================");
			for (int cont1 = 0; cont1 < jogo.length; cont1++) {
				for (int cont2 = 0; cont2 < jogo.length; cont2++) {
					System.out.print(jogo[cont1][cont2]); // Desenha o vetor, cada jogada ele computa a mudança e aplica
				}
				System.out.println(); // Pula linha para poder dar o efeito de 3x3
			}

			System.out.println("=====================");
			System.out.println("Quer jogar " + i + " em qual posição?");
			String linha = teclado.nextLine();    // Lê a linha da jogada
			String coluna = teclado.nextLine();   // Lê a coluna da jogada
			int contL = Integer.parseInt(linha);  // Transforma os números em String para poder aplicar no vetor 
			int contC = Integer.parseInt(coluna); // Transforma os números em String para poder aplicar no vetor 
			for (int l = contL - 1; l < jogo.length;) { // Retira 1 do número escolhido 
				for (int c = contC - 1; c < jogo.length;) {
					if (jogo[l][c] == "|-----|") { // Se o espaço estiver em branco
						jogo[l][c] = "|  " + i + "  |"; // O espaço recebe o 'índice' do jogador
						break;
					} else {
						System.out.println("Não é possível jogar " + i + " nessa posição"); // Caso não esteja, é impossível jogar
						break;
					}
				}
				break;
			}
			/*if (jogo[1][1] == "   " + "X" + "   " && jogo[1][2] == "   " + "X" + "   "
					&& jogo[1][3] == "   " + "X" + "   ") {
				System.out.println("Jogador 1 (X) ganhou o jogo!!!!");
				System.exit(0);
			}*/ 
		}
	}
}
