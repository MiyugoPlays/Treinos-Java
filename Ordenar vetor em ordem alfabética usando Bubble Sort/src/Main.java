public class Main {
	
	public static void bubbleOrdenar(String vet[], int N) {
        for (int i = 0; i < N - 1 ; i++) {
            for(int j = 0; j < N - 1 - i;j++){
                if(vet[j].compareTo(vet[j+1])>0){
                    String temp = vet[j+1];
                    String temp2 = vet[j];
                    vet[j] = temp;
                    vet[j + 1] = temp2;
                }
            }
        }
    }
	
	
    public static void imprimirVetor(String vet[], int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    
        String paises[] = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        int tamanhoVetor = paises.length;
        
      
        System.out.println("Vetor original:");
        imprimirVetor(paises, tamanhoVetor);
        
        
        bubbleOrdenar(paises, tamanhoVetor);
        
        
        System.out.println("\nVetor ordenado:");
        imprimirVetor(paises, tamanhoVetor);
    }
    
}
