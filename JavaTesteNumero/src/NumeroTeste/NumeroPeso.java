package NumeroTeste;

public class NumeroPeso {
	
	private double imc;
	
	public double calculaIMC(double peso, double altura) {
		imc = peso / (Math.pow(altura, 2));
		return imc;
	}
	
	public void defineIMC() {
		if(imc < 20.0) {
			System.out.println("Abaixo do peso");
		} else if(imc >= 20.0 && imc < 25.0) {
			System.out.println("Peso normal");
		} else if(imc >= 25.0 && imc < 30) {
			System.out.println("Sobrepeso");
		} else if(imc >= 30 && imc < 40) {
			System.out.println("Obeso");
		} else if(imc >= 40) {
			System.out.println("Obeso mórbido");
		}
	}
}
