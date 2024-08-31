package com.lista1.lista1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lista1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lista1Application.class, args);
		public static void main(String[] args) {
			SpringApplication.run(ExerciciosroniApplication.class, args);
	
			int escolha;
			System.out.println("Boas vindas ao exerciciosroni!\nQual exercício deseja executar?");
			Scanner scan = new Scanner(System.in);
		    escolha = scan.nextInt();
	
			switch(n){
				case 1:
					System.out.println("EXERCÍCIO 1:");
					Exo1.resolucao1();//É como se fosse "funcao resolucao()" do portugol
					break;
				case 2:
					System.out.println("EXERCÍCIO 2:");
					Exo02.resolucao();//É como se fosse "funcao resolucao()" do portugol
					break;
				case 3:
					System.out.println("EXERCÍCIO 3:");
					Exo03.resolucao();//É como se fosse "funcao resolucao()" do portugol
					break;
				case 4:
					System.out.println("EXERCÍCIO 4:");
					Exo04.resolucao();//É como se fosse "funcao resolucao()" do portugol
					break;			
				case 5:
					System.out.println("EXERCÍCIO 5:");
					Exo05.resolucao();//É como se fosse "funcao resolucao()" do portugol
					break;
				case 6:
					System.out.println("EXERCÍCIO 6:");
					Ex06.resolucao();//É como se fosse "funcao resolucao()" do portugol
					break;
				case 7:
					System.out.println("EXERCÍCIO 7:");
					Exo07.resolucao();//É como se fosse "funcao resolucao()" do portugol
					break;
				case 8:
					System.out.println("EXERCÍCIO 8:");
					Exercicio08.resolucao();//É como se fosse "funcao resolucao()" do portugol
					break;
				case 9:
					System.out.println("EXERCÍCIO 9:");
					Exo09.resolucao();//É como se fosse "funcao resolucao()" do portugol
					break;
				case 10:
					System.out.println("EXERCÍCIO 10:");
					Exercicio10.resolucao();//É como se fosse "funcao resolucao()" do portugol
					break;
				default:
					System.out.println("Digite um número entre 1 e 10");
					}
		}
	
	}

}
