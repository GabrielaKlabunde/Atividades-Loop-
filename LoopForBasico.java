
package javaapplication6;

public class JavaApplication6 {

    public static void main(String[] args) {

        int resultado = 0;
        
    for (int i = 1; i <= 10; i++){
       for(int i2 = 0; i2<=10; i2++) {
           resultado = i * i2;
           System.out.println(i+" x "+i2+" = "+resultado);
       }
   
       System.out.println("");
    }    
        
    }
    
}
