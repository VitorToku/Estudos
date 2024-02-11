import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecao
 {
    public static void main(String[] args) throws Exception {
        //Exceções são comportamentos que pode levar um programa a dar um erro. Podemos tratá-los sem interromper o código
        // erros possíveis neste caso: Não infomar nome, idade ter um caractere não numérico, altura ter vírgula e não ponto (padrão americano)
        try
        {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            String nome;
            int idade;
            double altura;        

            System.err.println("Digite seu nome");
            nome = scanner.nextLine();        
            
            System.err.println("Digite sua idade");
            idade = scanner.nextInt();        

            System.err.println("Digite sua altura");
            altura = scanner.nextDouble();

            System.err.println("Nome: " + nome);
            System.err.println("Idade: " + idade);
            System.err.println("Altura: " + altura);
        }
        catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
