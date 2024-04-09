import java.util.Scanner;

public class sete2 {
	
	public static boolean pos()
	{
		Scanner entrada = new Scanner(System.in);
		
		int num;
		boolean resultado = true;
		
		// aq eu ja tive muito problema pq tava tentando trazer um valor q n precisava e pq n entendi muito a questao
			
		System.out.print("Digite um numero: ");
		num = entrada.nextInt();
			
		if(num > 0)
		{
			resultado = true;
			System.out.print("Positivo ");
		}
		else if(num < 0)
		{
			resultado = false;
			System.out.print("Negativo ");
		}
		else
		{
			System.out.print("Coloque um numero alem de 0 ");
		}
			
			
		
		
		return(resultado);
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros você quer conferir se é positivo: ");
		n = entrada.nextInt();
		
		while(n>0)
		{
			System.out.println(pos());
			n--;
		}
		
		
			
		entrada.close();
		
	}

}
