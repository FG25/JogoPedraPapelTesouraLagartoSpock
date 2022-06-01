package pedraPapelTesouraLagartoSpock;

import java.util.Random;
import java.util.Scanner;

public class Main {
	static int escolhaCPU() {
		Random aleatorio = new Random();
		int cpu = aleatorio.nextInt(5) + 0;
		return cpu;
	}
	static void escolhaUsuario() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\tBem vindo ao jogo Pedra, papel, tesoura, lagarto, spock\n");
		System.out.printf("Escolha o número correspondente a sua opção:%n[1]Pedra%n[2]Papel%n[3]Tesoura%n[4]Lagarto%n[5]Spock%n");
		int opcao = -1;
		while (opcao == -1 || opcao > 4) {
		System.out.print("Digite sua opção: ");
		opcao = input.nextInt();
		opcao --;
		}
		matrizResultado(opcao,escolhaCPU());
	}
	
	
	static void matrizResultado(int opcao, int cpu) {
		int [][] resultado = {{2,0,1,1,0}, {1,2,0,0,1}, {0,1,2,1,0}, {0,1,0,2,1}, {1,0,1,0,2}};
		
		String [] escolha = {"Pedra", "Papel", "Tesoura","Lagarto","Spock"};
		System.out.println("A CPU Jogou: "+ escolha[cpu]+ "\nVocê jogou: " + escolha[opcao]);
		
		if (resultado[opcao][cpu] == 0) {
			System.out.println("Você Perdeu");
		}
		else if (resultado[opcao][cpu] == 1) {
			System.out.println("Você Ganhou!");
		}
		else {
			System.out.println("Você empatou");
		}
	}
	
	public static void main(String[] args) {
		escolhaUsuario();
	}
}
