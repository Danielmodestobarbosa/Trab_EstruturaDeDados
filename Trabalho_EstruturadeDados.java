/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistema.trabalho_estruturadedados;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;


public class Trabalho_EstruturadeDados {

    public static void main(String[] args) {
        
        // Pedindo o tamanho do vetor ao usuário
        int tamanhoVetor = Integer.parseInt
                            (JOptionPane.showInputDialog(
                                    null, 
                                    "Digite o tamanho do vetor" ));
        
        
        //Criando o vetor selecionado pelo usuário.
        int [] vetor = new int [tamanhoVetor];
        
        
        // Pedindo o valor para cada posição escolhida.
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento " + 
                                                                     (i + 1) + 
                                                                     " do vetor:"));
        } 
        
        
        //Imprimindo os valores escolhidos para o vetor
        String vetorEscolha = ("Vetor escolhido: ");
            for(int i = 0; i < vetor.length; i++){
                vetorEscolha += vetor[i];  
            if(i < vetor.length - 1){
                vetorEscolha += " , ";
                }
            }
        JOptionPane.showMessageDialog(null, 
                                                  vetorEscolha);
      
        
        //Menu de opções para o usuário escolher o metodo de ordenação
        String escolha = JOptionPane.showInputDialog
                                (null, "Selecione numero respectivo ao metodo desejado: "+ "\n" 
                                                  + "(1) - Ordenação por Inserção" + "\n" 
                                                  + "(2) - Ordenação Bolha" + "\n"
                                                  + "(3) - Ordenação por Seleção");
        
        //Forma utilizado para o usuário escolher o metodo no qual ele deseja ordenar o vetor.
        switch(escolha){
          case "1":
             Insercao(vetor); 
             break;
          case "2":
             Bolha(vetor);
             break;
          case "3":
             Selecao(vetor);
             break;
          default:
             JOptionPane.showMessageDialog(null, "Opção inválida!");
        }   
    }
    
    //Metodo de ordenação: (Inserção)
    public static void Insercao( int[] vetor){ 
           int tamanhoVetor = vetor.length;
           int chave;
           int j;

           for(int i = 1; i < vetor.length; i++){
               chave = vetor[i];
                    for(j = i - 1; (j >= 0 && vetor[j] > chave); j--){
                        vetor[j + 1] = vetor[j]; 
                    }
                        vetor[j + 1] = chave;
               
           }
               //Imprimindo o vetor ordenado.
               String msg = "";
                   for (int i = 0; i < vetor.length; i++) {
                        msg += vetor[i];
                   if(i < vetor.length-1)
                        msg += " - ";
               }
                JOptionPane.showMessageDialog(null,
                                        "Vetor ordenado pelo metodo (Inserção): "+msg);

    }

    //Metodo de ordenação: (Bolha)
    public static void Bolha(int [] vetor){
            int tamanhoVetor = vetor.length;
            boolean Trocou = true;
            
            
            while(Trocou){
            Trocou = false;
            
            for(int i = 0; i < vetor.length - 1; i++){
                if(vetor[i] > vetor[i+1]){
                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    Trocou = true;
                }
              }
            }
            
               //Imprimindo o vetor ordenado.
               String msg = "";
                   for (int i = 0; i < vetor.length; i++) {
                        msg += vetor[i];
                   if(i < vetor.length-1)
                        msg += " - ";
                   }
                   JOptionPane.showMessageDialog(null,
                                        "Vetor ordenado pelo metodo (Bolha): "+msg);
    } 
    
    //Metodo de ordenação (Seleção)
    public static void Selecao(int [] vetor){
            
            int tamanhoVetor = vetor.length;
            for(int i = 0; i < vetor.length-1; i++){
            int posicaoMenor = i;
            
            for(int j = i+1; j < vetor.length; j++){
                if(vetor[j] < vetor[posicaoMenor]){
                    posicaoMenor = j;
                }
            }
            
            if(posicaoMenor != i){
                int aux = vetor[i];
                vetor[i] = vetor[posicaoMenor];
                vetor[posicaoMenor] = aux;
            }
        }
            String retorno = "Vetor ordenado pelo metodo (Seleção): ";
            for(int i = 0; i < vetor.length; i++){
                retorno += vetor[i];
                if(i < vetor.length - 1){
                retorno += " - ";   
                }
            }
            JOptionPane.showMessageDialog(null, retorno);
    } 
} 
   

    
    
            
         
           
      
        
    
        

 
  


            