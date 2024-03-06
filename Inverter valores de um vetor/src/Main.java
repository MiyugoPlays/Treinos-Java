public class Main {
	
	public static void inverter(double vet[], int N) {
        for (int i = 0; i < N / 2; i++) {
            double temp = vet[i];
            vet[i] = vet[N - i - 1];
            vet[N - i - 1] = temp;
        }
    }
	
	
    public static void imprimirVetor(double vet[], int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    
        double[] vetor = {4.3, 6.1, 0.1, 1.9, 2.4, 7.2, 5.5};
        int tamanhoVetor = vetor.length;
        
      
        System.out.println("Vetor original:");
        imprimirVetor(vetor, tamanhoVetor);
        
        
        inverter(vetor, tamanhoVetor);
        
        
        System.out.println("\nVetor invertido:");
        imprimirVetor(vetor, tamanhoVetor);
    }
    
}
