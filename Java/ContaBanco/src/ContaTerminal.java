import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.err.println("Por favor, digite sua agência!");
        agencia = reader.nextLine();

        System.err.println("Por favor, digite o número de sua conta");
        numero = reader.nextInt();

        reader.nextLine();
        System.err.println("Por favor, digite seu nome");
        nomeCliente = reader.nextLine();

        System.err.println("Por favor, digite seu saldo!");
        saldo = reader.nextDouble();

        System.err.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero + " e seu saldo "+ saldo +" já está disponível para saque");

    }
}
