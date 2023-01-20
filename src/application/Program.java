package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> pessoas = new ArrayList<>();
		
		System.out.println("Quantas pessoas: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Dados Pessoa #" + (i+1));
			System.out.println("Fisica ou Juridica (f/j): ");
			char tipo = sc.next().charAt(0);
			System.out.println("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Renda Anual: ");
			double renda = sc.nextDouble();
			if(tipo == 'f') {
				System.out.println("Gasto com saude: ");
				double saude = sc.nextDouble();
				pessoas.add(new PessoaFisica(nome, renda, saude));
			}else if(tipo == 'j') {
				System.out.println("Funcionarios: ");
				int func = sc.nextInt();
				pessoas.add(new PessoaJuridica(nome, renda, func));
			}
		}
		
		for(Contribuinte p : pessoas) {
			System.out.println(p);
		}
		
		System.out.println("TOTAL: ");
		double soma = 0.0;
		for(Contribuinte p : pessoas) {
			soma += p.calcularImposto();
		}
		System.out.println("R$ " + String.format("%.2f", soma));
		sc.close();
	}

}
