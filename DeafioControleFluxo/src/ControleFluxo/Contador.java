package ControleFluxo;
import java.util.Scanner;
import java.util.Locale;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
		contar(parametroUm,parametroDois);
		} catch (ParametrosInvalidosException exception ) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		} finally {
			terminal.close();
		}
	}
	static void contar(int parametroUm, int parametroDois )throws ParametrosInvalidosException {
		if(parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		for(int contador=1; contador <= contagem; contador++) {
			System.out.println("Imprimindo o numero "+contador);
		}
	}
}
