public class Unario {
    public static void main(String[] args) {
        /*Junto com outro operador aritmetico, e então podem incrementar, decrementar, inverter valores 
        numéricos e booleanos*/

        int numero = 5;
        boolean resposta = true;
        System.err.println(-numero);    //saída = -5
        System.err.println(+numero);    //saída = 5
        System.err.println(numero++);    //saída = 6

        // Caso o ++ esteja na frente da variável, ele realiza a alteração antes da execução do comando;

        System.err.println(numero--);    //saída = 4
        System.err.println(!resposta);    //saída = false
    }
}
