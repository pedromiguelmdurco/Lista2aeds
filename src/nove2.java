import java.util.Scanner;

public class nove2 {

	
	public static double nota(int alunos)
	{
		Scanner entrada = new Scanner(System.in);
		
		int not,cont = 0, total;
		double media;
		
		total = alunos;
		while(alunos > 0)
		{
			System.out.println("Digite a nota do aluno: ");
			not = entrada.nextInt();
			
			if(not >= 6) 
			{
				cont++;
			}
			
			
			alunos--;
			
		}
		
		media = total/cont;
		
		return(media);
		
	}
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o número de alunos: ");
		n = entrada.nextInt();
		
		System.out.println("A media dos alunos com a nota acima da media é: "+nota(n));
		
		entrada.close();

	}

}
