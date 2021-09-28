package jokenpo;

import java.util.Scanner;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Vamos jogar Pedra, Papel e Tesoura!!!");
		System.out.println("Digite: 0 para TESOURA, 1 para PAPEL e 2 para PEDRA");

		System.out.println("Digite sua jogada:");
		float n1 = tec.nextFloat();

		System.out.println("Agora o computador ira jogar!!!");
		float n2 = rand.nextInt(3);

		System.out.printf("Você jogou %s, o computador jogou %s\n", n1, n2);

		System.out.println(jokenpo(n1, n2));

		tec.close();
	}

	private static String jokenpo(float n1, float n2) {
		
		if(n1 == n2){
			return "Empate!!!!";
		} else if(n1 == 0 && n2 == 1){
			return "Você ganhou!!!!";
		}else if(n1 == 1 && n2 == 2){
			return "Você ganhou!!!!";
		}
		else if(n1 == 2 && n2 == 0) {
			return "Você ganhou!!!!";
			
		}else if(n1 == 1 && n2 == 0) {
			return "Você perdeu!!!";

		}else if(n1 == 2 && n2 == 1) {
			return "Você perdeu!!!";

		}else if(n1 == 0 && n2 == 2){
			return "Você perdeu!!!";

		}
		
		else {
			return "O NÚMERO É INVALIDO";
		
		}
}
}