import java.util.Scanner;

public class quatro2 {

	public static void pira() {
		Scanner entrada = new Scanner(System.in);
		
		int x, y, z;
		//nessa eu tive muita dificuldade mas conseguir entender mais e procurando na net como fazia as contar de triangulos
		System.out.print("Digite o valor de X: ");
		x = entrada.nextInt();
		
		System.out.print("Digite o valor de y: ");
		y = entrada.nextInt();
		
		System.out.print("Digite o valor de z: ");
		z = entrada.nextInt();
		//conferindo se � triangulo antes de falar qual triangulo �
		if(x + y > z && x + z > y && y + z >x)
		{
			
			if(x == y && x == z)
			{
				
				System.out.println("Tri�ngulo Equil�tero");
				
			}
			
			else if(x == y || y == z || z == x)
			{
				
				System.out.println("Tri�ngulo Is�sceles");
				
			}
			
			else if(x != y && x != z && z != y ) 
			{
			
				System.out.println("Tri�ngulo Escaleno");
				
			}
			
		}
		else
		{
			System.out.println("N�o � um triangulo");
		}
		
		
		
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n; 
		
		System.out.println("Quantos triangulos voc� vai querer: ");
		n = entrada.nextInt();
		
		while(n>0) 
		{
			
			pira();
			n--;
		}
		
		
		entrada.close();

	}

}
