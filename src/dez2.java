import java.util.Scanner;

public class dez2 {

	
	public static char categoria(int ida) {
		
		char cate;
		
		if(ida >=5 && ida <= 7)
		{
			cate = 'F';
		}
		else if(ida >=8 && ida <=10)
		{
			cate = 'E';
		}
		else if(ida >=11 && ida <=13)
		{
			cate = 'D';
		}
		else if(ida >=14 && ida <=15)
		{
			cate = 'C';
		}
		else if(ida >=16 && ida <=17)
		{
			cate = 'B';
		}
		else
		{
			cate = 'A';
		}
		
		return(cate);
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Qual a idade do nadador?: ");
		idade = entrada.nextInt();
		
		System.out.println("Categoria: "+ categoria(idade));
		// fiz quase a mesa coisa q a 5 mas usei char para char letras ja q era oque pedia 
		entrada.close();

	}

}
