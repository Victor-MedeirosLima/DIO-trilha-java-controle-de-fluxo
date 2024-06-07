import java.util.Scanner;


public class Contador {
    

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int numero1,numero2;
        
        System.out.println("Informe o primeiro numero");
        numero1 = scan.nextInt();
        scan.nextLine();
        
        
        System.out.println("Informe o segundo numero:");
        numero2 = scan.nextInt();
        scan.nextLine();
        
        try {
            
            Contar(numero1, numero2);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
          
    static void Contar(int numero1, int numero2) throws ParametrosInvalidosException {

        if(numero1 > numero2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        }

        int contagem = numero2 - numero1;

        for(int i=1; i<=contagem; i++){

            System.out.println("Imprimindo o número "+ i +"");
        }


    }
    
}   
    
    
    

