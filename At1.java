package Avaliaçãoformativa;

import java.util.Scanner;

public class At1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double celsius, fahrenheit;
		
		System.out.println("informe o fahrenheit: ");
		fahrenheit= ler.nextDouble();
		
		celsius=((fahrenheit-32)*5)/9 ;
		
		System.out.println("A temperatura convertida em celsiu é:" + celsius);
		
	}

}
