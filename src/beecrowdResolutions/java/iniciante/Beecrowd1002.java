package beecrowdResolutions.java.iniciante;

import java.util.Scanner;
import java.util.Locale;

public class Beecrowd1002 {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner leitor = new Scanner(System.in);
		double raio = leitor.nextDouble();
		double area = 3.14159 * (raio * raio);
		System.out.println(String.format("A=%.4f", area)); 
		
		
	}
}
