package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {

    public static void main(String[] args) {
        
        
        double salario=0;
        double numFilho;
        double numEntrev=0;
        double somaTotalFilhos=0;
        double somaTotalRenda=0;
        
        double mediaRenda;
        double mediaFilhos;
        double maiorSalario= 0;
        double numEnt150=0;
        double qntFamilia = 0;
        double percentual= 0;
        //criar a variavel Scanner
        Scanner leia = new Scanner(System.in);
        
                
        while( salario >= 0){
             System.out.println("Informe o salário da familia: ");
            salario = leia.nextDouble();
            if ( salario < 0) {
            break; 
            }
            if (salario > maiorSalario ){
                maiorSalario += salario;
            }
           qntFamilia=qntFamilia+1;
            
            //Quantidade de entrev. salario menor de r$150
            if (salario < 150){
                numEnt150 += 1;
            }
       
            if (salario >= 0){
                ++numEntrev; 
                somaTotalRenda += salario;
                //somatoria dos entrevistados
            
                System.out.println("Informe  o numero de filhos:");
                numFilho = leia.nextDouble();
                
                somaTotalFilhos += numFilho;  //soma os numeros de filhos 
                
                System.out.println(" ");    
                    }
            
            
            
        }
        mediaRenda = somaTotalRenda/numEntrev; //1ª resposta
        mediaFilhos = somaTotalFilhos/numEntrev;//2ª resposta
        numEnt150 -= 1;
     
        System.out.println("Renda Familiar: "+ somaTotalRenda);
        System.out.println("Numero de Filhos: "+somaTotalFilhos);
        System.out.println("Total de entrevistados: "+ numEntrev);
        
        System.out.println("A média salarial dessa cidade é: "+mediaRenda);
        System.out.println("A média de filhos: "+ mediaFilhos);
        System.out.println("O maior salario dos habitantes é: "+maiorSalario);
        System.out.println("O percentual de pessoas com o salário menos de R$150,00: "+numEnt150);
        
    }
    
}
