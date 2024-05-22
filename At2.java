package Avaliaçãoformativa;
import java.util.Scanner;
public class At2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double lado,area;
		
		System.out.println("iforme o valor do lado: ");
		lado= ler.nextDouble();
		
		area= lado*lado;
		
		System.out.println("a area do quadrado é:" + area);
		
	}

}
