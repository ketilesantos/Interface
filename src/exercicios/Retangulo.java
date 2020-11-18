package exercicios;

public class Retangulo extends Forma {
	
	private double altura;
	private double base;
	
	public Retangulo() {}
	public Retangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public double calcularArea() {
		System.out.println("Retangulo");
		return base * altura;
	}
	
	@Override
	public double calcularPerimetro(){
		return ((base * 2) + (altura * 2));
	}
}
