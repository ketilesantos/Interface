package exercicios;

public class Triangulo extends Forma {
	private double lado;
	
	public Triangulo() {}
	public Triangulo(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		System.out.println("Triangulo");
		return (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
	}
	
	@Override
	public double calcularPerimetro(){
		return lado * 3;
	}
}
