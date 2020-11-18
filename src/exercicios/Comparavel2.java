package exercicios;

public class Comparavel2 implements Comparativo {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public int comparar(Comparavel2 comparavel) {

		if (equals(comparavel.equals(comparavel))) {
			return 0;
		} else {
			return -1;
		}

	}
}
