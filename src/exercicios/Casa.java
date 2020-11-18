package exercicios;

import java.util.*;

public class Casa implements IAreaCalculavel {

	public static void main(String[] args) {
		List<Forma> formas = new ArrayList<Forma>();

		Circulo c1 = new Circulo(5);
		Quadrado q1 = new Quadrado(10);
		Triangulo t1 = new Triangulo(3);
		Retangulo r1 = new Retangulo(5, 2);

		formas.add(c1);
		formas.add(q1);
		formas.add(t1);
		formas.add(r1);

		for (Forma forma : formas) {
			System.out.printf("Area: %.2f", forma.calcularArea());
			System.out.println("\n");
		}
	}

	@Override
	public double calcularArea() {
		return 0;
	}
}