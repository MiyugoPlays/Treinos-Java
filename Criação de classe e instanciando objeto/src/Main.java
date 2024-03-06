
public class Main {
	
	public static void main(String[] args) {
		
		Eletrodomestico eletro;
		eletro = new Eletrodomestico();
		
		Carro car = new Carro();
		
		CaixaDialogo cx = new CaixaDialogo();
		
		eletro.nome = "Geladeira";
		eletro.preco = (float) 1000;
		eletro.cor = "Branco";
		
		car.placa = "ABC-1234";
		car.modelo = "Picape";
		car.cor = "Azul";
		
		cx.mensagem = "Clique no botão";
		cx.cor = "Preto";
		cx.botao = "Enviar";
		
		System.out.println("Eletrodoméstico");
		System.out.println("Nome: " + eletro.nome);
		System.out.println("Preço: R$" + eletro.preco);
		System.out.println("Cor: " + eletro.cor + "\n"); // o \n quebra a linha

		System.out.println("Carro");
		System.out.println("Placa: " + car.placa);
		System.out.println("Modelo: " + car.modelo);
		System.out.println("Cor: " + car.cor + "\n");
		
		System.out.println("Caixa de Diálogo");
		System.out.println("Mensagem: " + cx.mensagem);
		System.out.println("Cor: " + cx.cor);
		System.out.println("Botão: " + cx.botao);
		
	}

}
