package trabalhadoresempresa;
import javax.swing.*;

public class TrabalhadoresEmpresa {
    private Trabalhador trab[];
    private int N;
    
public static void main(String[] args) {
    TrabalhadoresEmpresa principal = new TrabalhadoresEmpresa();
}

public TrabalhadoresEmpresa () {
    leituraDeDados() ; //pode usar simulacaoLeituraDeDados se quiser
    mostraTrabalhadoresCadastrados();
    quickSortSalario (trab, 0, N-1);
    mostraTrabalhadoresCadastradosSalario();
    quickSortNome (trab, 0, N-1);
    mostraTrabalhadoresCadastradosNome();
}

public void simulacaoLeituraDeDados() {
    //vetor já pronto para teste
    N = 7;
    trab = new Trabalhador[N];
    trab[0] = new Trabalhador("Julio",  2000f, 'M');
    trab[1] = new Trabalhador("Mariana",  1000, 'F');
    trab[2] = new Trabalhador("Renata",  800, 'F');
    trab[3] = new Trabalhador("Pedro",  1500f, 'M');
    trab[4] = new Trabalhador("Amilton",  6000f, 'M');
    trab[5] = new Trabalhador("Jorge",  2200f, 'M');
    trab[6] = new Trabalhador("Carlos",  3500f, 'M');
}

public void leituraDeDados() {
        String umNome;
        float umSalario;
        char umSexo;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de trabalhadores:"));
        trab = new Trabalhador[N];  

        for (int i = 0; i < N; i++) {
            umNome = JOptionPane.showInputDialog("Digite o nome do trabalhador " + (i + 1) + ": ");
            umSalario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário de " + umNome + ": "));
            umSexo = JOptionPane.showInputDialog("Digite o sexo deste trabalhador: ").charAt(0);
            umSexo = Character.toUpperCase(umSexo);
            trab[i] = new Trabalhador(umNome, umSalario, umSexo); 
        }
}

public void mostraTrabalhadoresCadastrados () {
    String cad = "";
    for (int i=0; i<N; i++) {
      cad +=  trab[i].toString()+ "\n";
    }    
    JTextArea outputArea = new JTextArea(15,40);  
    outputArea.setText(cad);
	JScrollPane rolagem = new JScrollPane(outputArea);
	JOptionPane.showMessageDialog(null,rolagem,"Dados dos trabalhadores cadastrados",
	                    JOptionPane.INFORMATION_MESSAGE);
}

public void mostraTrabalhadoresCadastradosNome () {
    String cad = "";
    for (int i=0; i<N; i++) {
      cad +=  trab[i].toString()+ "\n";
    }    
    JTextArea outputArea = new JTextArea(15,40);  
    outputArea.setText(cad);
	JScrollPane rolagem = new JScrollPane(outputArea);
	JOptionPane.showMessageDialog(null,rolagem,"Dados dos trabalhadores em ordem de nome",
	                    JOptionPane.INFORMATION_MESSAGE);
}

public void mostraTrabalhadoresCadastradosSalario () {
    String cad = "";
    for (int i=0; i<N; i++) {
      cad +=  trab[i].toString()+ "\n";
    }    
    JTextArea outputArea = new JTextArea(15,40); 
    outputArea.setText(cad);
	JScrollPane rolagem = new JScrollPane(outputArea);
	JOptionPane.showMessageDialog(null,rolagem,"Dados dos trabalhadores em ordem de Salario",
	                    JOptionPane.INFORMATION_MESSAGE);
} 

 public boolean quickSortSalario (Trabalhador vetor [], int inicio, int fim) {
     // 1) método para ordenar o vetor em order decrescente pelo salário
     if (vetor == null) return false;
     if (inicio < fim) {
         int posicaoPivo = separarSalario (vetor, inicio, fim);
         quickSortSalario(vetor, inicio, posicaoPivo - 1);
         quickSortSalario(vetor, posicaoPivo + 1, fim);
     }
     return true;
 }
 
 private int separarSalario (Trabalhador vetor [], int inicio, int fim) {
     Trabalhador pivo = vetor[inicio];
     int i = inicio + 1, f = fim;
     while (i <= f) {
         if ( vetor[i].salario >= pivo.salario ) i++;
         else if ( pivo.salario > vetor[f].salario ) f--;
         else {
            Trabalhador troca = vetor[i];
            vetor[i] = vetor[f];
            vetor[f] = troca;
            i++;f--;
         }
     }
     vetor[inicio] = vetor[f];
     vetor[f] = pivo;
     return f;
 }
 
 public boolean quickSortNome (Trabalhador vetor [], int inicio, int fim) {
     // 2) método em ordem crescente pelo nome
     if (vetor == null) return false;
     if (inicio < fim) {
         int posicaoPivo = separarNome (vetor, inicio, fim);
         quickSortNome(vetor, inicio, posicaoPivo - 1);
         quickSortNome(vetor, posicaoPivo + 1, fim);
     }
     return true;
 }
 
 private int separarNome (Trabalhador vetor [], int inicio, int fim) {
     Trabalhador pivo = vetor[inicio];
     int i = inicio + 1, f = fim;
     while (i <= f) {
         if ( vetor[i].getNome().compareToIgnoreCase(pivo.getNome()) <= 0 ) i++;
         else if ( pivo.getNome().compareToIgnoreCase(vetor[f].getNome()) < 0 ) f--;
         else {
            Trabalhador troca = vetor[i];
            vetor[i] = vetor[f];
            vetor[f] = troca;
            i++;f--;
         }
     }
     vetor[inicio] = vetor[f];
     vetor[f] = pivo;
     return f;
 }
    
}
