import java.util.Scanner;

public class Produto {
	String marca;
	String fabricante;
	String cod_barras;
	float preco;
	
	Produto(){
		marca = "";
		fabricante = "";
		cod_barras = "";
		preco = 0;
	}
	
	Produto(String m, String f, String c, float p){
		marca = m;
		fabricante = f;
		cod_barras = c;
		preco = p;
	}
	
	public void inserirDados() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a marca do produto: ");
		marca = scanner.nextLine();
		System.out.print("Digite o fabricante: ");
		fabricante = scanner.nextLine();
		System.out.print("Digite o código de barra: ");
		cod_barras = scanner.nextLine();
		while (true) {
            System.out.print("Digite o preço: ");
            String input = scanner.nextLine();

            try {
                preco = Float.parseFloat(input); // Tentar converter a entrada para float
                break; // Sair do loop se a conversão for bem-sucedida
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite apenas números para o preço."); // Lidar com entrada inválida
            }
        }
		
	}
	
	public void mostrarDados() {
		System.out.println("\nMarca: " + marca);
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Código de barra: " + cod_barras);
		System.out.println("Preço: " + preco);
	}
}
