import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Produto produto1 = new Produto();
		produto1.inserirDados();
		produto1.mostrarDados();
		
		System.out.print("\nDigite outra marca: ");
		String marcaProduto2 = scanner.nextLine();
		System.out.print("Digite outra fabricante: ");
		String fabricanteProduto2 = scanner.nextLine();
		System.out.print("Digite outro Código de barra: ");
		String codBarraProduto2 = scanner.nextLine();
		float precoProduto2 = 0;
		while (true) {
            System.out.print("Digite o preço: ");
            String input = scanner.nextLine();

            try {
                precoProduto2 = Float.parseFloat(input); // Tentar converter a entrada para float
                break; // Sair do loop se a conversão for bem-sucedida
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite apenas números para o preço."); // Lidar com entrada inválida
            }
        }
		Produto produto2 = new Produto(marcaProduto2, fabricanteProduto2, codBarraProduto2, precoProduto2);
		produto2.mostrarDados();
		
		
		
		scanner.close();
	}
}
