//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

//Entrada
//A entrada contém um valor inteiro N (0 < N < 13).

//Saída
//A saída contém um valor inteiro, correspondente ao fatorial de N.
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fat = 1;
        
        for(int i = 0; i < n; i++) {
            fat *= (n-i);
        }
            System.out.println(fat);

		
	}
}