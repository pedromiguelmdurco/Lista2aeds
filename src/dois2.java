import java.util.Scanner;

public class dois2 {

	
	public static void populacao (int n) 
	{
		Scanner entrada = new Scanner(System.in);
	
		double sal, medsal = 0;
		int filhos, totfil = 0,total;
		
		total = n;
		//aqui eu coloquei esse n+= n pois estava dando um erro na parte do while q contava uma a mais ou uma a menos e com isso funcionou
		n += n;
		
		while(n > total) {
			
			System.out.println("Quantos filhos voc� tem?: ");
			filhos = entrada.nextInt();
			
			totfil+= filhos;
			
			System.out.println("Quanto voc� ganha?: ");
			sal = entrada.nextDouble();
			
			medsal += sal;
			
			n--;
		}
		total += totfil;
		// aqui eu adicionei os filhos a popu�ao pq n sei se o filho trabalha tb e da o dinheiro para os pais 
		System.out.printf("A media salarial desta popula��o �: %.2f\n",(medsal/total));
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int popu;
		
		System.out.println("A quantos habitantes?: ");
		popu = entrada.nextInt();
		
		populacao(popu);
		
		entrada.close();
		
	}

}
