public class Ternario {
    public static void main(String[] args) {
        /*Operador ternário é uma condição IF, mas de forma resumida

        <Expressão Condicional> ? <Caso seja true> : <Caso seja false>  */

        int a,b;
        a = 5;
        b = 6;

        String resultado = a > b ? "a é maior que b" : "a é menor que b";

        System.err.println(resultado);
    }
}
