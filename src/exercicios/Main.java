package exercicios;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		List<IAreaCalculavel> areaCalc = new ArrayList<IAreaCalculavel>();
		List<IPerimetroCalculavel> perimetroCalc = new ArrayList<IPerimetroCalculavel>();
		
		
		Circulo c1 = new Circulo(5);
		Quadrado q1 = new Quadrado(10);
		Triangulo t1 = new Triangulo(3);
		Retangulo r1 = new Retangulo(5,2);
		
		areaCalc.add(c1);
		areaCalc.add(q1);
		areaCalc.add(t1);
		areaCalc.add(r1);
		
		perimetroCalc.add(c1);
		perimetroCalc.add(q1);
		perimetroCalc.add(t1);
		perimetroCalc.add(r1);
		
		for (IAreaCalculavel area: areaCalc) {
			System.out.printf("Area: %.2f", area.calcularArea());
			System.out.println();
			if (area instanceof IPerimetroCalculavel) {
				IPerimetroCalculavel perimetro = (IPerimetroCalculavel) area;
				System.out.printf("Perimetro: %.2f", perimetro.calcularPerimetro());
				System.out.println();
			}
			System.out.println();
		}
	}
}
