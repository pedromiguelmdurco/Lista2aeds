import java.util.Scanner;

public class um2 {

	public static void notas() {
		
		Scanner entrada = new Scanner(System.in);
		
		double  not, not2, not3, tot=0, medi;
		char med;
		
		System.out.print("Nota 1: ");
		not = entrada.nextDouble();
		
		tot += not;
		
		System.out.print("Nota 2: ");
		not2 = entrada.nextDouble();
		
		tot += not2;
		
		System.out.print("Nota 3: ");
		not3 = entrada.nextDouble();
		
		tot += not3;
		
		System.out.print("Escreva A ou P: ");
		med = entrada.next().charAt(0);
		
		
		
		if(med == 'p' || med == 'P')
		{
			
			not2 = (not2*2);
			
			not3 = (not3*3);
			
			not = (not*5);
			
			tot = not + not2 + not3;
			
			medi = tot/10;
			System.out.println("A média ponderada é: "+ medi);
		}
		
		else if (med == 'a' || med == 'A')
		{

			medi = tot/3;
			System.out.println("A média aritmética é: "+ medi);
			
		}
		else
		{
			System.out.println("Valor invalido");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		
		System.out.print("Quantos alunos irá cadastrar: ");
		n = entrada.nextInt();
		// aqui fiz uma estrutura de repetiçao para repitir o procedimento ate o numero de alunos chegar a zero
		while(n > 0)
		{
			System.out.println("Aluno "+ n);
			notas();
			n--;
		}
		
		entrada.close();
		

	}

}