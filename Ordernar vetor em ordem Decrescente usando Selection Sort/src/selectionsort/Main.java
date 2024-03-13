public class Main {

   public static void selectionOrdenar(int vet[], int N) {
        for (int i = 0; i < N - 1 ; i++) {
            int menorNum = vet[i];
            int posMenor = i;
            for(int j = i+1; j < N;j++){
                if(menorNum < vet[j]){ //se fosse do menor pro maior basta inverter o comparador
                    menorNum = vet[j];
                    posMenor = j;
                }
            }
            int temp = vet[i];
            vet[i]= menorNum;
            vet[posMenor] = temp;
        }
    }
	
	
    public static void imprimirVetor(int vet[], int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    
        int numeros [] = { 4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};
        int tamanhoVetor = numeros.length;
        
      
        System.out.println("Vetor original:");
        imprimirVetor(numeros, tamanhoVetor);
        
        
        selectionOrdenar(numeros, tamanhoVetor);
        
        
        System.out.println("\nVetor ordenado:");
        imprimirVetor(numeros, tamanhoVetor);
    }
    
}
