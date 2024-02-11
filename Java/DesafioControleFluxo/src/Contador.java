import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        try{
            Scanner terminal = new Scanner(System.in);
            int numero1, numero2;

            System.out.println("Digite o primeiro número");
            numero1 = terminal.nextInt();

            System.out.println("Digite o segundo número");
            numero2 = terminal.nextInt();

            contar(numero1, numero2);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo número deve ser maior que o primeiro");
        }
        
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero2 < numero1){
            throw new ParametrosInvalidosException();
        }
        else{
            int contagem = numero2 - numero1;
            for(int i = 0; i<contagem;i++){
                System.out.println("Imprimindo o número " + (i+1));
            }
        }          
        
    }
}
