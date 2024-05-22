package Avaliaçãoformativa;
import java.util.Scanner;
public class At3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double valor1,valor2,soma,sub,multi;
		String operacao;
		
		System.out.println("informe o valor 1: ");
		valor1=ler.nextDouble();
		
		System.out.println("informe o valor 2: ");
		valor2=ler.nextDouble();
		
		soma=valor1+valor2;
		multi=valor1*valor2;
		sub=valor1-valor2;
		
		System.out.println("informe a operação desejada multiplicação ou soma ou subtração");
		operacao= ler.next();
		
        if(sub.equals("sub")){
        	System.out.println("o resultado da subtracção é: "+sub);
        }
        else if(operacao.equals("soma")) {
        	System.out.println("O resultado da soma é: "+soma);
        }
        else {
        	System.out.println("o resultado da multiplicação é: "+ multi);
        }
	
ler.close();
}
}