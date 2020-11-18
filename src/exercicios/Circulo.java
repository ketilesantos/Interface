package exercicios;

public class Circulo extends Forma{
	
	private double raio;
	private final double PI = 3.14;
	
	public Circulo() {}
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		System.out.println("Circulo");
		return Math.pow(raio, 2) * PI;
	}
	
	@Override
	public double calcularPerimetro(){
		return raio * 2 * PI;
	}
}
