package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Informe o numero de funcionários: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados do funcionário #"+ i);
			System.out.print("Terceirizado (s/n): ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por Hora: ");
			double valorPorHora = sc.nextDouble();
			if(ch == 'y') {
				System.out.print("Cobrança adicional: ");
				double cobrancaAdicional = sc.nextDouble();
				Funcionario emp = new FuncionarioExterno(nome, horas, valorPorHora, cobrancaAdicional);
				list.add(emp);
				/**OU SIMPLESMENTE
				 * list.add(new FuncionarioExterno(nome, horas, valorPorHora, cobrancaAdicional));
				 * **/
			}else {
				Funcionario emp = new Funcionario(nome, horas, valorPorHora);
				list.add(emp);
				/**OU SIMPLESMENTE
				 * list.add(new Funcionario(nome, horas, valorPorHora));
				 * **/
			}
			System.out.println();
			System.out.println("Pagamentos: ");
			for(Funcionario emp : list) {
				System.out.println(emp.getNome() + " - $ "+ String.format("%.2f", emp.payment()));
			}
		}
		
		
		
		
		
		
		sc.close();

	}

}
