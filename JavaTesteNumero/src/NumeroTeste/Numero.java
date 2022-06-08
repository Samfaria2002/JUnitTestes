package NumeroTeste;

public class Numero {
	
	private int soma = 0;
	
	public double raizCubica(double numero) {
		return Math.cbrt(numero);
	}
	
	public int fatorial(int numero) {
		int multnumero = numero;
		while(numero > 1) {
			  multnumero = multnumero *(numero-1);
			  numero--;
			  System.out.println("Fatorial de " + numero + ": " + multnumero);
		}
		return multnumero;
	}
	
	public int somaIntervalo(int numero) {
		for(int i = 1; i > numero; i++) {
			soma = i + soma;
		}
		return soma;
	}
}
