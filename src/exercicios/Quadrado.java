package exercicios;

public class Quadrado extends Forma{
	
	private double lado;
	
	public Quadrado() {}
	public Quadrado (double lado){
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		System.out.println("Quadrado");
		return Math.pow(lado, 2);
	}
	
	@Override
	public double calcularPerimetro(){
		return lado * 4;
	}
	
}
