public class Desafio01 {

    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);   
        
        int total = 0;
        int entrada = 0;
        int media = 0;
        int maior = 0;
        int menor = 0;
        
        for (int i = 1; i <= 15; i++){
        System.out.println("Informe o valor: ");
        entrada = leia.nextInt();
        total += entrada;
       
        if( entrada > 0) {    
        menor = entrada;
        }
        
        if (entrada > maior| i== 0){
        maior = entrada;    
        }
        if ( entrada < menor | i == 0){
        menor = entrada;
        }
        
        
    }
         System.out.println("O valor total é de: "+total);
         media = (total /15);
         System.out.println("A média aritmética é: "+media);
         System.out.println ("O maior número equivale a: "+maior);
         System.out.println("O menor valor é: "+menor);  
         
     
    }
    
}
