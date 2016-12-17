package br.com.dextraining.arraysExercicio2;

import java.util.Scanner;

public class CalcularMediaTurma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a quantidade de alunos:");
		int qtdAlunos = scanner.nextInt();

		Aluno alunos[] = new Aluno[qtdAlunos];

		for (int indiceAlunos = 0; indiceAlunos < qtdAlunos; indiceAlunos++) {
			System.out.println("Informe o nome do aluno:");
			String nome = scanner.next();
			
			double notas[] = new double[3];

			for (int indiceNota = 0; indiceNota < notas.length; indiceNota++) {
				System.out.print("Informe a " + indiceNota + " nota:");
				notas[indiceNota] = scanner.nextDouble();
			}
			// instanciando aluno (passando os valores)
			alunos[indiceAlunos] = new Aluno(nome, notas);
		}

		// relatorio
		for (int indiceA = 0; indiceA < qtdAlunos; indiceA++) {
			System.out.print("Nome aluno:" + alunos[indiceA]);
			
			for (int indiceN = 0; indiceN < notas.length ; indiceN++){
				System.out.println(notas[indiceN]);
			}
			
		}
		scanner.close();
	}
}
