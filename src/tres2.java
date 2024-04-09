import java.util.Scanner;

public class tres2 {

	
	public static void cres() 
	{
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite um valor: ");
		num1 = entrada.nextInt();
		
		System.out.print("Digite um valor: ");
		num2 = entrada.nextInt();
		
		System.out.print("Digite um valor: ");
		num3 = entrada.nextInt();
		// aq eu conferi qual era o primeiro numero e fui ajustando a ordem crescente
		if(num1 <= num2 && num1 <= num3) 
		{
			
			if(num2 <= num3) 
			{
				System.out.println(num1+""+num2+""+num3);
			}
			else
			{
				System.out.println(num1+""+num3+""+num2);
			}
			
		}
		else if(num2<= num1 && num2 <= num3) 
		{
			
			if(num1 <= num3) 
			{
				System.out.println(num2+""+num1+""+num3);
			}
			else
			{
				System.out.println(num2+""+num3+""+num1);
			}
			
		}
		else 
		{
			
			if(num1 <= num2) 
			{
				System.out.println(num3+""+num1+""+num2);
			}
			else
			{
				System.out.println(num3+""+num2+""+num1);
			
			}
			
		}
		
		
		
	}
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite quantos conjutos de 3 vc quer: ");
		n = entrada.nextInt();
		
		while(n>0) 
		{
			
			cres();
			n--;
		}
		
		entrada.close();

	}

}
