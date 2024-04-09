import java.util.Scanner;

public class seis2 {

	public static double fat (int num)
	{
		double resul = 1;
		int contfa;
		
		contfa = num;
		
		if(num >= 0)
		{
			while(contfa>1)
			{
				resul = resul * contfa;
				contfa--;
			}
			
			return(resul);
		}
		else
		{
			System.out.print("Erro");
			return(-1);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n, sin = 1,cont;
		double f = 0;
		
		
		System.out.print("Digite o valor: ");
		n = entrada.nextInt();
		
		
		cont = 1;
		
		while(cont <= n )
		{
			f = f + sin*(1/fat(cont));
			sin = sin *(-1);
			cont++;
		}
		
		
		
		System.out.printf("O resultado do Fatorial de %d" + " é %.2f\n ", n , f);
		
		entrada.close();
		
	}

}
