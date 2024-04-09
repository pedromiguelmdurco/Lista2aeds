import java.util.Scanner;

public class oita2 {

	public static double conta(int num)
	{
		
		double conta;
		
		conta =(((num*num)+1)/(num+3));
		
		return (conta);
		
	}// aq eu so coloquei a formula q ela nos deus em praticad
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um valor: ");
		n = entrada.nextInt();
		
		
		System.out.println(conta(n));
		
		entrada.close();

	}

}
