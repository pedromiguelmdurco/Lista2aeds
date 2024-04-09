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
		//conferindo se é triangulo antes de falar qual triangulo é
		if(x + y > z && x + z > y && y + z >x)
		{
			
			if(x == y && x == z)
			{
				
				System.out.println("Triângulo Equilátero");
				
			}
			
			else if(x == y || y == z || z == x)
			{
				
				System.out.println("Triângulo Isósceles");
				
			}
			
			else if(x != y && x != z && z != y ) 
			{
			
				System.out.println("Triângulo Escaleno");
				
			}
			
		}
		else
		{
			System.out.println("Não é um triangulo");
		}
		
		
		
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n; 
		
		System.out.println("Quantos triangulos você vai querer: ");
		n = entrada.nextInt();
		
		while(n>0) 
		{
			
			pira();
			n--;
		}
		
		
		entrada.close();

	}

}
