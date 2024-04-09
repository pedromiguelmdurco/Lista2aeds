import java.util.Scanner;

public class cinco2 {

	
	public static void media() 
	{
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Qual a media deste aluno: ");
		nota = entrada.nextInt();
		
		if(nota <= 39)
		{
			
			System.out.println("F");
			
		}
		else if(nota >= 40 && nota < 60)
		{
			
			System.out.println("E");
			
		}
		else if(nota >= 60 && nota < 70)
		{
			
			System.out.println("D");
			
		}
		else if(nota >= 70 && nota < 80)
		{
			
			System.out.println("C");
			
		}
		else if(nota >= 80 && nota < 90)
		{
			
			System.out.println("B");
			
		}
		else if(nota >= 90)
		{
			
			System.out.println("A");
			
		}
		else
		{
			
			System.out.println("Coloque um valor invalido");
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos alunos irá botar?: ");
		n = entrada.nextInt();
		
		//aq so fui conferindo qual era onde se encaixava a nota dele
		
		while(n>0)
		{
			System.out.println("Aluno: "+ n);
			media();
			n--;
		}
		
		
		entrada.close();
		

	}

}
